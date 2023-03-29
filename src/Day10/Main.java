/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import static Day2.OnTap.diemTrungBinh;
import static Day2.OnTap.inThongTin;
import static Day2.OnTap.tinhTien;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLBS ql = new QLBS();
        do {
            System.out.println("---------------Menu--------------");
            System.out.println("1. Nhập danh sách đối tượng");
            System.out.println("2. Hiển thị danh sách đối tượng");
            System.out.println("3. Hiển thị thông tin đối tượng có tuổi lớn >= 30");
            System.out.println("4. Hiển thị thông tin đối tượng có bậc lương cao nhất");
            System.out.println("5. Tính độ tuổi trung bình của các bác sĩ");
            System.out.println("6. Xóa những bác sĩ là nội trú khỏi danh sách và hiển thị lại");
            System.out.println("0.Thoát");
            System.out.println("---------------------------------");
            System.out.print("Nhap chuong trinh can chay:");
            String menu = sc.nextLine();
            switch (menu) {
                case "1" -> {
                    ql.nhap();
                    break;
                }
                case "2" -> {
                    new QLBS().hienThi();
                    break;
                }
                case "3" -> {
                    break;
                }
                case "4" -> {
                    break;
                }
                case "5" -> {
                    break;
                }
                case "6" -> {
                    break;
                }
                case "0" -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Nhap sai yeu cau nhap lai");
                    break;
                }
            }
        } while (true);
    }
}
