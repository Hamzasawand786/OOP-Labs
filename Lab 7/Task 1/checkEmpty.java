import java.util.Scanner;
class checkEmpty{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter any String");
    String name = input.nextLine();

    if(name.isEmpty()){
        System.out.println("String is Empty");
    }
    else{
        System.out.println("String is not Empty");
    }
    input.close();
}
}