package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.Patients;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PatientsService {
    Patients selectByPrimaryKey(int id);
    List<Patients> selectAllPatients();
    List<Patients> getActivePatietns();
    int updateByPrimaryKey(Patients patients);
    int insert(Patients patients);
    int insertSelective(Patients patients);
    int deleteByPrimaryKey(int id);
    int updateByPrimaryKeySelective(Patients patients);


}
