package com.inf191.lachesis.Controller;

import com.inf191.lachesis.Server.PatientFitbitServiceImpl;
import com.inf191.lachesis.generate.PatientsFitbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value="/api")
@CrossOrigin
public class PatientsFitbitController {
    @Autowired
    PatientFitbitServiceImpl patientFitbitServiceImpl;

    /**
     * @api {get} /getConnectById={id}         request patient fitbit connect informaiton
     * @apiName getById
     * @apiGroup patientFitbit
     *
     * @apiParam {id} id unique connection ID.
     *
     * @apiSuccess {String} JSON Type information
     * @apiSuccess {String} error 500
     */
    @RequestMapping(method = RequestMethod.GET,value="/getConnectById={id}")
    public PatientsFitbit getById(@PathVariable("id") int id){
        return patientFitbitServiceImpl.selectByPrimaryKey(id);
    }

    /**
     * @api {Post}  /uploadConnectById        upload connect info
     * @apiName uploadConnect
     * @apiGroup patientFitbit
     *
     * Required body Json type
     *
     * @apiSuccess {String} return toString type
     * @apiSuccess {String} error 500
     */
    @RequestMapping(method= RequestMethod.POST, value="/uploadConnectById")
    public String uploadConnect(@RequestBody @Valid PatientsFitbit patientsFitbit){
        patientFitbitServiceImpl.insert(patientsFitbit);
        return patientsFitbit.toString();
    }

    /**
     * @api {post} /updateConnect        update by connection
     * @apiName     updateConnect
     * @apiGroup patientFitbit
     *
     *
     * @apiSuccess {int} integer
     * @apiSuccess {String} error 500
     */
    @RequestMapping(method = RequestMethod.POST, value="/updateConnect")
    public int updateConnect(@RequestBody @Valid PatientsFitbit patientsFitbit){
        return patientFitbitServiceImpl.updateByPrimaryKey(patientsFitbit);
    }

    /**
     * @api {get} /delateConnectById={id}         delate connection informaiton
     * @apiName delatePatientById
     * @apiGroup patientFitbit
     *
     * @apiParam {id} id patients unique ID.
     *
     * @apiSuccess {int} integer
     * @apiSuccess {String} error 500
     */
    @RequestMapping(method = RequestMethod.GET, value = "/delateConnectById={id}")
    public int delateConnectById(@PathVariable("id") int id){
        return patientFitbitServiceImpl.deleteByPrimaryKey(id);
    }
}
