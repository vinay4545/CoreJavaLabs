class Lab110{
public static void main(String as[]){
boolean b=(boolean)1;
String str=(String)99;
int x=(int)"JLC";
System.out.println(b);
System.out.println(str);
System.out.println(x);
}
}


D:\CoreJavaLabs\java_programs>javac Lab110.java
Lab110.java:3: error: incompatible types: int cannot be converted to boolean
boolean b=(boolean)1;
                   ^
Lab110.java:4: error: incompatible types: int cannot be converted to String
String str=(String)99;
                   ^
Lab110.java:5: error: incompatible types: String cannot be converted to int
int x=(int)"JLC";
           ^
3 errors
