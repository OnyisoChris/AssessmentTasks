
// Java program to ReverseString using StringBuilder 

import java.util.*; 

import java.io.*; 

import java.lang.*; 


// Class of Reversing a String 

class String_reverse { 

    public static void main(String[] args) 

    { 

        String input2 = "Lorem at"; 

  

        StringBuilder input1 = new StringBuilder(); 

  

        // appending a string

        input1.append(input1); 

  

        // reverse StringBuilder input2

        input1 = input2.reverse(); 

  

        // print reversed String 

        System.out.println(input1); 

    } 
} 
