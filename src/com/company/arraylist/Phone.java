package com.company.arraylist;

public class Phone {
  private String manufacturer;
  private String model;
  private double price;

  public Phone(String manufacturer, String model, double price) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.price = price;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Phone{" +
        "manufacturer='" + manufacturer + '\'' +
        ", model='" + model + '\'' +
        ", price=" + price +
        '}';
  }
}
