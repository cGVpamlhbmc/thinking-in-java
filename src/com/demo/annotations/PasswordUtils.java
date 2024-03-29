package com.demo.annotations;

import java.util.List;

/**
 * Created on 2018/3/19.
 */
public class PasswordUtils {
    @UseCase(id = 47, description = "Password must contains at least one numeric")
    public boolean validationPassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "New password can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
