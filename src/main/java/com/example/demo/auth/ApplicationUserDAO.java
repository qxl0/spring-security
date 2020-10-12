package com.example.demo.auth;

import java.util.Optional;

public interface ApplicationUserDAO {
    public Optional<ApplicationUser> selectApplicationUserByUserName(String username);
}
