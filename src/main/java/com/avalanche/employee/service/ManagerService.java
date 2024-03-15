package com.avalanche.employee.service;

import com.avalanche.employee.model.Manager;
import com.avalanche.employee.dto.ManagerDto;
import com.avalanche.employee.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    public void save(ManagerDto manager){
        Manager m = new Manager();
        m.setName(manager.getName());
        m.setAge(manager.getAge());
        m.setGender(manager.getGender());
        m.setAddress(manager.getAddress());
        managerRepository.save(m);

    }

    public Manager update (Long id, ManagerDto managerDto){

        Manager allmanager = managerRepository.findById(id).orElseThrow();
        allmanager.setAddress(managerDto.getAddress());
        allmanager = managerRepository.save(allmanager);
        return allmanager;

    }

    public ManagerDto get (Long id){
        Manager manager = managerRepository.findById(id).orElseThrow();

        ManagerDto managerDto = new ManagerDto();

        managerDto.setName(manager.getName());
        managerDto.setAge(manager.getAge());
        managerDto.setGender(manager.getGender());
        managerDto.setAddress(manager.getAddress());
        return managerDto;

    }




}
