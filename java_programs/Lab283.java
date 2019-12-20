class Lab283{
public static void main(String as[]){
int arr[][]=null;
arr=new int[3][];
int tmp[]={99,88,77,66,55};
System.out.println("L:"+arr.length);
arr[0]=new int[4];
arr[1]=new int[]{10,30,20};
arr[2]=tmp;
for(int ar[]:arr){
for(int a:ar)
System.out.print("\t"+a);
System.out.println();
}
}}