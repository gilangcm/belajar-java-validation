package programmerzamannow.validation.service;

import jakarta.validation.constraints.NotBlank;
import programmerzamannow.validation.constraint.CheckPasswordParameter;

public class UserService {

    @CheckPasswordParameter(
            passwordParam = 1,
            retypePasswordParam = 2
    )
    public void register(@NotBlank(message = "username cannot blank") String username,
                         @NotBlank(message = "password cannot blank") String password,
                         @NotBlank(message = "retype password cannot blank") String retypePassword){
        // TODO register
    }
}
