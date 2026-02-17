package com.huerta.fleetmanagementsystem.model.person;

public class Driver {
  private String fullName;

  private int yearsOfExperience;

  public Driver(String fullName, int yearsOfExperience) {
    this.fullName = fullName;
    this.yearsOfExperience = yearsOfExperience;
  }

  public String getFullName() {
    return fullName;
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public void setYearsOfExperience(int yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }
}
