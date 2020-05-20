package com.inf191.lachesis.generate;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface LocationdataDao {
    int deleteByPrimaryKey(Integer locationid);

    int insert(Locationdata record);

    int insertSelective(Locationdata record);

    Locationdata selectByPrimaryKey(Integer locationid);

    int updateByPrimaryKeySelective(Locationdata record);

    int updateByPrimaryKey(Locationdata record);

}