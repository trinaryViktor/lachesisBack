package com.inf191.lachesis.generate;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * patients
 * @author 
 */
@Data
@Setter
@Getter

public class Patients implements Serializable {
    @Setter(AccessLevel.NONE)
    private Integer pid;

    private Integer mid;

    private Integer dobyear;
    @Max(value=12)
    @Min(value=1)
    private Integer dobmonth;

    @Max(value=31)
    @Min(value=1)
    private Integer dobday;

    private String firstName;

    private String middleName;

    private String lastName;

    private Integer weight;

    private Integer height;

    private String location;

    private static final long serialVersionUID = 1L;
}