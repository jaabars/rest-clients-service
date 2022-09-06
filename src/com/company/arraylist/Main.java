package com.company.arraylist;


import java.util.ArrayList;
import java.util.List;

public class Main {


  public static void main(String[] args) {


    // 1,2, 243, 2 ,54,65,55,43, 2
    //посчитайте в списке сколько раз встречается число 2
   /* String[] students = new String[10];
    students[0] = "Test1";
    students[1] = "Test1";
    students[2] = "Test1";
    students[3] = "Test1";
    students[4] = "Test1";
    students[5] = "Test1";
    students[6] = "Test1";
    students[7] = "Test1";
    students[8] = "Test1";
    students[9] = "Test1";
    System.out.println(Arrays.toString(students));
    String[] studentNew = new String[11];
    for (int i = 0; i < students.length; i++) {
      studentNew[i] = students[i];
    }
    studentNew[10] = "Test11";
    System.out.println("After new length");
    System.out.println(Arrays.toString(studentNew));*/

    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(243);
    numbers.add(2);
    numbers.add(54);
    numbers.add(65);
    numbers.add(55);
    numbers.add(2);
    int countOfNumber = 0;
   /* for (Integer number : numbers){
      if (number==2){
        ++countOfNumber;
      }
    }*/

    for (int i = 0; i< numbers.size(); i++){
      System.out.println(numbers.get(i));
      if (numbers.get(i)==2){
        ++countOfNumber;
      }
    }
    System.out.println(countOfNumber);

    System.out.println("index of 55 ->"+ numbers.indexOf(55));
  }
}
