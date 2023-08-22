import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) throws InputMismatchException {
        String Exp;
        int num1 = 0;
        int num2 = 0;
        char op = 0;
        int result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter expression ");
        Exp = scan.nextLine();
        String[] exp = Exp.split("[-+*/]"); //разделение num1 num2
        String[] oper = Exp.split("");

        for(int i=0;i<exp.length;i++){
            if(Exp.contains("I") || Exp.contains("V") || Exp.contains("X")){
                switch (exp[1]){
                    case "I": num2 = 1; break;
                    case "II" : num2 = 2; break;
                    case "III" : num2 = 3; break;
                    case "IV" : num2 = 4; break;
                    case "V" : num2 = 5; break;
                    case "VI" : num2 = 6; break;
                    case "VII" : num2 = 7; break;
                    case "VIII" : num2 = 8; break;
                    case "IX" : num2 = 9; break;
                    case "X" : num2 = 10; break;
                    default: System.out.println("Значение вышло за границы допустимых (I-X) или вы ввели разные числа (3+II)"); return;
                }
                switch (exp[0]){
                    case "I": num1 = 1; break;
                    case "II" : num1 = 2; break;
                    case "III" : num1 = 3; break;
                    case "IV" : num1 = 4; break;
                    case "V" : num1 = 5; break;
                    case "VI" : num1 = 6; break;
                    case "VII" : num1 = 7; break;
                    case "VIII" : num1 = 8; break;
                    case "IX" : num1 = 9; break;
                    case "X" : num1 = 10; break;
                    default: System.out.println("Значение вышло за границы допустимых (I-X) или вы ввели разные числа (3+II)"); return;
                }
            } else{
                num1 = Integer.parseInt(exp[0]);
                num2 = Integer.parseInt(exp[1]);
            }
        }
        if(num1>10 || num2>10){
            System.out.println("Значение вышло за границы допустимых (0-10)");
            return;
        }


        for(int i = 0;i<Exp.length();i++){

            if(oper[i].equals("+")){
                result=num1+num2; System.out.println(result); break;
            }
            else if(oper[i].equals("-")){
                result=num1-num2; System.out.println(result); break;
            }
            else if(oper[i].equals("*")){
                result=num1*num2; System.out.println(result); break;
            }
            else if(oper[i].equals("/")){
                result=num1/num2; System.out.println(result); break;
            }
        }
        if(Exp.contains("I") || Exp.contains("V") || Exp.contains("X")){

            System.out.println("Ваш результат в римских числах: "+ Result.convert(result));
        }



        //char[][] a1 = new char[exp.length][];
        //for (int i=0;i<exp.length;i++){
        //    a1[i]=exp[i].toCharArray();
        //}
        //System.out.println(a1[1]);
        //int total = 9;
        //char[] allchar = new char[total];
        //int counter = 0;
        //for(int i=0;i<a1.length;i++){
        //    for(int j=0;j<a1[i].length;j++){
        //        allchar[counter++]=a1[i][j];
        //    }
        //}
        //System.out.println(allchar[1]);
        //System.out.println(allchar[0]);
        //op=allchar[1];
        //num1=allchar[0];
        //num2=allchar[2];
        //int n1=num1-'0';
        //int n2=num2-'0';
        //switch(op){
        //    case '+':
        //        result = n1 + n2;
        //        break;
        //    case '-':
        //        result = n1 - n2;
        //        break;
        //    case '*':
        //        result = n1 * n2;
        //        break;
        //    case '/':
        //        result = n1 / n2;
        //        break;
//
  //      }
    //    System.out.println(result);


        scan.close();
    }
}
