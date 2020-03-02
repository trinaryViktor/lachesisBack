package com.inf191.lachesis.Controller;

import com.inf191.lachesis.Server.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientsController {
    @Autowired
    private PatientsService patientsService;

    @RequestMapping(value ="/id")
    public String patients(){
        return "look"+patientsService.selectByPrimaryKey(1).toString();
    }
}
