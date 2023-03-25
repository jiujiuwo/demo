package org.csits.demo.api.qo;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class LoginQo implements Serializable {

    @NotNull
    private String username;

    @NotNull
    private String password;
}
