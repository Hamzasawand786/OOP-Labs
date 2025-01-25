import java.util.Scanner;
class arr{
public static void main(String[] args){
char [] const_arr={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the Value which you want to search: ");
char user_inp = scanner.next().charAt(0);
boolean check = false;
for(int i = 0; i<const_arr.length; i++){
if(user_inp == const_arr[i]){
check = true;
break;
}
}
if(check){
System.out.print("Consonants!");
}
else{
System.out.println("Not a Consonant");
}
scanner.close();
}
}



