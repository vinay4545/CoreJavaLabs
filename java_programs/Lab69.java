class Lab69{
public static void main(String as[]){
byte a= 19;
byte b= +a;
byte c= -a;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}

Lab69.java:4: error: incompatible types: possible lossy conversion from int to byte
byte b= +a;
        ^
Lab69.java:5: error: incompatible types: possible lossy conversion from int to byte
byte c= -a;
        ^
2 errors