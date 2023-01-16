
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gesa Rizky N
 */
public class cepar2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai Panjang Gelombang (m):");
        double l = sc.nextDouble();
        System.out.println("Masukan Nilai Frekuensi (Hz):");
        double f = sc.nextDouble();
        double v = l * f;
        System.out.println("Maka Nilai Cepat Rambat (m/s) :" +v);
    }
}
