/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam129t2;

import java.lang.*;

public class CharacterDemo {

   public static void main(String[] args) {

      // create 2 char primitives ch1, ch2
      char ch1, ch2;

      // assign values to ch1, ch2
      ch1 = '9';
      ch2 = 'V';

      // create 2 boolean primitives b1, b2
      boolean b1, b2;

      // assign isDigit results of ch1, ch2 to b1, b2
      b1 = Character.isDigit(ch1);
      b2 = Character.isDigit(ch2);

      String str1 = ch1 + " is a digit is " + b1;
      String str2 = ch2 + " is a digit is " + b2;

      // print b1, b2 values
      System.out.println( str1 );
      System.out.println( str2 );
   }
}