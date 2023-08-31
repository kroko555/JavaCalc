import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) throws CalcException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter expression ");
        String Exp = scan.nextLine();
        Main.calc(Exp);
        scan.close();
    }
}
