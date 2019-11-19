class Lab97{
public static void main(String as[]){
int a=12;
int b=10;
int c=a+b;
String str="Sum of" and "+b+"is"+c;
System.out.println(str);
System.out.printf("\nSum of %d and %d is %d. \n",a,b,c);
}
}


D:\CoreJavaLabs\java_programs>javac Lab97.java
Lab97.java:6: error: ';' expected
String str="Sum of" and "+b+"is"+c;
                   ^
Lab97.java:6: error: not a statement
String str="Sum of" and "+b+"is"+c;
                    ^
Lab97.java:6: error: ';' expected
String str="Sum of" and "+b+"is"+c;
                       ^
Lab97.java:6: error: unclosed string literal
String str="Sum of" and "+b+"is"+c;
                               ^
Lab97.java:6: error: not a statement
String str="Sum of" and "+b+"is"+c;
                             ^
5 errors
