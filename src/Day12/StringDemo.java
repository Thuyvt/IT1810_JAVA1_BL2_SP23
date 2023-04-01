/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class StringDemo {
    public static void main(String[] args) {
        String truong = "FPT POLYTECHNIC";
        // toLowerCase(): chuyển toàn bộ về viết thường
        System.out.println(truong.toLowerCase());
        // toUpperCase(): chuyển toàn bộ về viết hoa;
        String hoVaTen = "vu thi thuy";
        // length(): lấy độ dài của string
        System.out.println("Độ dài họ và tên:" + hoVaTen.length());
        // equals(): giúp so sánh 2 chuỗi có phân biệt hoa thường
        // trim(): cắt các ký tự trắng 2 đầu chuỗi
        if (hoVaTen.toLowerCase().trim().equals("Vu Thi Thuy ".toLowerCase().trim())) {
            System.out.println("equals");
        } 
        // equalsIgnoreCase(): giúp so sánh 2 chuỗi không phân biệt hoa thường
        if (hoVaTen.trim().equalsIgnoreCase("Vu Thi Thuy".trim())) {
            System.out.println("equalsIgnoreCase");
        }
        String soDienThoai = "0903299680";
        // startsWith(): kiểm tra chuỗi bắt đầu = ....
        // endsWith(): kiểm tra chuỗi kết thúc = ....
        if (soDienThoai.startsWith("090")) {
            System.out.println("Nhà mạng mobi");
        } else if (soDienThoai.startsWith("091")){
            System.out.println("Nhà mạng vina");
        } else if (soDienThoai.startsWith("097")) {
            System.out.println("Nhà mạng viettel");
        }
        // nếu có văn là nam, có thị là nữ
        if (hoVaTen.contains("van")) {
            System.out.println("giới tính nam");
        } else if (hoVaTen.contains("thi")) {
            System.out.println("giới tính nữ");
        }
        // tách chuỗi thành mảng
        String[] ten = hoVaTen.split(" ");
        for (int i = 0; i < ten.length; i++) {
            System.out.println(ten[i]);
        }
        System.out.println("Họ:" + hoVaTen.substring(0, 2));
        System.out.println("Tên:" + hoVaTen.substring(7));
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên:");
        String soNguyen = sc.nextLine();
        if (soNguyen.matches("[0-9]+")) {
            System.out.println("Đây là số nguyên");
        } else {
            System.out.println("Không đúng dịnh dạng");
        }
        System.out.println("Nhập số thực");
        String soThuc = sc.nextLine();
        if (soThuc.matches("\\d+(\\.\\d+)?")) {
            System.out.println("Đây là số thực");
        } else {
            System.out.println("Không phải là số thực");
        }
    }
}
