package com.example.fundmanagement.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/managers")
public class ManagerController {
    private final ManagerService managerService;

    @Autowired
    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }


    @GetMapping
    public List<Manager> getManagers(){
        return managerService.getManagers();
    }

    @GetMapping(path="{managerId}")
    public Manager getManager(@PathVariable("managerId") Integer id){
        return managerService.getManager(id);
    }

    @PostMapping
    public void registerNewManager(@RequestBody Manager manager){
        managerService.addManager(manager);
    }

    @DeleteMapping(path="{managerId}")
    public void deleteManager(@PathVariable("managerId") Integer id){
        managerService.deleteManager(id);
    }

    @PutMapping(path = "{managerId}")
    public void updateManager(@PathVariable Integer managerId, @RequestBody Manager newManager){
        managerService.updateManager(managerId, newManager);
    }
}
