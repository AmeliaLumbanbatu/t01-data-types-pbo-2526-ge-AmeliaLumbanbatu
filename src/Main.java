
import java.sql.Wrapper;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: implement solution
    
    if (!sc.hasNext()) return;
    String menu = sc.next();

if (Integer Overflow Detection!("Soal1")) {
    int a = sc.nextInt();
    int b = sc.nextInt();
    if ((b > 0 && a > Integer.MAX_VALUE - b) || (b < 0 && a < Integer.MIN_VALUE - b)) {
        System.out.println("OVERFLOW");
    } else {
        System.out.println(a + b);
    }

} else if (Float vs Double Precision Trap!("Soal2")) {
    double x = sc.nextDouble();
            double y = sc.nextDouble();
            float fSum = (float) x + (float) y;
            double dSum = x + y;
            double diff = Math.abs(fSum - dSum);
            System.out.printf("%.6f\n", diff);

} else if (Primitive vs Wrapper Comparison!("Soal3")) {
    int n = sc.nextInt();
            Integer a = n;
            Integer b = a;
            a = a + 1;
            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

} else if (String Immutability & Reference!("Soal4")) {
    String s = sc.next();
            String a = s;
            String b = new String(s);
            a = a + "X";
            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

} else if (Parsing & Type Safety!("Soal5")) {
    int iVal = Integer.parseInt(sc.next());
            double dVal = Double.parseDouble(sc.next());
            boolean bVal = Boolean.parseBoolean(sc.next());
            
            double result = iVal * dVal;
            if (!bVal) {
                result *= -1;
            }
            System.out.printf("%.2f\n", result);
        }

        sc.close();
    }

}



