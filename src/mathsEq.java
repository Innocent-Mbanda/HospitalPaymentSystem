import java.util.Scanner;

public class mathsEq {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("enter inputs");

        int userEntries = sn.nextInt();

        int result = userEntries*userEntries;

        System.out.println(result);


    }
}
