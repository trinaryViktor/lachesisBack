package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * Accounts
 * @author 
 */
@Data
public class Accounts implements Serializable {
    private Integer account;

    private String username;

    private String hashedpassword;

    private static final long serialVersionUID = 1L;
}