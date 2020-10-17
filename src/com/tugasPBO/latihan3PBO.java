//latihan 3 PBO
// Nama       : Argya Aulia Fauzandika
// NIM        : 10119035
// Kelas      : IF-1
// Deskripsi  : memasukkan nilai dari keyboard dan menampilkan ke layar
package com.tugasPBO;
import java.util.Scanner;

public class latihan3PBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan nama anda : ");
        String nama = scanner.next();
        System.out.println("Nama anda adalah : " + nama);

    }
}