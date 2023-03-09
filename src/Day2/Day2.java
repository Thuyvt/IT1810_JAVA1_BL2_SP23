/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // C1
        // Nhap ten, tuoi,can nang, so dien thoai
//        System.out.print("Nhap ten:");
//        String ten = sc.nextLine();
//        System.out.print("Nhap tuoi:");
//        int tuoi = sc.nextInt();
//        System.out.print("Nhap can nang");
//        double canNang = sc.nextDouble();
//        // C1. Xoa bo dem
//        sc.nextLine();
//        System.out.print("Nhap so dien thoai");
//        String sdt = sc.nextLine();
//        System.out.printf("Ten = %s, tuoi = %d, can nang = %f, so dien thoai = %s",
//                ten, tuoi, canNang, sdt);
        
        // Nhap ten, tuoi,can nang, so dien thoai
        System.out.print("Nhap ten:");
        String ten = sc.nextLine();
        System.out.print("Nhap tuoi:");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap can nang");
        double canNang = Double.valueOf(sc.nextLine());
        System.out.print("Nhap so dien thoai");
        String sdt = sc.nextLine();
        System.out.printf("Ten = %s, tuoi = %d, can nang = %f, so dien thoai = %s",
                ten, tuoi, canNang, sdt);
    }
}
