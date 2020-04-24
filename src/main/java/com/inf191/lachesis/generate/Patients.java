package com.inf191.lachesis.generate;

import java.io.Serializable;
import lombok.Data;

/**
 * patients
 * @author 
 */
@Data
public class Patients implements Serializable {
    private Integer pid;

    private Integer mid;

    private Integer dobyear;

    private Integer dobmonth;

    private Integer dobday;

    private String firstName;

    private String middleName;

    private String lastName;

    private Integer weight;

    private Integer height;

    private static final long serialVersionUID = 1L;
}