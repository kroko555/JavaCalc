public class Main {
    public static String calc(String input){
        int num1 = 0;
        int num2 = 0;
        char op = 0;
        int result = 0;
        String[] exp = input.split("[-+*/]"); //разделение num1 num2
        for(int i = 0;i< exp.length;i++){
            if(i>1){
                System.out.println("Вы ввели больше одного оператора (+-*/)");
                return input;
            }
        }
        String[] oper = input.split("");

        for(int i=0;i<exp.length;i++){
            if(input.contains("I") || input.contains("V") || input.contains("X")){
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
                    default: System.out.println("Значение вышло за границы допустимых (I-X) или вы ввели разные числа (3+II)"); return input;
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
                    default: System.out.println("Значение вышло за границы допустимых (I-X) или вы ввели разные числа (3+II)"); return input;
                }
            } else{
                num1 = Integer.parseInt(exp[0]);
                num2 = Integer.parseInt(exp[1]);
            }
        }
        if(num1>10 || num2>10){
            System.out.println("Значение вышло за границы допустимых (0-10)");
            return input;
        }


        for(int i = 0;i<input.length();i++){

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
        if(input.contains("I") || input.contains("V") || input.contains("X")){

            System.out.println("Ваш результат в римских числах: "+ Result.convert(result));
        }
        return input;
    }
}
