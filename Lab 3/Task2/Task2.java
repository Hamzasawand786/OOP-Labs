import java.util.Scanner;
class Task2{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
String text = input.nextLine();
String rev = "";
for(int i=text.length()-1; i>=0; i--){
rev = rev + text.charAt(i);
}
if(rev.equals(text)){
System.out.println("Palindrome");
}
else{
System.out.println("Not a Palindrome");
}
}
}
