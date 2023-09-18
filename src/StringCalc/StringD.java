package StringCalc;

public class StringD {
    public static String StringChecker(String str) throws CalcException {
        if (str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4") || str.contains("5") ||
                str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9") || str.contains("10")) {
            throw new CalcException("Второе значение должно быть строкой");
        }
        return str;
    }

    public static String ResultChecker(String str) {
        if (str.length() > 40) {
            String str2 = str.substring(0, 39);
            System.out.println(str2+"...");
            System.exit(0);
        }
        return str;
    }

    public static String ValueStringChecker(String str) throws CalcException {
        if (str.length() > 10) {
            throw new CalcException("Длина строки не должна выходить за границы кол-ва символов(0-10)");
        }
        return str;
    }

    public static Integer ValueIntChecker(int in) throws CalcException {
        if (in > 10) {
            throw new CalcException("Значение не должно выходить за границы(0-10)");
        }
        return in;
    }

    public static String ValueChecker(String str) throws CalcException {
        if (str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4") || str.contains("5") ||
                str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9") || str.contains("10")) {
            return str;
        } else {
            throw new CalcException("Второе значение должно быть цифрой");
        }

    }
}