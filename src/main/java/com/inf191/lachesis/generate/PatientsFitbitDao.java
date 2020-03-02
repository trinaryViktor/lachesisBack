package com.inf191.lachesis.generate;

public interface PatientsFitbitDao {
    int deleteByPrimaryKey(Integer matchid);

    int insert(PatientsFitbit record);

    int insertSelective(PatientsFitbit record);

    PatientsFitbit selectByPrimaryKey(Integer matchid);

    int updateByPrimaryKeySelective(PatientsFitbit record);

    int updateByPrimaryKey(PatientsFitbit record);
}