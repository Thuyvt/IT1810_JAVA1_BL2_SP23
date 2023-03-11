/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Ontap2 {

    Scanner sc = new Scanner(System.in);

    public void phongBan() {
        System.out.println("Nhập phòng ban:");
        int soLuong = Integer.parseInt(sc.nextLine());
        int[] phongBans = new int[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập số nhân viên phòng ban thứ " + i);
            phongBans[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("\nPhòng ban có số nhân viên >= 20 là: ");
        for (int pb : phongBans) {
            if (pb >= 20) {
                System.out.printf("%d", pb);
            }
        }
        inMang(phongBans);
        // Tăng dần
        Arrays.sort(phongBans);
        inMang(phongBans);
        // Giảm dần
        // C1: tạo 1 mảng mới và truyền giá trị từ cuối lên với mảng phongBans
        int[] mang = new int[soLuong];
        for (int i = soLuong - 1; i < 0; i--) {
            mang[i] = phongBans[i];
        }
        inMang(mang);
        // C2:
//        Arrays.sort(phongBans, Collections.reverseOrder());
    }

    public void inMang(int[] mang) {
        System.out.print("\nMảng là:");
        for (int pb : mang) {
            System.out.printf("%d ", pb);
        }
    }
}
