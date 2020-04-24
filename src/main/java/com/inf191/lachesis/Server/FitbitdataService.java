package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.Fitbitdata;


public interface FitbitdataService {
    int deleteByPrimaryKey(Integer fid);

    int insert(Fitbitdata record);

    int insertSelective(Fitbitdata record);

    Fitbitdata selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Fitbitdata record);

    int updateByPrimaryKey(Fitbitdata record);
}
