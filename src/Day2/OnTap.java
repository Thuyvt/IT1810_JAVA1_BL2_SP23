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
public class OnTap {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("---------------Menu--------------");
            System.out.println("1. Thông tin gia đình");
            System.out.println("2. Tính điểm trung bình");
            System.out.println("3. Tính tiền");
            System.out.println("4. Thông tin dãy số phong thủy");
            System.out.println("0.Thoát");
            System.out.println("---------------------------------");
            System.out.print("Nhap chuong trinh can chay:");
            String menu = sc.nextLine();
            switch (menu) {
                case "1" -> {
                    inThongTin();
                    break;
                }
                case "2" -> {
                    diemTrungBinh();
                    break;
                }
                case "3" -> {
                    tinhTien();
                    break;
                }
                case "4" -> {
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

    // Bai 1
    public static void inThongTin() {
        System.out.print("Nhap ten bo:");
        String tenBo = sc.nextLine();
        System.out.print("Nhap tuoi bo:");
        int tuoiBo = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ten me:");
        String tenMe = sc.nextLine();
        System.out.print("Nhap tuoi me:");
        int tuoiMe = Integer.parseInt(sc.nextLine());
        System.out.printf("Ten bo: %s, tuoi bo: %d\n", tenBo, tuoiBo);
        System.out.printf("Ten me: %s, tuoi me: %d\n", tenMe, tuoiMe);
    }

    // Bai 2
    public static void diemTrungBinh() {
        System.out.print("Nhap diem toan:");
        double diemToan = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem van:");
        double diemVan = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem anh:");
        double diemAnh = Double.parseDouble(sc.nextLine());
        double tb = (diemAnh + diemVan + diemToan) / 3;
        // C1: dieu kien xuoi
        if (tb < 4) {
            System.out.println("Hoc luc yeu");
        } else if (4 <= tb && tb < 6) {
            System.out.println("Hoc luc trung binh");
        } else if (6 <= tb && tb < 8) {
            System.out.println("Hoc luc kha");
        } else if (8 <= tb && tb <=10) {
            System.out.println("Hoc luc gioi");
        }
        
        // C2: dieu kien nguoc
        if (tb >= 8 && tb <= 10) {
            System.out.println("Hoc luc gioi");
        } else if (tb >= 6) {
            System.out.println("Hoc luc kha");
        } else if (tb >= 4) {
            System.out.println("Hoc luc trung binh");
        } else if (tb < 4) {
            System.out.println("Hoc luc yeu");
        }
    }
    
    //Bai 3
    public static void tinhTien() {
        System.out.print("Nhap gio vao:");
        float gioVao = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap gio ra:");
        float gioRa = Float.parseFloat(sc.nextLine());
        float tongTien = 0;
        if (gioVao <= 12 || gioVao >= 23) {
            System.out.println("Nha nghi khong hoat dong");
        } else {
            float tongGio = gioRa - gioVao;
            // 3 gio dau 150000
            if (tongGio <= 3) {
                tongTien = 150000 * tongGio;
            } else {
                // 3 gio dau 150000, gio thu 4 tro di giam 30%
                tongTien = 150000 * 3 + 150000 * 70 / 100 * (tongGio - 3); 
            }
            // Neu gio bat dau tu 14 -> 17 giam tiep 10% tong hoa don
            if (gioVao >= 14 && gioVao <= 17) {
                tongTien = tongTien * 90 / 100;
            }
            System.out.println("Tong tien phai tra la" + tongTien);
        }
    }
}
