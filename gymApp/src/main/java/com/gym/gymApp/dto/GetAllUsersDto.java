package com.gym.gymApp.dto;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUsersDto {

  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private String phone;
  private double weight;
  private double height;
  private double bmi;
  private String bmiResult;
  private String gender;
  private String requireTrainer;
  private String packageName;
  private List<String> important;
  private String haveGymBefore;
  private LocalDate enquiryDate;

}
