class Lab286{
public static void main(String as[]){
Customer c1=new Customer();
c1.show();
Customer c2=new Customer();
c2.cid=99;
c2.cname="Sri";
c2.phone=65799999;
c2.show();
}}
class Customer{
int cid;
String cname;
long phone;
void show(){
System.out.println(cid);
System.out.println(cname);
System.out.println(phone);
}}