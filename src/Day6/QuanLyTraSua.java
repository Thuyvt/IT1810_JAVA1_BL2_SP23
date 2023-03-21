/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day6;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QuanLyTraSua {

    Scanner sc = new Scanner(System.in);
    TraSua ts;// Khai báo đối tượng
    TraSua[] mangTs; // Khai báo mảng trà sữa

    public void nhap() {
        // C1: dùng contructor không tham số
        ts = new TraSua();
        System.out.print("Nhập tên:");
        ts.setTen(sc.nextLine());
        System.out.print("Nhập kích thươc:");
        ts.setKichThuoc(sc.nextLine());
        System.out.print("Nhập topping:");
        ts.setTopping(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập giá:");
        ts.setGia(Double.parseDouble(sc.nextLine()));
        System.out.print("Nhập số lượng:");
        ts.setSoLuong(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập đá(true-1)/nóng(false-0):");
        ts.setTrangThai(Boolean.parseBoolean(sc.nextLine()));
    }

    public void xuat() {
        System.out.println("Tên: " + ts.getTen());
        System.out.println("Kích thước: " + ts.getKichThuoc());
        System.out.println("Topping: " + (ts.getTopping() == 1 ? "trân châu trắng" : "trân châu đen"));
        System.out.println("Giá:" + ts.getGia());
        System.out.println("Số lượng:" + ts.getSoLuong());
        System.out.println("Trạng thái: " + (ts.isTrangThai() == true ? "nóng" : "đá"));
    }

    public void nhapMang() {
        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng cần mua:");
        int n = Integer.parseInt(sc.nextLine());
        // Khởi tạo mảng
        mangTs = new TraSua[n];
        for (int i = 0; i < mangTs.length; i++) {
            // C1: gọi hàm nhập
//            nhap();
//            // thêm đối tượng ts vào mảng
//            mangTs[i] = ts;
            // C2: không có hàm nhập - với constructor có tham số
            System.out.print("Nhập tên:");
            String ten = sc.nextLine();
            System.out.print("Nhập kích thước:");
            String kichThuoc = sc.nextLine();
            System.out.print("Nhập topping:");
            int topping = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập giá:");
            double gia = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập số lượng:");
            int soLuong = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập trạng thái:");
            boolean trangThai = Boolean.parseBoolean(sc.nextLine());
            
            // Khởi tạo đối tượng = constructor có tham số
            ts = new TraSua(ten, kichThuoc, topping, gia, soLuong, trangThai);
            // thêm đối tượng vào mảng
            mangTs[i] = ts;
        }
    }
    
    // Hiển thị thông tin mảng
    public void xuatMang() {
        for (TraSua item :mangTs) {
            System.out.println(item.toString());
        }
    }
    
    // tính tổng tiền phải trả
    public double tinhTong() {
        double tien = 0;
        for (TraSua it : mangTs) {
            tien += it.getSoLuong() * it.getGia();
        }
        return tien;
    }

}
