/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.ArrayList;
import java.util.Collection;
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
            for (BacSi bs : arrBs) {
                tong += bs.tinhTuoi();
            }
            System.out.println("Tuổi trung bình: " + (tong / arrBs.size()));
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

    // sửa thông tin bác sĩ tại 1 index
    public void sua() {
        System.out.println("Nhập vị trí cần sửa");
        int index = Integer.parseInt(sc.nextLine());
        if (index >= arrBs.size()) {
            System.out.println("Không tồn tại đối tượng");
        } else {
            // Đối tượng = index nhập vào
            BacSi bs = arrBs.get(index);
            System.out.println("Nhập tên:");
            bs.setTen(sc.nextLine());
            System.out.println("Nhập ngày sinh:");
            bs.setNgaySinh(sc.nextLine());

            // set giá trị mới vào arr
            arrBs.set(index, bs);
            // hiển thị lại danh sách sau khi thay đổi
            hienThi();
        }
    }

    public void suaLuong() {
        for (int i = 0; i < arrBs.size(); i++) {
            BacSi bs = arrBs.get(i);
            if (bs.getBacLuong() < 5) {
                System.out.println("Thong tin doi tuong luong < 5");
                bs.inThongTin();
                System.out.println("Sua luong");
                bs.setBacLuong(Double.parseDouble(sc.nextLine()));
            }
        }
        hienThi();
    }

    // Sắp xếp
    public void sapXep() {
        // Sắp xếp theo tên
        Collections.sort(arrBs, new Comparator<BacSi>() {
            // ghi đè lại phương thức
            @Override
            public int compare(BacSi o1, BacSi o2) {
                // sắp xếp tên tăng dần
                // return o1.getTen().compareTo(o2.getTen());
                // sắp xếp giảm dần
                // return o2.getTen().compareTo(o1.getTen());
                // sắp xếp theo bậc lương tăng dần
                // return (int) (o1.getBacLuong() - o2.getBacLuong());
                // sắp xếp giảm dần theo bậc lương
                return (int) (o2.getBacLuong() - o1.getBacLuong());
            }
        });
        // lamda
        arrBs.sort((b1, b2) -> b1.getTen().compareTo(b2.getTen()));
        // Sắp xếp lương tăng dần
        Collections.sort(arrBs, Comparator.comparing(BacSi::getBacLuong));
        // Sắp xếp theo lương giảm dần
        Collections.sort(arrBs, Comparator.comparing(BacSi::getBacLuong).reversed());

    }

}
