class Hello{}

class Lab153{
public static void main(String as[]){
Object obj=new Hello();
System.out.println(obj instanceof String);
System.out.println(obj instanceof Hello);
System.out.println(obj instanceof Object);
}}

D:\CoreJavaLabs\java_programs>java Lab153
false
true
true