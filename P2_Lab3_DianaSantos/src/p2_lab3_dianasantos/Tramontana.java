package p2_lab3_dianasantos;

import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

public class Tramontana extends Carros {

    private int Peso; //1276 y 1376 kg
    private int transmision;// 6 a 7 velocidades
    private int Vmax; // 175 a 180 km/h
    private int corrido; //50 a 55 km/gal
    private int PriceT; //Lps. 800,000 y Lps. 1,000,000. 

    public Tramontana() {
        super();
    }

    public Tramontana(int Peso, int transmision, int Vmax, int corrido, int PriceT, String NSerie, Date Ensamble, Color Pintura, String MarcaLlantas, String Polarizado) {
        super(NSerie, Ensamble, Pintura, MarcaLlantas, Polarizado);
        this.Peso = Peso;
        this.transmision = transmision;
        this.Vmax = Vmax;
        this.corrido = corrido;
        this.PriceT = PriceT;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        if (Peso > 1275 && Peso < 1377) {
            this.Peso = Peso;
        } else {
            JOptionPane.showMessageDialog(null, "El peso debe ser de 1276 a 1376kg");
        }
    }

    public int getTransmision() {
        return transmision;
    }

    public void setTransmision(int transmision) {
        if(transmision < 8 && transmision > 5){
        this.transmision = transmision;
    }else{
            JOptionPane.showMessageDialog(null, "Es de 6 a 7 velocidades");
        }
    }

    public int getVmax() {
        return Vmax;
    }

    public void setVmax(int Vmax) {
        this.Vmax = Vmax;
    }

    public int getCorrido() {
        return corrido;
    }

    public void setCorrido(int corrido) {
        this.corrido = corrido;
    }

    public int getPriceT() {
        return PriceT;
    }

    public void setPriceT(int PriceT) {
        this.PriceT = PriceT;
    }

    @Override
    public String toString() {
        return super.toString() + "Tramontana:" + "\nPeso=" + Peso + ", transmision=" + transmision + ", Vmax=" + Vmax + ", corrido=" + corrido + ", PriceT=" + PriceT + '}';
    }

}
