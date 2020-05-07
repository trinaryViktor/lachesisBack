package com.inf191.lachesis.generate;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientsDao {
    int deleteByPrimaryKey(Integer pid);


    List<Patients> selectAllPatients();

    int insert(Patients record);

    int insertSelective(Patients record);

    Patients selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Patients record);

    int updateByPrimaryKey(Patients record);

    List<Patients> getActivePatietns();
}