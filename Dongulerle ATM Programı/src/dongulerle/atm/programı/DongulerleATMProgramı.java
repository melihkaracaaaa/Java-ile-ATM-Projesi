
package dongulerle.atm.programı;

import java.util.Scanner;

public class DongulerleATMProgramı {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int bakiye = 1000;
    
    String işlemler = "1.İşlem : Bakiye Öğrenme\n"
                      +"2.İşlem : Para Çekme\n"
                      +"3.İşlem : Para Yatırma\n"
                      + " Çıkış için q'a basın";
        System.out.println("*************************");
        System.out.println(işlemler);
        System.out.println("*************************");
        
        while (true) {
            
            System.out.print("İşlemi seçiniz :");
            String işlem = scanner.nextLine();
            
            if (işlem.equals("q"))  {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (işlem.equals("1")) {
                System.out.println("Bakiyeniz : " + bakiye);
            }
            else if (işlem.equals("2")) {    
                System.out.print("Çekmek istediğiniz tutar? : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                if (bakiye - tutar < 0 )  {
                    
                    System.out.println("Yetersiz Bakiye. Bakiyeniz :" + bakiye);
                  }
                else {
                    bakiye -= tutar;
                    System.out.println("Güncel Bakiyeniz :" + bakiye);
                    
                        
                }
                
                
            }    
            else if (işlem.equals("3")) {   
                System.out.print("Yatırmak istediğiniz tutar? : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                bakiye += tutar;
                
                
                System.out.println("Yeni Bakiyeniz :" + bakiye); 
            }
            
            else {
                System.out.println("Geçersiz İşlem...");
                
                
            }
        }
    }
}

        
       
    
    

