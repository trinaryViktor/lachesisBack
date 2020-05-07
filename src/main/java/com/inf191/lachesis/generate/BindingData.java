package com.inf191.lachesis.generate;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Data
@Setter
@Getter
public class BindingData implements Serializable {
    private Integer pid;

    private Integer mid;

    private Integer fid;

    private Integer dobyear;

    private Integer dobmonth;

    private Integer dobday;

    private String firstName;

    private String middleName;

    private String lastName;

    private Integer weight;

    private Integer height;

    private Date start;

    private static final long serialVersionUID = 1L;
}
