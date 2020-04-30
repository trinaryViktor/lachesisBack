package com.inf191.lachesis.generate;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientsFitbitDao {
    int deleteByPrimaryKey(Integer matchid);

    int insert(PatientsFitbit record);

    int insertSelective(PatientsFitbit record);

    List<PatientsFitbit> selectActiveId();

    PatientsFitbit selectByPrimaryKey(Integer matchid);

    int updateByPrimaryKeySelective(PatientsFitbit record);

    int updateByPrimaryKey(PatientsFitbit record);
}