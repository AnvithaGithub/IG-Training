package com.java.ig.inheritance;

import static java.lang.System.*;
class Base1
{ int a;
Base1(int a)
{out.println("Base Param constructor...");
this.a=a;
}
void display()
{out.println("a:\t"+a);
}
}
class Child1 extends Base1
{ int b;
Child1(int a,int b)
{ super(a);
this.b=b;
}
void display()
{ super.display();
out.println("b:\t"+b);
}
}
class SubChild extends Child1
{ int c;
SubChild(int a,int b,int c)
{super(a,b);
this.c=c;

}
void display()
{super.display();
out.println("c:\t"+c);
}
}
class MultiLevelInher
{ public static void main(String args[])
{
SubChild sc=new SubChild(100,200,300);
sc.display();
}
}