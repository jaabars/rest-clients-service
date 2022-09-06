package com.company;

import java.util.*;

public class MainArrayDynamic {
  public static void main(String[] args) {
    // int[] number = new int[2];
    // System.out.println(number.length);
    // number[0] = 1;
    // System.out.println(number[0]);

    List<Integer> numbers = new ArrayList();
    System.out.println(numbers.size());
    System.out.println("number initial size");
    for (int i=0; i<5; i++){
      numbers.add((int) (Math.random()*100+1));
    }
    System.out.println("Collection before sort");
    numbers.forEach(x-> System.out.println(x));

    Collections.sort(numbers);

    System.out.println("collection after sort");
    for (Integer number : numbers) {
      System.out.println(number);
    }

  }
}
