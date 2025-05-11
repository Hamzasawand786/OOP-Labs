import java.util.Scanner;
public class task8 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Strings: ");
        String string = input.nextLine();

        String[] word = string.split(" ");
        System.out.println("Words in String: ");
        for (int i= 0; i<word.length; i++){
            System.out.println(word[i]);
        }
        System.out.println("Total Number of words: " + word.length);
        input.close();
    }
}
