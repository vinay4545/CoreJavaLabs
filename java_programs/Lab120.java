class Lab120{
public static void main(String as[]){
int a;
int b=0;
(a=b++)++;
System.out.println(a);
System.out.println(b);
}
}


D:\CoreJavaLabs\java_programs>javac Lab120.java
Lab120.java:5: error: unexpected type
(a=b++)++;
  ^
  required: variable
  found:    value
1 error