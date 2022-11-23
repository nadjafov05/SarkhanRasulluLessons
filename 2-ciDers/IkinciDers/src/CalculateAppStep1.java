import java.util.Scanner;

public class CalculateAppStep1 {
    public static void calculateApp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a`ni daxil edin: ");
        double a = sc.nextDouble();
        System.out.println("b`ni daxil edin: ");
        double b = sc.nextDouble();

        double netice=0;

        System.out.println("emeliyyati secin: " +
                "\n 1: toplama" +
                "\n 2: cixma" +
                "\n 3: vurma" +
                "\n 4: bolme");
        int emeliyyat = sc.nextInt();

        if (emeliyyat == 1){
            netice = a + b;
        }else if (emeliyyat == 2){
            netice = a - b;
        }else if (emeliyyat == 3){
            netice = a * b;
        }else if (emeliyyat == 4){
            netice = a / b;
        }
        System.out.println("Netice: " + netice);
    }
}
