package com.inf191.lachesis.generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * patients_fitbit
 * @author 
 */
@Data
@Setter
@Getter
public class PatientsFitbit implements Serializable {

    //primary key match id
    private Integer matchid;

    //patient id
    private Integer pid;

    //fitbit id
    private Integer fid;

    // start date this is a time stamp
    private Date start;

    // finish date this is a time stamp
    private Date finish;

    private static final long serialVersionUID = 1L;
}