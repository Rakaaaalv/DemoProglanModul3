package Tugas1;

import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input angka pertama: ");
        double angka1 = sc.nextDouble();

        System.out.print("Input operasi ( +, -, *, / ): ");
        char operasi = sc.next().charAt(0);

        System.out.print("Input angka kedua: ");
        double angka2 = sc.nextDouble();

        double hasil;

        switch (operasi) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Tidak bisa membagi dengan angka 0");
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid");
                return;
        }
        System.out.println("Hasil: " + hasil);
    }
}
