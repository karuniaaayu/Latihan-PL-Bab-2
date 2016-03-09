package larimahasiswa;

import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        Scanner in4 = new Scanner(System.in);
        Scanner in5 = new Scanner(System.in);
        Scanner in6 = new Scanner(System.in);
        Scanner in7 = new Scanner(System.in);
        Scanner in8 = new Scanner(System.in);
        Mahasiswa b = new Mahasiswa();
        System.out.print("Banyak mahasiswa : ");
        int m = in2.nextInt();
        System.out.print("Panjang dalam meter  : ");
        b.setPanjang(in3.nextInt());
        System.out.print("Lebar dalam meter    : ");
        b.setLebar(in4.nextInt());
        
        Mahasiswa r[] = new Mahasiswa[m];
        
        for (int i = 0;i<r.length;i++){
            r[i] = new Mahasiswa();
            System.out.println("###Input###");
            System.out.print("nim     : ");
            b.setNim(in5.next());
            System.out.print("nama    : ");
            b.setNama(in6.next());
            System.out.print("Jumlah Putaran : ");
            b.setjumlahPutaran(in7.nextInt());
            System.out.print("Jumlah Waktu dalam menit  : ");
            b.setjumlahWaktu(in8.nextInt());
            System.out.println("");
            b.displayEnd();
            System.out.println("");
        }
        
        }
        
    }
   