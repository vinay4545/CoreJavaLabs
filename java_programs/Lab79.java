class Lab79{
public static void main(String as[]){
final long a=12;
byte b=a;
System.out.println(a);
System.out.println(b);
}
}

D:\CoreJavaLabs\java_programs>javac Lab79.java
Lab79.java:4: error: incompatible types: possible lossy conversion from long to byte
byte b=a;
       ^
1 error