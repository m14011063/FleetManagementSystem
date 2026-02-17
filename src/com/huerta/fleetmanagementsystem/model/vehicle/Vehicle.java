package com.huerta.fleetmanagementsystem.model.vehicle;

public abstract class Vehicle {
  private long id;
  private String licensePlate;
  private String make;
  private String model;
  private int year;

  public Vehicle() {
  }

  public Vehicle(long id, String licensePlate, String make, String model, int year) {
    this.id = id;
    this.licensePlate = licensePlate;
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
