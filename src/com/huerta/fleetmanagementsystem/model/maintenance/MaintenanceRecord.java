package com.huerta.fleetmanagementsystem.model.maintenance;

import java.time.LocalDate;

public class MaintenanceRecord {
  private LocalDate date;

  private String type;

  private String description;

  private double cost;

  public MaintenanceRecord(LocalDate date, String type, String description, double cost) {
    this.date = date;
    this.type = type;
    this.description = description;
    this.cost = cost;
  }

  public LocalDate getDate() {
    return date;
  }

  public String getType() {
    return type;
  }

  public String getDescription() {
    return description;
  }

  public double getCost() {
    return cost;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }
}
