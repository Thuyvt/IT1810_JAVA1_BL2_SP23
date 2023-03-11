/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class ChucNang {

    Scanner sc = new Scanner(System.in);

    public String nhapGiaTri(String thongBao) {
        System.out.print("Nhap " + thongBao + ":");
        return sc.nextLine();
    }

    // Bai 1
    public void inThongTin() {
        String tenBo = nhapGiaTri("tên bố");
        int tuoiBo = Integer.parseInt(nhapGiaTri("tuổi bố"));
        String tenMe = nhapGiaTri("tên mẹ");
        int tuoiMe = Integer.parseInt(nhapGiaTri("tuổi mẹ"));
        System.out.printf("Ten bo: %s, tuoi bo: %d\n", tenBo, tuoiBo);
        System.out.printf("Ten me: %s, tuoi me: %d\n", tenMe, tuoiMe);
    }

    // Bai 2
    public void diemTrungBinh() {
        double diemToan = Double.parseDouble(nhapGiaTri("điểm toán"));
        double diemVan = Double.parseDouble(nhapGiaTri("điểm văn"));
        double diemAnh = Double.parseDouble(nhapGiaTri("điểm anh"));
        double tb = (diemAnh + diemVan + diemToan) / 3;
        // C1: dieu kien xuoi
        if (tb < 4) {
            System.out.println("Hoc luc yeu");
        } else if (4 <= tb && tb < 6) {
            System.out.println("Hoc luc trung binh");
        } else if (6 <= tb && tb < 8) {
            System.out.println("Hoc luc kha");
        } else if (8 <= tb && tb <= 10) {
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
    public void tinhTien() {
        float gioVao = Float.parseFloat(nhapGiaTri("giờ vào"));
        float gioRa = Float.parseFloat(nhapGiaTri("giờ ra"));
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

    // Bài 4
    public void soPhongThuy() {
        int n = Integer.parseInt(nhapGiaTri("số lượng"));
        // Khởi tạo và khai báo 1 mảng số nguyên n phần tử
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập phần tử thứ " + i);
//            mang[i] = sc.nextInt();
            mang[i] = Integer.parseInt(nhapGiaTri("phần tử thứ " + i));
        }
        // Hiển thị lại danh sách các phần tử trong mảng
        System.out.print("\nDanh sách mảng số phong thủy: ");
        for (int so : mang) {
            System.out.printf("%d ", so);
        }
        // In các số chia hết cho 3
        System.out.print("\nDanh sách các số chia hết cho 3:");
        for (int so : mang) {
            if (so % 3 == 0) {
                System.out.printf("%d ", so);
            }
        }
        // Tìm max
        int max = mang[0];
        for (int i = 1; i < n; i++) {
            // C1
            if (max < mang[i]) {
                max = mang[i];
            }
        }
        System.out.println("\n Số lớn nhất trong mảng là " + max);

        int lonNhat = mang[n - 1];
        for (int i = n - 2; i < 0; i--) {
            // C2
            lonNhat = Math.max(lonNhat, mang[i]);
        }
        System.out.println("\n Số lớn nhất trong mảng là " + lonNhat);

    }
}
