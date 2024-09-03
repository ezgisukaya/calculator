import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,select;
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz:");
        a = input.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        b= input.nextInt();


        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("işleminizi seçiniz:");
        select = input.nextInt();

        if(select == 1){
            System.out.println("sonucunuz:"+(a+b));
        }else if(select == 2){
            System.out.println("sonucunuz: "+(a-b));
        }else if(select == 3) {
            System.out.println("sonucunuz: " + (a * b));
        }else if(select == 4) {
            System.out.println("sonucunuz: " + (a / b));
        }



    }
}
