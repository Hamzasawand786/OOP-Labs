import java.util.Scanner;
public class endsWith {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = input.nextLine();
        if(string.endsWith("World")){
            System.out.println("String ends with world");
        }else{
            System.out.println("String does not end with world");
        }
        input.close();

    }
}
