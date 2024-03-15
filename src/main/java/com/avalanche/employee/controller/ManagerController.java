package com.avalanche.employee.controller;

import com.avalanche.employee.model.Manager;
import com.avalanche.employee.dto.ManagerDto;
import com.avalanche.employee.repository.ManagerRepository;
import com.avalanche.employee.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/managers")

public class ManagerController {

    @Autowired
    private ManagerRepository repository;

    @Autowired
    private ManagerService managerService;

    @PostMapping("/save")
    public HttpStatus save (@RequestBody ManagerDto manager){
        managerService.save(manager);
        return HttpStatus.OK;
    }

   @PutMapping("/update-manager/{id}")

    public Manager update (@PathVariable Long id, @RequestBody ManagerDto managerDto){

        return managerService.update(id, managerDto );
   }

   @GetMapping("/get-manager/{id}")

    public ManagerDto get (@PathVariable Long id){
        return managerService.get(id);
   }


}
