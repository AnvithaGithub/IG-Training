

package com.java.ig.inheritance;
import static java.lang.System.*;
//Base class is also called as parent or super class
class Base {
 int a,b;
  Base() {
   out.println("Base Default constructor....");
   a=100;
   b=200;
  }
  void display() {
	  out.println("Base display...");
      out.println("a:\t"+a);
      out.println("b:\t"+b);
   }
}
class Child extends Base {
		int x,y;
		Child(){
			super();
			out.println("Child Default Constructor....");
		      x=1000;
		      y=2000;
		      
		}
		void get() { 
			out.println("Child Instance method..");
		out.println("x:\t"+x);
		out.println("y:\t"+y);
		}
	
}
class SingleLevelInheritance {
	public static void main(String args[]){
       Child c=new Child();
          c.display();
            c.get();
         }
 }




