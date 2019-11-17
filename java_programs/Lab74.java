class Lab74{
public static void main(String as[]){
byte b1 = 12;
byte b2 = 23;
byte b3 = b1+b2;
System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
}
}


D:\CoreJavaLabs\java_programs>javac Lab74.java
Lab74.java:5: error: incompatible types: possible lossy conversion from int to byte
byte b3 = b1+b2;
            ^
1 error