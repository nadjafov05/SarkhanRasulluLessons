public class Main {
    //main methodu: burada biz kodlarimici yazib,run edirik.
    public static void main(String[] args) {
        //int tipi: tam eded tipidir
        int a = 4;
        int b = 7;

        // + toplama operatorudur
        int z = a + b;
        System.out.println(z);

        //- cixma operatorudur
        int c = a - b;
        System.out.println(c);

        // * vurma operatoru
        int v = a * b;
        System.out.println(v);

        // double: bolme operatorudur
        // double deyilende java`da kesir deyilir.

        double t = 18;
        double u = 5;
        double bolme = t / u;
        System.out.println(bolme);


        //char: symvol tipidir
        //char tipinde 1 herf qebul olunur ve bir dirnaq arasinda yazilir.

        char y = 's';
        System.out.println(y);


        //String tipi: symvollar toplusudur, iki dirnaq arasinda yazilir,istediyimiz qeder soz yaza bilerik.
        String soz = "salam";
        System.out.println(soz);


        //Boolean: true(he) veya false(yox) saxlayir ozunde, misal corek var? true(he) yada false(yox) deye bilerik.
        boolean b1 = true;
        System.out.println(b1);

        //println bize ekrana capa vermeyimiz ucun lazimdir.
        System.out.println("hello world");
    }


    //jre- Java Runtime Enviroment: programin iwe dusmesi ucun lazimdir,yazdigimiz kodlarin neticesin gormemiz ucun,yeni proyekti run etmek ucunde jre lazimdir
    //jdk- Java Development Kit: yazdigimiz kodun compiler olunmasi ucun lazimdir,programci kodlari compiler edib,sonra iwe salmasi ucun lazimdir.
}