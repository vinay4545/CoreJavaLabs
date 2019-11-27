class Hell0{}

class Lab134{
public static void main(String as[]){
String str=null;
Hello h=null;
System.out.println(h==str);
}}


D:\CoreJavaLabs\java_programs>javac Lab134.java
.\Hello.java:3: error: ';' expected
{system.out.println("hello")
                            ^
Lab134.java:7: error: incomparable types: Hello and String
System.out.println(h==str);
                    ^
.\Hello.java:2: error: missing method body, or declare abstract
public static void main(String a []);
                   ^
.\Hello.java:3: error: package system does not exist
{system.out.println("hello")
       ^
4 errors