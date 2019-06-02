package com.example.playfit.dao;

import com.example.playfit.dto.UserDTO;

import java.util.List;

public interface UserDAO {

   List<UserDTO> list();

   public Integer getUserIdbyName(String username);
}
