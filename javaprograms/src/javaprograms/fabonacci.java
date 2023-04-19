package javaprograms;

class fabonacci{
void m1()
{
int a=0;
int b=1;
System.out.println(a+" "+b);
int c;

for (int i=1;i<=10;i++)                      // i<=10 means 10 times run krna h
{
c=a+b;
System.out.println(" "+c);
a=b;                                         // means (b) ki value (a) mein put hogi 
b=c;                                         // (c) ki value (b) mein put hogi
}

}
public static void main(String[] args){
fabonacci t=new fabonacci();
t.m1();
}
}        

