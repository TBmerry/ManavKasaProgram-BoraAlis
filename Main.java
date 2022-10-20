import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
        toplam tutarını ekrana yazdıran program yapmak amaçlanmıştır.
         */
        double armut, elma, domates, muz, patlican, ucret;

        Scanner input = new Scanner(System.in);

        System.out.print("armut kg giriniz : ");
        armut = input.nextDouble();
        System.out.print("elma kg giriniz : ");
        elma = input.nextDouble();
        System.out.print("domates kg giriniz : ");
        domates = input.nextDouble();
        System.out.print("muz kg giriniz : ");
        muz = input.nextDouble();
        System.out.print("patlican kg giriniz : ");
        patlican = input.nextDouble();

        ucret = (armut*2.14+elma*3.67+domates*1.11+muz*0.95+patlican*5);
        System.out.print("Ödemeniz gereken ücret : " + ucret);

    }
}