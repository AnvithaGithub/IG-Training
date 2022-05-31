package com.java.ig.encapsulation;

import static java.lang.System.*;
class One {
	private int a;
    void setA(int x){ 
    	a=x;
    }
   int getA(){
	   return a;
    }
}
class Encapsulation {
	public static void main(String args[]) {
		One o1=new One();
         o1.setA(10);
          int r=o1.getA();
          out.println("Returned Value:\t"+r);
     }
}



