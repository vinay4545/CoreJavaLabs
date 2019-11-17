class Lab83{
public static void main(String as[]){
System.out.println(12 / 0);
System.out.println(0 / 0);
}
}

D:\CoreJavaLabs\java_programs>java Lab83
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Lab83.main(Lab83.java:3)