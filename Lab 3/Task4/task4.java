class task4{
public static void main(String [] args){
int [] arr = new int [10];
int i = 0;
int j = 1;
do{
arr[i]=j * j;
j++;
i++;
}while(i<arr.length);
arr[9] = 0;
System.out.println("Array ELements According to Problem ");
for(int a = 0; a<arr.length; a++){
System.out.print(arr[a]+" ");
}
System.out.println();
int sum = 0;
i=0;
while(i<arr.length){
if(arr[i] == 81){
break;
}
if(arr[i]%2!=0){
sum+=arr[i];

}
i++;
}
System.out.println("Sum of all Odd Numbers (Except 81) from this Array: "+ sum);
}}