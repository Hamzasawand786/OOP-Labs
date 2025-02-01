import java.util.Scanner;
class Theater{
public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Number Of Rows: ");
int rows = input.nextInt();
System.out.print("Enter Number of Colomns: ");
int Colomns = input.nextInt();
boolean [][] seats = new boolean [rows][Colomns];
int choice;
do{
System.out.println("Display Available Seats: 1");
System.out.println("Reserve a Seat: 2");
System.out.println("Exit: 3");
System.out.print("Enter Your Choice: ");
choice = input.nextInt();
switch(choice){
case 1:
System.out.println("Available Seats (False means Available, and True Means Reserved ): ");
for(int i = 0; i<rows; i++){
for(int j=0; j<Colomns; j++){
System.out.print(seats[i][j]+ "    ");
}
System.out.println();
}
break;
case 2:
System.out.print("Enter Row Number (0 to " + (rows - 1) + "): ");
int row = input.nextInt();
System.out.print("Enter Column Number (0 to " + (Colomns - 1) + "): ");
int col = input.nextInt();
if(row>=0 && row<rows && col>=0 && col<Colomns){
if (!seats[row][col]){
seats[row][col]=true;
System.out.println("You Have reserved your Seat Successfully");
}else{
System.out.println("This Seat is Already Reserved ");
}
}
break;
case 3:
System.out.println("Exiting The Programe Bye Bye Enjoy! ");
break;
default:
System.out.println("Invalid Choice Plz Enter You Choice between 1 from 3: ");
break;
}
}while(choice!=3);
}
}