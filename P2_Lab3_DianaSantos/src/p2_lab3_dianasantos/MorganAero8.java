
package p2_lab3_dianasantos;

import java.awt.Color;
import java.util.Date;


public class MorganAero8 extends Carros{
    private String convertible;//es o no es
    private String Cabina; //es una o doble
    private int veloMax; //140 a 145 km/hr
    private int recorreMo;// 35 a 40 km/ga
    private int price; //500,000 y Lps. 700,000

    public MorganAero8() {
        super();
    }

    public MorganAero8(String convertible, String Cabina, int veloMax, int recorreMo, int price, String NSerie, Date Ensamble, Color Pintura, String MarcaLlantas, String Polarizado) {
        super(NSerie, Ensamble, Pintura, MarcaLlantas, Polarizado);
        this.convertible = convertible;
        this.Cabina = Cabina;
        this.veloMax = veloMax;
        this.recorreMo = recorreMo;
        this.price = price;
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    public String getCabina() {
        return Cabina;
    }

    public void setCabina(String Cabina) {
        this.Cabina = Cabina;
    }

    public int getVeloMax() {
        return veloMax;
    }

    public void setVeloMax(int veloMax) {
        this.veloMax = veloMax;
    }

    public int getRecorreMo() {
        return recorreMo;
    }

    public void setRecorreMo(int recorreMo) {
        this.recorreMo = recorreMo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + "MorganAero8:" + "\nconvertible=" + convertible + ", Cabina=" + Cabina + ", veloMax=" + veloMax + ", recorreMo=" + recorreMo + ", price=" + price + '}';
    }
    
    
}
