class Lab159{
public static void main(String as[]){
int a=10;
int b=23;
int c=12;
int max=(a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
System.out.println(max);
}}