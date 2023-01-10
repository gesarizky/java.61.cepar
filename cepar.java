/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class cepar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai Jarak (m):");
        double s = sc.nextFloat();
        System.out.println("Masukan Nilai Waktu (s):");
        double t = sc.nextFloat();
        double v = s / t;
        System.out.println("Maka Nilai Cepat Rambat (m/s) : "+v);
    }
}
