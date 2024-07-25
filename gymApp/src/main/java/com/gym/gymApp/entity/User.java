package com.gym.gymApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "\"user\"")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private Long id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;
  private String email;
  private String phone;
  private double weight;
  private double height;
  private double bmi;
  @Column(name = "bmi_result")
  private String bmiResult;
  private String gender;
  @Column(name = "require_trainer")
  private String requireTrainer;
  private String packageName;
  private List<String> important;
  @Column(name = "have_gym_before")
  private String haveGymBefore;

  @Column(name = "enquiry_date")
  private LocalDate enquiryDate;

}
