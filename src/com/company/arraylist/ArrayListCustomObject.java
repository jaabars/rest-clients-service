package com.company.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCustomObject {

  public static void main(String[] args) {
    Phone iphone = new Phone("Iphone","11pro",430);
    Phone samsung = new Phone("Samsung", "note21",2100);
    Phone mi = new Phone("Mi","Note 11 pro",900);
    //Phone[] phones = new Phone[3];
    ArrayList<Phone> phoneList = new ArrayList<>();
    phoneList.add(iphone);
    phoneList.add(samsung);
    phoneList.add(mi);

    for (Phone phone: phoneList){
      System.out.println("____________");
      System.out.println(phone.getModel());
      System.out.println(phone.getManufacturer());
      System.out.println(phone.getPrice());
      System.out.println("____________");
    }
  }
}
