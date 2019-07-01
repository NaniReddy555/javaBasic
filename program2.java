class simple
{
public static void main(String[]args)
{
int[] a={10,20,30,40,50,60,70};
int[] b={80,90};
a=b; 
b=a;
System.out.println("plz check output once");
System.out.println(b[0]+" "+b[1]);    //80,90
}}
