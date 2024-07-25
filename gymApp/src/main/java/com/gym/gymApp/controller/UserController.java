package com.gym.gymApp.controller;


import com.gym.gymApp.dto.CreateUserDto;
import com.gym.gymApp.dto.GetAllUsersDto;
import com.gym.gymApp.service.UserService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
@NoArgsConstructor
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping()
  public List<GetAllUsersDto> getAllUsers(){
    return this.userService.getAllUser();
  }


  @PostMapping()
  public void createUser(@RequestBody CreateUserDto createUserDto){
    this.userService.createUser(createUserDto);
  }

}
