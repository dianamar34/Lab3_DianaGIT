
package p2_lab3_dianasantos;


public class Personas {
    protected String Nombre;
    protected String ID;
    protected int edad; //18 o mayor
    protected int altura; //1.55 metros o mayor
    protected int pesoP; //120 lbs o mayor

    public Personas() {
    }

    public Personas(String Nombre, String ID, int edad, int altura, int pesoP) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.edad = edad;
        this.altura = altura;
        this.pesoP = pesoP;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPesoP() {
        return pesoP;
    }

    public void setPesoP(int pesoP) {
        this.pesoP = pesoP;
    }

    @Override
    public String toString() {
        return "Personas:" + "\nNombre=" + Nombre + ", ID=" + ID + ", edad=" + edad + ", altura=" + altura + ", pesoP=" + pesoP + '}';
    }
    
    
    
}
