
import java.util.Scanner;

/**
 *
 * @author Gesa Rizky N
 */
public class cepar1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai Panjang Gelombang (m):");
        double l = sc.nextDouble();
        System.out.println("Masukan Nilai Periode (s):");
        double w = sc.nextDouble();
        double v = l/w;
        System.out.println("Maka Nilai Cepat Rambat (m/s):"+v);
    }
}
