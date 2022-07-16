import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("Dizinin boyutu 'n' : ");
        int diziLength = girdi.nextInt();

        System.out.println("Dizinin elemanlarini giriniz : ");
        int liste[] = new int[diziLength];

        for (int i = 0; i < diziLength; i++) {
            System.out.println(i + ". elemani giriniz : ");
            liste[i] = girdi.nextInt();
        }
        Arrays.sort(liste);
        System.out.println("Siralama : " + Arrays.toString(liste));
    }
}
