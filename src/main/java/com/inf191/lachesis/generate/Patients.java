package com.inf191.lachesis.generate;

import java.io.Serializable;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * patients
 * @author 
 */
@Data
@Setter
@Getter
@AllArgsConstructor
@SuperBuilder
public class Patients implements Serializable{


    //patient id
    private Integer pid;

    //mobile id, this is a string in case of the 0 at the beginning
    private String mid;

    // birth date information
    private Integer dobyear;

    private Integer dobmonth;

    private Integer dobday;

    //patient name
    private String firstName;

    private String middleName;

    private String lastName;

    //weight
    private Integer weight;

    //height
    private Integer height;

    private static final long serialVersionUID = 1L;

    public Patients() {

    }
}