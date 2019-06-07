//Submitted by: Laura Neff

public class GCD {
    public static void main(String[] args) {
        String num1String = args[0];
        String num2String = args[1];
        int num1 = Integer.parseInt(num1String);
        int num2 = Integer.parseInt(num2String);
        int r;
        do {
            r = (num1 % num2);
            int d = (num1/num2);
            System.out.println(num1 + " = " + d + " * " + num2 + " + " + r);
            num1 = num2;
            num2 = r;


        } while (r != 0);
        System.out.println("gcd = " + num1);


    }

    }

