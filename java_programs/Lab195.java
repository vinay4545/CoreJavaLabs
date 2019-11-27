class Lab195{
public static void main(String as[]){
int a=5;
char ch='A';
float f=123456.78F;
for(a=5,ch='A',f=123456.78F,str=""; a>=0; a--,ch++,f/=10,str+=ch){
System.out.println(a+"\t"+ch+"+f+"\t"+str);
}}}