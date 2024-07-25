package com.gym.gymApp.service;

import com.gym.gymApp.dto.CreateUserDto;
import com.gym.gymApp.dto.GetAllUsersDto;
import com.gym.gymApp.entity.User;
import java.util.List;

public interface UserService {

  void createUser(CreateUserDto createUserDto);

  List<GetAllUsersDto> getAllUser();

}
