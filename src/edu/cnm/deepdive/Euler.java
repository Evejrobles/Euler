package edu.cnm.deepdive;

public class Euler {


  public static void main(String[] args) {
    long sum = 0;

    for (long i = 1; i < 1000; i++) {

      if (i % 3 == 0) {
        sum += i;

      } else if (i % 5 == 0) {
        sum += i;

      }


      }

      System.out.println(sum);


    }
  }
