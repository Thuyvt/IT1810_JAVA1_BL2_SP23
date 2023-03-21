/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day6;

/**
 *
 * @author ThuyVT
 */
public class Main {
    public static void main(String[] args) {
        QuanLyTraSua ql = new QuanLyTraSua();
        // Nhập thông tin 1 đối tượng
//        ql.nhap();
        // Hiển thị thông tin 1 đối tượng
//        ql.xuat();
        // Nhập mảng
        ql.nhapMang();
        // Xuất mảng
        ql.xuatMang();
        // hiển thị tổng tiền phải trả
        System.out.println("Tổng tiền phải trả là " + ql.tinhTong());
    }
}
