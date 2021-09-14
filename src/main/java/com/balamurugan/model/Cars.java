package com.balamurugan.model;

import java.util.Objects;

public class Cars {
  private int carID;
  private String carName;
  private double carPrice;

  public Cars() {}

  public Cars(int carID, String carName, double carPrice) {
    this.carID = carID;
    this.carName = carName;
    this.carPrice = carPrice;
  }

  public int getCarID() {
    return carID;
  }
  public void setCarID(int carID) {
    this.carID = carID;
  }


  public String getCarName() {
    return this.carName;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  public double getCarPrice() {
    return this.carPrice;
  }

  public void setCarPrice(double carPrice) {
    this.carPrice = carPrice;
  }

  @Override
  public String toString() {
    return "Cars[" + "carID : " + this.carID 
            + " car name : " + this.carName
            + " car price : " + this.carPrice + "]";
  }


  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cars)) {
            return false;
        }
        Cars cars = (Cars) o;
        return carID == cars.carID && Objects.equals(carName, cars.carName) && carPrice == cars.carPrice;
  }

  @Override
  public int hashCode() {
    return Objects.hash(carID, carName, carPrice);
  }

}
