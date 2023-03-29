/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QLBS {

    ArrayList<BacSi> arrBs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    /*
     Ten: String
 Ngày sinh: String
 Giới tính: int // 1 nam, 2 nữ
 Xếp hạng: String (VD: bác sĩ chuyên khoa 1, bác sĩ chuyên khoa 2)
 Khoa: String
 Bậc lương: double
 Loại bác sĩ: boolean // true – Nội trú, false – ngoại trú
     */
    public void nhap() {
        System.out.println("Số lượng bác sĩ");
        int soLuong = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < soLuong; i++) {
            // Nhập thông tin đối tượng bác sĩ
            BacSi bs = new BacSi();
            System.out.println("Nhập tên:");
            bs.setTen(sc.nextLine());
            System.out.println("Nhập ngày sinh:");
            bs.setNgaySinh(sc.nextLine());
            System.out.println("Nhập giới tính 1 - nam / 2 - nữ:");
            bs.setGioiTinh(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập xếp hạng:");
            bs.setXepLoai(sc.nextLine());
            System.out.println("Nhập khoa:");
            bs.setKhoa(sc.nextLine());
            System.out.println("Nhập bậc lương:");
            bs.setBacLuong(Double.parseDouble(sc.nextLine()));
            System.out.println("Nhập loại bác sĩ 1 - nội trú/ 0 - ngoại trú:");
            bs.setLoai(Boolean.parseBoolean(sc.nextLine()));

            // thêm đối tượng vào arr
            arrBs.add(bs);
        }
    }

    // hiển thị danh sách
    public void hienThi() {
        if (arrBs.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (BacSi it : arrBs) {
                it.inThongTin();
            }
        }
    }

    // hiển thị đối tượng tuổi >= 30
    public void hienThiTuoi() {
        if (arrBs.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (BacSi it : arrBs) {
                // điều kiện
                if (it.tinhTuoi() >= 30) {
                    it.inThongTin();
                }
            }
        }
    }

    // hiển thị thông tin đối tượng có bậc lương cao nhất
    public void timMaxLuong() {
        if (arrBs.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            BacSi max = arrBs.get(0);
            for (int i = 0; i < arrBs.size(); i++) {
                if (arrBs.get(i).getBacLuong() > max.getBacLuong()) {
                    max = arrBs.get(i);
                }
            }
            
            System.out.println("Đối tượng có bậc lương cao nhất là:");
            max.inThongTin();
        }
    }
    // tỉnh tuổi trung bình của bác sĩ
    public void tinhTuoi() {
        if (arrBs.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            int tong = 0;
            for (BacSi bs: arrBs) {
                tong += bs.tinhTuoi();
            }
            System.out.println("Tuổi trung bình: " + (tong/arrBs.size()));
        }
    }
    // xóa bác sĩ nội trú
    public void xoa() {
        if (arrBs.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (int i = 0; i < arrBs.size(); i++) {
                if (arrBs.get(i).isLoai()) {
                    arrBs.remove(i);
                }
            }
            // hiển thị lại danh sách
            hienThi();
        }
    }

}
