package com.gym.gymApp.service.impl;

import com.gym.gymApp.dto.CreateUserDto;
import com.gym.gymApp.dto.GetAllUsersDto;
import com.gym.gymApp.entity.User;
import com.gym.gymApp.mapper.user.DtoToObject;
import com.gym.gymApp.repository.UserRepository;
import com.gym.gymApp.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class UserServiceImpl  implements UserService {

  private UserRepository userRepository;


  @Override
  public void createUser(CreateUserDto createUserDto) {
    this.userRepository.save(DtoToObject.createMapper(createUserDto));
  }

  @Override
  public List<GetAllUsersDto> getAllUser() {
    List<User> users = userRepository.findAll();
    return users.stream()
        .map(DtoToObject::getAllMapper)
        .collect(Collectors.toList());
  }
}
