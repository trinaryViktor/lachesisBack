package com.inf191.lachesis.generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * fitbitData
 * @author 
 */
@Data
@Setter
@Getter
public class Fitbitdata implements Serializable {
    private Integer fid;

    private Integer heartRate;

    private Date time;

    private static final long serialVersionUID = 1L;
}