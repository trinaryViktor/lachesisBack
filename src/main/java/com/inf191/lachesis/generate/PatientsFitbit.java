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
    private Integer matchid;

    private Integer pid;

    private Integer fid;

    private Date start;

    private Date finish;

    private static final long serialVersionUID = 1L;
}