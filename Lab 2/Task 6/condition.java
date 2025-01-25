import java.util.Scanner;
class condition{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Age: ");
int num = input.nextInt();
System.out.print((num <= 18)? "Yes Eligible for Voting" : "Not Eligible for voting ");
}
}