package com.inf191.lachesis.Server;

import com.inf191.lachesis.generate.Fitbitdata;
import com.inf191.lachesis.generate.Locationdata;
import org.springframework.beans.factory.annotation.Autowired;

public interface LocatindataService {
    int deleteByPrimaryKey(Integer LocationId);

    int insert(Locationdata record);

    int insertSelective(Locationdata record);

    Locationdata selectByPrimaryKey(Integer LocationId);

    int updateByPrimaryKeySelective(Locationdata record);

    int updateByPrimaryKey(Locationdata record);
}
