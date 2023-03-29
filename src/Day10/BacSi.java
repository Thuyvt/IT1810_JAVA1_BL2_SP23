/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

/**
 *
 * @author ThuyVT
 */
public class BacSi {

    private String ten;
    private String ngaySinh;
    private int gioiTinh;
    private String xepLoai;
    private String khoa;
    private double bacLuong;
    private boolean loai;

    public BacSi() {
    }

    public BacSi(String ten, String ngaySinh, int gioiTinh, String xepLoai, String khoa, double bacLuong, boolean loai) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.xepLoai = xepLoai;
        this.khoa = khoa;
        this.bacLuong = bacLuong;
        this.loai = loai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public double getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(double bacLuong) {
        this.bacLuong = bacLuong;
    }

    public boolean isLoai() {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }
        /* 
     Ten: String
 Ngày sinh: String
 Giới tính: int // 1 nam, 2 nữ
 Xếp hạng: String (VD: bác sĩ chuyên khoa 1, bác sĩ chuyên khoa 2)
 Khoa: String
 Bậc lương: double
 Loại bác sĩ: boolean // true – Nội trú, false – ngoại trú
     */
    public void inThongTin() {
        System.out.println("Tên: " + this.ten);
        System.out.println("Ngày sinh:" + this.ngaySinh);
        System.out.println("Giới tính:" + (this.gioiTinh == 1 ? "Nữ" : "Nam"));
        System.out.println("Xếp hạng:" + this.xepLoai);
        System.out.println("Khoa:" + this.khoa);
        System.out.println("Bậc lương:" + this.bacLuong);
        System.out.println("Loại bác sĩ:" + (this.loai ? "Nội trú" : "Ngoại trú"));
        System.out.println("Tuổi:" + tinhTuoi());
        System.out.println("Đánh giá lương:" + danhGia());
        System.out.println("============");
    }

    @Override
    public String toString() {
        return "BacSi{" + "ten=" + ten + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", xepLoai=" + xepLoai + ", khoa=" + khoa + ", bacLuong=" + bacLuong + ", loai=" + loai + '}';
    }
    
    public int tinhTuoi() {
        return 2023 - Integer.parseInt(this.ngaySinh);
    }
    
    public String danhGia() {
        return this.bacLuong > 50 ? "Cao" : "Thấp";
    }
}
