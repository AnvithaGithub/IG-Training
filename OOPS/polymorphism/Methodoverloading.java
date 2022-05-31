package com.java.ig.polymorphism;


import static java.lang.System.*;
class Calculation {

   int add(int a,int b) {
	   
        return a+b;
    }
   int add(int a,int b,int c) {
         return a+b+c;
    }
   float add(int a,float b) {
         return a+b;
     }
   float add(float a,int b) {
	   
          return a+b;
      }
}
class MethodOverloading {
	

     public static void main(String args[]) {
          Calculation obj=new Calculation();
            float s1=obj.add(10,20.50f);
              int s2=obj.add(10,20,30);
               float s3=obj.add(10.50f,20);
                  int s4=obj.add(10,20);
                  out.println("s1:\t"+s1);
                  out.println("s2:\t"+s2);
                  out.println("s3:\t"+s3);
                  out.println("s4:\t"+s4);
           }
}

