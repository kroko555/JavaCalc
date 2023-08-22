public class Result {
    public static String convert(int in) {
        StringBuffer a = new StringBuffer("");

        int c1 = in / 100;
        a.append(C(c1));
        int c2 = in % 100;
        if (c2==90){
            return "XC";
        }

        int l1 = c2 / 50;
        a.append(L(l1));
        int l2 = c2 % 50;

        int x1 = l2 / 10;
        a.append(X(x1));
        int x2 = l2 % 10;

        a.append(basic(x2));
        return a.toString();
    }

    private static String C(int in) {
        if (in == 4) return "CD"; //если 400, то 500-100
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("C");
                i++;
            }
            return a.toString();
        } else return "";
    }

    private static String X(int in) {
        if (in == 4) return "XL"; // если 40, то 50-10
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("X");
                i++;
            }
            return a.toString();
        } else return "";
    }


    private static String L(int in) {
        if (in == 4) return "XC";
        if (in<1) return "";
        else return"L";
    }

    private static String basic(int in) {
        String[] a = {
                "",
                "I",
                "II",
                "III",
                "IV",
                "V",
                "VI",
                "VII",
                "VIII",
                "IX"
        };
        return a[in];
    }

}
