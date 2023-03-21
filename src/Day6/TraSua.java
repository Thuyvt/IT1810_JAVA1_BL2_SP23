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
public class TraSua {
    // thuộc tính
    private String ten;
    private String kichThuoc;
    private int topping; // 1: trân châu trắng, 2: trân châu đen
    private double gia;
    private int soLuong;
    private boolean trangThai;// true: nóng, false :đá
    
    // constructor không tham số
    public TraSua() {
    }
    // constructor có tham số
    public TraSua(String ten, String kichThuoc, int topping, double gia, int soLuong, boolean trangThai) {
        this.ten = ten;
        this.kichThuoc = kichThuoc;
        this.topping = topping;
        this.gia = gia;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getTopping() {
        return topping;
    }

    public void setTopping(int topping) {
        this.topping = topping;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    // Hiển thị thông tin đối tượng
    @Override
    public String toString() {
        return "TraSua{" + "ten=" + ten + ", kichThuoc=" + kichThuoc + ", topping=" + topping + ", gia=" + gia + ", soLuong=" + soLuong + ", trangThai=" + trangThai + '}';
    }
    
    
}
