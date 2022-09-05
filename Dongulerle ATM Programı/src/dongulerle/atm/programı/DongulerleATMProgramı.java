
package dongulerle.atm.programi;

import java.util.Scanner;

public class DongulerleATMProgrami {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int bakiye = 1000;
    
    String islemler = "1.İslem : Bakiye Ogrenme\n"
                      +"2.İslem : Para Cekme\n"
                      +"3.İslem : Para Yatirma\n"
                      + " Cikis icin q'a basin";
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");
        
        while (true) {
            
            System.out.print("İslemi seciniz :");
            String işlem = scanner.nextLine();
            
            if (islem.equals("q"))  {
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + bakiye);
            }
            else if (islem.equals("2")) {    
                System.out.print("Cekmek istediginiz tutar? : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                if (bakiye - tutar < 0 )  {
                    
                    System.out.println("Yetersiz Bakiye. Bakiyeniz :" + bakiye);
                  }
                else {
                    bakiye -= tutar;
                    System.out.println("Guncel Bakiyeniz :" + bakiye);
                    
                        
                }
                
                
            }    
            else if (islem.equals("3")) {   
                System.out.print("Yatirmak istediginiz tutar? : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                bakiye += tutar;
                
                
                System.out.println("Yeni Bakiyeniz :" + bakiye); 
            }
            
            else {
                System.out.println("Gecersiz İslem...");
                
                
            }
        }
    }
}

        
       
    
    

