class Lab70{
public static void main(String as[]){
char ch1='A';
char ch2=+ch1;
System.out.println(ch1);
System.out.println(ch2);
}
}


D:\CoreJavaLabs\java_programs>javac Lab70.java
Lab70.java:4: error: incompatible types: possible lossy conversion from int to char
char ch2=+ch1;
         ^
1 error
