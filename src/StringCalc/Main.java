package StringCalc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String Calc(String input) throws CalcException {
        String s1 = null;
        String s2 = null;
        String result = null;
        String [] s3 = input.split("[-+*/]");
        System.out.println(s3[0]);
        System.out.println(s3[1]);
        Pattern p = Pattern.compile("\"([^\"]*)\"");
        Matcher m = p.matcher(s3[0]);
        Matcher m1 = p.matcher(s3[1]);

        while (m.find()) {
            s1 = m.group(1);
        }
        System.out.println(s1);
        if(s1.contains("1") ||s1.contains("2") ||s1.contains("3") ||s1.contains("4") ||s1.contains("5") ||
                s1.contains("6") ||s1.contains("7") ||s1.contains("8") ||s1.contains("9") ||s1.contains("10")){
            throw new CalcException("Первое значение должно быть строкой");
        }
        while (m1.find()) {
            s2 = m1.group(1);
        }
        System.out.println(s2);

        String[] oper = input.split("");
        for(int i = 0;i<input.length();i++){
            if(oper[i].equals("+")){
                StringD.StringChecker(s2);
                result = s1+s2; StringD.ResultChecker(result); System.out.println(result); break;
            }
            if(oper[i].equals("-")){
                StringD.StringChecker(s2);
                result = s1.replace(s2,""); StringD.ResultChecker(result); System.out.println(result); break;
            }
            if(oper[i].equals("*")){
               StringD.ValueChecker(s2);
               int S2 = Integer.parseInt(s2);
               StringD.ValueIntChecker(S2);
               result = s1.repeat(S2); StringD.ResultChecker(result); System.out.println(result); break;
            }
            if(oper[i].equals("/")){
                StringD.ValueChecker(s2);
                int S2 = Integer.parseInt(s2);
                StringD.ValueIntChecker(S2);
                int endInd = s1.length() / S2;
                result = s1.substring(0, endInd-1); StringD.ResultChecker(result); System.out.println(result); break;
            }
        }

        return input;
    }
}
