package edu.uqu.cs;
import java.util.Scanner;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
public static void twisters(){
    for(int i=1;i<=110;i++){
        
        if(i%2==0){
            System.out.print("Tweetle");
         if(i%4==0){
            System.out.print("Beetle");
        } if(i%6==0){
            System.out.print("Poodle");
        }
        }
        else 
        {System.out.print(" "+i+" ");}
        if(i%11==0){
            System.out.println("");
        }
    }
}

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
public static void phoneKeypad(String str){
    String result="";
    str= str.toUpperCase();
   
        for(int i=0;i<str.length()-1;i++){
        
    switch(str.charAt(i)){
        case 'A':result+="2";
        break;
        case 'B':result+="2";
        break;
        case 'C':result+="2";
        break;
        case 'D':result+="3";
        break;
        case 'E':result+="3";
        break;
        case 'F':result+="3";
        break;
        case 'G':result+="4";
        break;
        case 'H':result+="4";
        break;
        case 'I':result+="4";
        break;
        case 'J':result+="5";
        break;
        case 'K':result+="5";
        break;
        case 'L':result+="5";
        break;
        case 'M':result+="6";
        break;
        case 'N':result+="6";
        break;
        case 'O':result+="6";
        break;
        case 'P':result+="7";
        break;
        case 'Q':result+="7";
        break;
        case 'R':result+="7";
        break;
        case 'S':result+="7";
        break;
        case 'T':result+="8";
        break;
        case 'U':result+="8";
        break;
        case 'V':result+="8";
        break;
        case 'W':result+="9";
        break;
        case 'X':result+="9";
        break;
        case 'Y':result+="9";
        break;
        case 'Z':result+="9";
        break;
    }
        }
        System.out.println(result);
}
 
    public static void main(String [] args) {
        
     Scanner scnr=new Scanner(System.in);
        /* Write your code here */
          twisters();
       //call method twisters()
       System.out.println(" Enter a string:");
       String str=scnr.nextLine();
       //prompt user to enter a string 

       phoneKeypad(str);
       //call method phoneKeypad(string)


    }

}
