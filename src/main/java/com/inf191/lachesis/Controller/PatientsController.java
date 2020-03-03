package com.inf191.lachesis.Controller;

import com.inf191.lachesis.Server.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientsController {
    @Autowired
    private PatientsService patientsService;

    @RequestMapping(value ="/{id}")
    public String patients(@PathVariable ("id") int id){
        return "look"+patientsService.selectByPrimaryKey(id).toString();
    }
}
