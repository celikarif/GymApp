package com.gym.gymApp.mapper.user;

import com.gym.gymApp.dto.CreateUserDto;
import com.gym.gymApp.dto.GetAllUsersDto;
import com.gym.gymApp.entity.User;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class DtoToObject {
  public static User createMapper(CreateUserDto createUserDto){
    User user = new User();
    user.setFirstName(createUserDto.getFirstName());
    user.setLastName(createUserDto.getLastName());
    user.setEmail(createUserDto.getEmail());
    user.setPhone(createUserDto.getPhone());
    user.setWeight(createUserDto.getWeight());
    user.setHeight(createUserDto.getHeight());
    user.setBmi(createUserDto.getBmi());
    user.setBmiResult(createUserDto.getBmiResult());
    user.setGender(createUserDto.getGender());
    user.setRequireTrainer(createUserDto.getRequireTrainer());
    user.setPackageName(createUserDto.getPackageName());
    user.setImportant(createUserDto.getImportant());
    user.setHaveGymBefore(createUserDto.getHaveGymBefore());
    user.setEnquiryDate(createUserDto.getEnquiryDate());

    return user;
  }
  public static GetAllUsersDto  getAllMapper(User user){
    GetAllUsersDto dto = new GetAllUsersDto();
    dto.setId(user.getId());
    dto.setFirstName(user.getFirstName());
    dto.setLastName(user.getLastName());
    dto.setEmail(user.getEmail());
    dto.setPhone(user.getPhone());
    dto.setWeight(user.getWeight());
    dto.setHeight(user.getHeight());
    dto.setBmi(user.getBmi());
    dto.setBmiResult(user.getBmiResult());
    dto.setGender(user.getGender());
    dto.setRequireTrainer(user.getRequireTrainer());
    dto.setPackageName(user.getPackageName());
    dto.setImportant(user.getImportant());
    dto.setHaveGymBefore(user.getHaveGymBefore());
    dto.setEnquiryDate(user.getEnquiryDate());
    return dto;
  }
  }

