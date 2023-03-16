/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

/**
 *
 * @author ThuyVT
 */
import java.util.Scanner;
public class tanddph33812 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ChucNang cn=new ChucNang();
        int chon;
        do{
            System.out.println("1:tinh tong");
             System.out.println("2:kiem tra tam giac");
              System.out.println("3:tinh hoa don");
               System.out.println("4:thoat");
                System.out.println("moi chon");
                chon=scan.nextInt();
                switch (chon){
                    case 1:{
                        cn.bai1();
                        break;          
                    }
                    case 2:{
                        cn.bai2();
                        break;          
                    }
                    default:{
                        System.out.println("nhap sai vui long nhap lai");
                        break;
                    }
                        
                          
                }
        }while(true);
    }
}
