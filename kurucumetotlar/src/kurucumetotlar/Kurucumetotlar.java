
package kurucumetotlar;

import javax.swing.JOptionPane;

public class Kurucumetotlar {
    public static void main(String[] args) {
      String s1 = JOptionPane.showInputDialog("bir sayi giriniz");
       benimsinifim sin = new benimsinifim(Double.parseDouble(s1));
       if(sin.cifttek()==1)
            System.out.println("sayi tektir");
       else
            System.out.println("sayi çifttir");  
    }
}
