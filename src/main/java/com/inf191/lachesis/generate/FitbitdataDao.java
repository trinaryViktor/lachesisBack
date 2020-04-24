package com.inf191.lachesis.generate;

import org.springframework.stereotype.Service;

@Service
public interface FitbitdataDao {
    int deleteByPrimaryKey(Integer heardataid);

    int insert(Fitbitdata record);

    int insertSelective(Fitbitdata record);

    Fitbitdata selectByPrimaryKey(Integer heardataid);

    int updateByPrimaryKeySelective(Fitbitdata record);

    int updateByPrimaryKey(Fitbitdata record);
}