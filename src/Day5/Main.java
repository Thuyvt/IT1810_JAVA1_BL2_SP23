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
public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        // gán giá trị cho thuộc tính tên
        sv1.setTen("Vũ Thị Thúy");
        // gán giá trị cho thuộc tính năm sinh
        sv1.setNamSinh(2004);
        // email
        sv1.setEmail("thuyvt66@fe.edu.vn");
        // giới tính
        sv1.setGioiTinh(false);
        // Hiển thị thông tin đối tượng
        System.out.println("Tên:" + sv1.getTen());
        System.out.println("Năm sinh:" + sv1.getNamSinh());
        System.out.println("Email:" + sv1.getEmail());
        System.out.println("Giới tính:" + sv1.isGioiTinh());
        
        SinhVien sv2 = new SinhVien("Nguyễn Anh Duy", 2004, "duyna@fpt.edu.vn", true);
        sv2.gioiThieuBanThan();
        sv1.gioiThieuBanThan();
    }
}
