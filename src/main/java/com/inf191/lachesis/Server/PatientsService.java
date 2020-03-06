package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.Patients;


public interface PatientsService {
    Patients selectByPrimaryKey(int id);
    int updateByPrimaryKey(Patients patients);
    int insert(Patients patients);
}
