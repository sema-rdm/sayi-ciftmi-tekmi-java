
package kurucumetotlar;
public class benimsinifim {
    double sayi;
    public benimsinifim(double sayi)
    {
        this.sayi = sayi;
    }
    public int cifttek()
    {
        double s = Math.ceil(sayi);
        if(s%2==1)
            return 1;
        else 
            return 2;
    }
}
