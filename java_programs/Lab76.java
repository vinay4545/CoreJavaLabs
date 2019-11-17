class Lab76{
public static void main(String as[]){
int a=123;
byte b=a;
System.out.println(a);
System.out.println(b);
}
}


D:\CoreJavaLabs\java_programs>javac Lab76.java
Lab76.java:4: error: incompatible types: possible lossy conversion from int to byte
byte b=a;
       ^
1 error