/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5;

/**
 *
 * @author ThuyVT
 */
public class SinhVien {

    // Thuộc tính mô tả đặc điểm của đối tượng
    private String ten;
    private int namSinh;
    private String email;
    private boolean gioiTinh; // true : giới tính nam, false: giới tính nữ

    // Getter: lấy ra giá trị thuộc tính
    public String getTen() {
        return this.ten;
    }

    // Setter: gán giá trị cho thuộc tính
    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        if (namSinh > 2005) {
            System.out.println("Không đủ tuổi");
        } else {
            this.namSinh = namSinh;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    // Constructor không tham số
    public SinhVien() {
    }
    
    // Constructor có đủ tham số
//    public SinhVien(String ten, int namSinh, String email, boolean gioiTinh) {
//        this.ten = ten;
//        this.namSinh = namSinh;
//        this.email = email;
//        this.gioiTinh = gioiTinh;
//    }

    public SinhVien(String ten, int namSinh, String email, boolean gioiTinh) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.email = email;
        this.gioiTinh = gioiTinh;
    }
    public void gioiThieuBanThan() {
        System.out.printf("Tên tôi là %s, tôi sinh năm %d, email là: %s, giới tính của tôi là %s\n",
                this.ten, this.namSinh, this.email, this.gioiTinh == true ? "nam" : "nữ" );
    }
    public void tinhDiem(boolean gioiTinh, double diem) {
        double diemTb;
        if (gioiTinh) {
            diemTb = diem * 0.7;
        } else {
            diemTb = diem * 0.8;
        }
        System.out.println("Điểm trung bình" + diemTb);
    }
    public void tinhDiem(String gioiTinh, double diem) {
        double diemTb;
        if (gioiTinh.equalsIgnoreCase("NỮ")) {
            diemTb = diem *0.8;
        } else {
            diemTb = diem *0.7;
        }
        System.out.println("ĐIểm trung bình" + diemTb);
    }
}
