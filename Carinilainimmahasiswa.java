import java.util.Scanner;

public class Carinilainimmahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jml ;

        System.out.println("\t=== DATA NIM DAN NAMA MAHASISWA ===");
        System.out.print("Jumlah mahasiswa : ");
        jml = input.nextInt();
        input.nextLine();

        String [][] nimnama = new String[jml][2];
        String cari;
        int detect= 0;

        for (int i = 0; i < jml; i++) {
            System.out.println("\t=== PENGISIAN DATA ===");
            System.out.print("Nama mahasiswa \t: ");
            nimnama [i][0] = input.nextLine();
            System.out.print("Nim mahasiswa \t: ");
            nimnama [i][1] = input.nextLine();
        }
        for (int i = 0; i < nimnama.length; i++) {
            for (int j = 0; j < nimnama[i].length; j++) {
                System.out.print(nimnama[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\t=== MENCARI DATA ===");
        System.out.print("Cari \t: ");
        cari = input.nextLine();

        int perbandingan = 0;
        int indexI = -1;
        int indexJ = -1;
        for (int i = 0; i < nimnama.length; i++) {
            for (int j = 0; j < nimnama[i].length; j++) {
                if (cari.equalsIgnoreCase(nimnama[i][j])) {
                    detect= 1;
                    indexI = i;
                    indexJ = j;
                    break;
                }
            }if (detect == 1) {
                break;
            }
        }
        if (detect == 1) {
            System.out.println("Data ditemukan");
            System.out.println("Posisi index \t\t: [" + indexI +"][" + indexJ +"]");
        }else{
            System.out.println("Data tidak ditemukan");
        }

        System.out.println("Jumlah perbandingan percarian \t: " + perbandingan);
    }
}