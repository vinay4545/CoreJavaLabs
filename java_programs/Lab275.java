class Lab275{
public static void main(String as[]){
if(as.length>=2){
String str1=as[0];
String str2=as[1];
System.out.println(str1+str2);
int a=Integer.parselnt(str1);
int b=Integer.parselnt(str2);
System.out.println(a+b);
}
else{
System.out.println("Enter two int values as CLA");
}}}