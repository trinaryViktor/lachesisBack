package com.inf191.lachesis.generate;


public interface PatientsDao {
    int deleteByPrimaryKey(Integer pid);

    int insert(Patients record);

    int insertSelective(Patients record);

    Patients selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Patients record);

    int updateByPrimaryKey(Patients record);
}