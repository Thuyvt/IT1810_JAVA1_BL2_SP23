/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;
 import java.util.Scanner;
public class ChucNang {
    
        Scanner scan=new Scanner (System.in);
        public String b1 (String thongBao){
            System.out.print("nhap"+thongBao+":");
            return scan.nextLine();
        }
   public void bai1(){
       float tong=0;
       int n;
       do{
           System.out.print("nhap n: ");
           n=scan.nextInt();
       
       }while(n>0);
       for(int i=1;i<=n;i++){{
           tong+=1.0/i;
       }        
           System.out.printf("Tong day so la:%f",tong);    
   }              
}
   public void bai2(){
       double a,b,c;
       do{
           System.out.println("Nhap cah a: ");
           a=scan.nextDouble();
         }while(a<0);
           do{
           System.out.println("Nhap cah b: ");
           b=scan.nextDouble();
         }while(b<0);
          do{
           System.out.println("Nhap cah c: ");
           c=scan.nextDouble();
         }while(c<0);
          
           
     
}
}