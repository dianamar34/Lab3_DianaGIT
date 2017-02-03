
package p2_lab3_dianasantos;

import java.awt.Color;
import java.util.Date;


public class FiskerAutomotiv extends Carros{
    private String tipo; //camioneta o turismo
    private String Convert; //si o no
    private int kmh; //160 a 165 km/h
    private int corre; //55 a 60 km/ga
    private int PrecioF; //Lps. 450,000 y Lps. 650,000

    public FiskerAutomotiv() {
        super();
    }

    public FiskerAutomotiv(String tipo, String Convert, int kmh, int corre, int PrecioF, String NSerie, Date Ensamble, Color Pintura, String MarcaLlantas, String Polarizado) {
        super(NSerie, Ensamble, Pintura, MarcaLlantas, Polarizado);
        this.tipo = tipo;
        this.Convert = Convert;
        this.kmh = kmh;
        this.corre = corre;
        this.PrecioF = PrecioF;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConvert() {
        return Convert;
    }

    public void setConvert(String Convert) {
        this.Convert = Convert;
    }

    public int getKmh() {
        return kmh;
    }

    public void setKmh(int kmh) {
        this.kmh = kmh;
    }

    public int getCorre() {
        return corre;
    }

    public void setCorre(int corre) {
        this.corre = corre;
    }

    public int getPrecioF() {
        return PrecioF;
    }

    public void setPrecioF(int PrecioF) {
        this.PrecioF = PrecioF;
    }

    @Override
    public String toString() {
        return super.toString() + "FiskerAutomotiv:" + "\ntipo=" + tipo + ", Convert=" + Convert + ", kmh=" + kmh + ", corre=" + corre + ", PrecioF=" + PrecioF + '}';
    }
    
    
}
