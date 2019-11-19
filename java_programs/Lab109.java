class Lab109{
public static void main(String as[]){
boolean b=1;
String str=99;
int x="JLC";
System.out.println(b);
System.out.println(str);
System.out.println(x);
}
}


D:\CoreJavaLabs\java_programs>javac Lab109.java
Lab109.java:3: error: incompatible types: int cannot be converted to boolean
boolean b=1;
          ^
Lab109.java:4: error: incompatible types: int cannot be converted to String
String str=99;
           ^
Lab109.java:5: error: incompatible types: String cannot be converted to int
int x="JLC";
      ^
3 errors