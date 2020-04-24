package com.inf191.lachesis.generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * locationData
 * @author 
 */
@Data
@Setter
@Getter

public class Locationdata implements Serializable {
    private Integer locationid;

    private Integer mid;

    private String location;

    private Date time;

    private static final long serialVersionUID = 1L;
}