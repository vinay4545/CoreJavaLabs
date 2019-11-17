class Lab45{
public static void main(String as[]){
byte b=127;   
short s=32767;
long a=2147483648L;
int i=2147483647;
}
}



// D:\CoreJavaLabs\java_programs>javac Lab45.java
// Lab45.java:5: error: integer number too large: 2147483648
// int i=2147483648;
//      ^
// Lab45.java:6: error: integer number too large: 2147483648
// long a=2147483648;
//      ^
// 2 errors