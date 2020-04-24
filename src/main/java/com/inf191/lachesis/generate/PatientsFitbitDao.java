package com.inf191.lachesis.generate;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public interface PatientsFitbitDao {
    int deleteByPrimaryKey(Integer matchid);

    int insert(PatientsFitbit record);

    int insertSelective(PatientsFitbit record);

    PatientsFitbit selectByPrimaryKey(Integer matchid);

    int updateByPrimaryKeySelective(PatientsFitbit record);

    int updateByPrimaryKey(PatientsFitbit record);
}