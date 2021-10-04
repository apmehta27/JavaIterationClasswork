package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // slide-24
        /*int random = (int)(Math.random() * 101);
        System.out.println(random);
        Scanner input = new Scanner(System.in);

        int userNumber = 0;
           while (random != userNumber) {
               System.out.println("Please enter a number bet 1 to 100");
               userNumber = input.nextInt();

               if (random > userNumber) {
                   System.out.println(("guess number is lower then random number"));
               } else if (random < userNumber) {
                   System.out.println(("guess number is higher then random number"));
               }


               if (random == userNumber) {
                   System.out.println("you did it");
               }

               Slide : 51 Print a multiplication table
           }
             for (int i = 1; i < 13; i++) {
                 for (int j = 1; j < 13; j++) {
//                     System.out.printf("%5d",i*j);
                        System.out.print("\t"+"\t"+i*j);

                 }
                 System.out.println();
             }
             Slide 53 : Predicting future tution

           double tution = 10000.0;
           double newtution = 0;
           int year = 0;
           while (tution <= 20000){
               tution =  tution + tution * 0.07;
            //   newtution = newtution + tution;
               year++;
               System.out.printf("The tution in " + year + " years is" +"%.2f\n",tution);
           }
        System.out.println("Tuition will be doubled in "+year+" years");
        System.out.printf("Tuition will be $%.2f in %1d years",tution,year);

        Problem : Write a program that prints the Fibonacci Sequence from 0 to 50. The following output
       will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
        Fibonacci Sequence

        int n1 = 0,n2 = 1,n3,count = 10;

        for(int i=1; i <= count; i++){
            System.out.print(n1+" ");
            n3 = n2+n1;
//            System.out.println(n3+" ");
            n1=n2;
            n2=n3;

        }
        Problem : Write a program that returns all the available palindromes within 10 and 200.
        The following output will be produced:
         11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,
         */
         boolean result =false;
         String x;
         for (int i = 10 ;i<= 200; i++){
             x = String.valueOf(i);
             if(x.length()==2){
                 result= x.charAt(0) == x.charAt(1);
             }
             if(x.length()==3) {
                 result = x.charAt(0) == x.charAt(2);
             }
             if(result){
                 System.out.print(x+ " ");
             }
         }








    }
}


