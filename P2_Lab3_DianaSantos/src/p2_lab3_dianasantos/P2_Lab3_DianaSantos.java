package p2_lab3_dianasantos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class P2_Lab3_DianaSantos {

    public static void main(String[] args) {
        ArrayList<Carros> carros = new ArrayList();
        ArrayList<Empleados> empleados = new ArrayList();
        ArrayList<Clientes> clientes = new ArrayList();

        String opcion = "";
        int CantLlantas, VelocidadM, recorridoG, PrecioVenta, veloMax, recorreMo, price, kmh, corre, PrecioF, Peso, transmision, Vmax, corrido, PriceT;
        int HorasTrabajo, edad, altura, pesoP, Dinero;
        String NSerie, Polarizado, MarcaLlantas, convertible, Cabina, tipo, Convert, Nombre, ID;

        Color Pintura;
        Date ensamble;
        while (!opcion.equalsIgnoreCase("f")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Agregar \n"
                    + "b- Modificar\n"
                    + "c- Eliminar \n"
                    + "d- Reporte\n"
                    + "e- Ventas\n"
                    + "f- Salir\n");

            if (opcion.equals("a")) {
                String opciona = "";
                while (!opciona.equalsIgnoreCase("d")) {
                    opciona = JOptionPane.showInputDialog("     AGREGAR\n"
                            + "a- Agregar Carros \n"
                            + "b- Agregar Empleados\n"
                            + "c- Agregar Clientes \n"
                            + "d- Salir\n");
                    if (opciona.equals("a")) {
                        String cars = "";
                        while (!cars.equalsIgnoreCase("e")) {
                            cars = JOptionPane.showInputDialog("   AGREGAR CARRO\n"
                                    + "a- Maybach \n"
                                    + "b- Morgan Aero 8\n"
                                    + "c- Fisker Automotive\n"
                                    + "d- Tramontana"
                                    + "e- Salir\n");

                            if (cars.equals("a")) {

                                NSerie = JOptionPane.showInputDialog("Numero de Serie");
                                Polarizado = JOptionPane.showInputDialog("Tiene polarizado");
                                MarcaLlantas = JOptionPane.showInputDialog("Marca de Llantas");

                                CantLlantas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Llantas (1 o 2)"));
                                VelocidadM = Integer.parseInt(JOptionPane.showInputDialog("Velocidad Maxima (155 a 160 km/h)"));
                                recorridoG = Integer.parseInt(JOptionPane.showInputDialog("Recorrido (50 a 55 km/gal)"));
                                PrecioVenta = Integer.parseInt(JOptionPane.showInputDialog("Precio venta (400,000 y Lps. 600,000)"));

                                carros.add(new Maybash(CantLlantas, VelocidadM, recorridoG, PrecioVenta, NSerie, new Date(), Color.BLUE, MarcaLlantas, Polarizado));

                            }
                            if (cars.equals("b")) {
                                NSerie = JOptionPane.showInputDialog("Numero de Serie");
                                Polarizado = JOptionPane.showInputDialog("Tiene polarizado");
                                MarcaLlantas = JOptionPane.showInputDialog("Marca de Llantas");
                                convertible = JOptionPane.showInputDialog("Es convertible");
                                Cabina = JOptionPane.showInputDialog("Cabina (Unica o Doble)");
                                veloMax = Integer.parseInt(JOptionPane.showInputDialog("Velocidad Maxima (140 a 145 km/hr)"));
                                recorreMo = Integer.parseInt(JOptionPane.showInputDialog("Recorrido (35 a 40 km/gal)"));
                                price = Integer.parseInt(JOptionPane.showInputDialog("Precio venta (Lps. 500,000 y Lps. 700,000)"));

                                carros.add(new MorganAero8(convertible, Cabina, veloMax, recorreMo, price, NSerie, new Date(), Color.RED, MarcaLlantas, Polarizado));
                            }
                            if (cars.equals("c")) {
                                NSerie = JOptionPane.showInputDialog("Numero de Serie");
                                Polarizado = JOptionPane.showInputDialog("Tiene polarizado");
                                MarcaLlantas = JOptionPane.showInputDialog("Marca de Llantas");
                                tipo = JOptionPane.showInputDialog("Tipo (Camioneta o Turismo)");
                                Convert = JOptionPane.showInputDialog("Es convertible?");
                                kmh = Integer.parseInt(JOptionPane.showInputDialog("Velocidad Maxima (160 a 165 km/hr)"));
                                corre = Integer.parseInt(JOptionPane.showInputDialog("Recorrido (55 a 60 km/gal)"));
                                PrecioF = Integer.parseInt(JOptionPane.showInputDialog("Precio venta (Lps. 450,000 y Lps. 650,000)"));

                                carros.add(new FiskerAutomotiv(tipo, Convert, kmh, corre, PrecioF, NSerie, new Date(), Color.BLACK, MarcaLlantas, Polarizado));

                            }
                            if (cars.equals("d")) {
                                NSerie = JOptionPane.showInputDialog("Numero de Serie");
                                Polarizado = JOptionPane.showInputDialog("Tiene polarizado");
                                MarcaLlantas = JOptionPane.showInputDialog("Marca de Llantas");

                                Peso = Integer.parseInt(JOptionPane.showInputDialog("Peso (1276 y 1376 kg)"));
                                transmision = Integer.parseInt(JOptionPane.showInputDialog("Transmision (6 a 7 velocidade)"));
                                Vmax = Integer.parseInt(JOptionPane.showInputDialog("Velocidad Maxima ( 175 a 180 km/hr)"));
                                corrido = Integer.parseInt(JOptionPane.showInputDialog("Recorrido (50 a 55 km/gal)"));
                                PriceT = Integer.parseInt(JOptionPane.showInputDialog("Precio venta (Lps. 800,000 y Lps. 1,000,000)"));

                                carros.add(new Tramontana(Peso, transmision, Vmax, corrido, PriceT, NSerie, new Date(), Color.PINK, MarcaLlantas, Polarizado));
                            }
                        }//fin while de carros agregar

                    }// fin del if de la opcion a

                }//fin del while de opcion a
                if (opciona.equals("b")) {
                    
                    Nombre = JOptionPane.showInputDialog("Nombre de la persona");
                    ID = JOptionPane.showInputDialog("ID de la persona");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                    altura = Integer.parseInt(JOptionPane.showInputDialog("Altura"));
                    HorasTrabajo = Integer.parseInt(JOptionPane.showInputDialog("Horas de trabajo del empleado"));
                    pesoP = Integer.parseInt(JOptionPane.showInputDialog("Peso de la persona"));
                    
                    empleados.add(new Empleados(HorasTrabajo, Nombre, ID, edad, altura, pesoP));
                }
                if (opciona.equals("b")) {
                    
                    Nombre = JOptionPane.showInputDialog("Nombre de la persona");
                    ID = JOptionPane.showInputDialog("ID de la persona");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                    altura = Integer.parseInt(JOptionPane.showInputDialog("Altura"));
                    pesoP = Integer.parseInt(JOptionPane.showInputDialog("Peso de la persona"));
                    Dinero = Integer.parseInt(JOptionPane.showInputDialog("Dinero que trae "));
                    
                    clientes.add(new Clientes( Dinero,  Nombre,  ID,  edad,  altura,  pesoP));
                }

            }//fin del if de opcion a
            if (opcion.equals("b")) {
                String mod = "";
                while (!mod.equalsIgnoreCase("d")) {
                    mod = JOptionPane.showInputDialog("   MODIFICAR\n"
                            + "a- Carros \n"
                            + "b- Clientes\n"
                            + "c- Empleados\n"
                            + "d- Salir\n");

                    if (mod.equals("a")) {
                        String cars = "";
                        while (!cars.equalsIgnoreCase("e")) {
                            cars = JOptionPane.showInputDialog("  Que carro desea modificar: \n"
                                    + "a- Maybach \n"
                                    + "b- Morgan Aero 8\n"
                                    + "c- Fisker Automotive\n"
                                    + "d- Tramontana"
                                    + "e- Salir\n");
                            if (cars.equals("a")) {
                                String s = "";
                                int posicion;
                                for (Object t : carros) {
                                    s += "Posicion: " + carros.indexOf(t) + ": " + ((Maybash) (t)).getNSerie() + "\n";
                                }
                                JOptionPane.showMessageDialog(null, s);
                                posicion = Integer.parseInt(JOptionPane.showInputDialog("Posición del carro a modificar:"));
                                carros.get(posicion);
                                NSerie = JOptionPane.showInputDialog("Numero de Serie");
                                Polarizado = JOptionPane.showInputDialog("Tiene polarizado");
                                MarcaLlantas = JOptionPane.showInputDialog("Marca de Llantas");
                                CantLlantas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Llantas (1 o 2)"));
                                VelocidadM = Integer.parseInt(JOptionPane.showInputDialog("Velocidad Maxima (155 a 160 km/h)"));
                                recorridoG = Integer.parseInt(JOptionPane.showInputDialog("Recorrido (50 a 55 km/gal)"));
                                PrecioVenta = Integer.parseInt(JOptionPane.showInputDialog("Precio venta (400,000 y Lps. 600,000)"));

                                carros.get(posicion).setPolarizado(Polarizado);
                                carros.get(posicion).setMarcaLlantas(MarcaLlantas);
                                carros.get(posicion).setNSerie(NSerie);
                                ((Maybash) carros.get(posicion)).setCantLlantas(CantLlantas);
                                ((Maybash) carros.get(posicion)).setPrecioVenta(PrecioVenta);
                                ((Maybash) carros.get(posicion)).setRecorridoG(recorridoG);
                                ((Maybash) carros.get(posicion)).setVelocidadM(VelocidadM);
                            }
                            if (cars.equals("b")) {
                                String s = "";
                                int posicion;
                                for (Object t : carros) {
                                    s += "Posicion: " + carros.indexOf(t) + ": " + ((MorganAero8) (t)).getNSerie() + "\n";
                                }
                                JOptionPane.showMessageDialog(null, s);
                                posicion = Integer.parseInt(JOptionPane.showInputDialog("Posición del carro a modificar:"));
                                carros.get(posicion);

                                NSerie = JOptionPane.showInputDialog("Numero de Serie");
                                Polarizado = JOptionPane.showInputDialog("Tiene polarizado");
                                MarcaLlantas = JOptionPane.showInputDialog("Marca de Llantas");
                                convertible = JOptionPane.showInputDialog("Es convertible");
                                Cabina = JOptionPane.showInputDialog("Cabina (Unica o Doble)");
                                veloMax = Integer.parseInt(JOptionPane.showInputDialog("Velocidad Maxima (140 a 145 km/hr)"));
                                recorreMo = Integer.parseInt(JOptionPane.showInputDialog("Recorrido (35 a 40 km/gal)"));
                                price = Integer.parseInt(JOptionPane.showInputDialog("Precio venta (Lps. 500,000 y Lps. 700,000)"));

                                carros.get(posicion).setPolarizado(Polarizado);
                                carros.get(posicion).setMarcaLlantas(MarcaLlantas);
                                carros.get(posicion).setNSerie(NSerie);
                                ((MorganAero8) carros.get(posicion)).setCabina(Cabina);
                                ((MorganAero8) carros.get(posicion)).setVeloMax(veloMax);
                                ((MorganAero8) carros.get(posicion)).setRecorreMo(recorreMo);
                                ((MorganAero8) carros.get(posicion)).setPrice(price);
                                ((MorganAero8) carros.get(posicion)).setConvertible(convertible);
                            }
                            if (cars.equals("c")) {
                                String s = "";
                                int posicion;
                                for (Object t : carros) {
                                    s += "Posicion: " + carros.indexOf(t) + ": " + ((FiskerAutomotiv) (t)).getNSerie() + "\n";
                                }
                                JOptionPane.showMessageDialog(null, s);
                                posicion = Integer.parseInt(JOptionPane.showInputDialog("Posición del carro a modificar:"));
                                carros.get(posicion);

                                NSerie = JOptionPane.showInputDialog("Numero de Serie");
                                Polarizado = JOptionPane.showInputDialog("Tiene polarizado");
                                MarcaLlantas = JOptionPane.showInputDialog("Marca de Llantas");
                                tipo = JOptionPane.showInputDialog("Tipo (Camioneta o Turismo)");
                                Convert = JOptionPane.showInputDialog("Es convertible?");
                                kmh = Integer.parseInt(JOptionPane.showInputDialog("Velocidad Maxima (160 a 165 km/hr)"));
                                corre = Integer.parseInt(JOptionPane.showInputDialog("Recorrido (55 a 60 km/gal)"));
                                PrecioF = Integer.parseInt(JOptionPane.showInputDialog("Precio venta (Lps. 450,000 y Lps. 650,000)"));

                                carros.get(posicion).setPolarizado(Polarizado);
                                carros.get(posicion).setMarcaLlantas(MarcaLlantas);
                                carros.get(posicion).setNSerie(NSerie);
                                ((FiskerAutomotiv) carros.get(posicion)).setTipo(tipo);
                                ((FiskerAutomotiv) carros.get(posicion)).setPrecioF(PrecioF);
                                ((FiskerAutomotiv) carros.get(posicion)).setKmh(kmh);
                                ((FiskerAutomotiv) carros.get(posicion)).setConvert(Convert);
                                ((FiskerAutomotiv) carros.get(posicion)).setCorre(corre);
                            }
                            if (cars.equals("c")) {
                                String s = "";
                                int posicion;
                                for (Object t : carros) {
                                    s += "Posicion: " + carros.indexOf(t) + ": " + ((Tramontana) (t)).getNSerie() + "\n";
                                }
                                JOptionPane.showMessageDialog(null, s);
                                posicion = Integer.parseInt(JOptionPane.showInputDialog("Posición del carro a modificar:"));
                                carros.get(posicion);

                                NSerie = JOptionPane.showInputDialog("Numero de Serie");
                                Polarizado = JOptionPane.showInputDialog("Tiene polarizado");
                                MarcaLlantas = JOptionPane.showInputDialog("Marca de Llantas");

                                Peso = Integer.parseInt(JOptionPane.showInputDialog("Peso (1276 y 1376 kg)"));
                                transmision = Integer.parseInt(JOptionPane.showInputDialog("Transmision (6 a 7 velocidade)"));
                                Vmax = Integer.parseInt(JOptionPane.showInputDialog("Velocidad Maxima ( 175 a 180 km/hr)"));
                                corrido = Integer.parseInt(JOptionPane.showInputDialog("Recorrido (50 a 55 km/gal)"));
                                PriceT = Integer.parseInt(JOptionPane.showInputDialog("Precio venta (Lps. 800,000 y Lps. 1,000,000)"));

                                carros.get(posicion).setPolarizado(Polarizado);
                                carros.get(posicion).setMarcaLlantas(MarcaLlantas);
                                carros.get(posicion).setNSerie(NSerie);
                                ((Tramontana) carros.get(posicion)).setVmax(Vmax);
                                ((Tramontana) carros.get(posicion)).setPriceT(PriceT);
                                ((Tramontana) carros.get(posicion)).setTransmision(transmision);
                                ((Tramontana) carros.get(posicion)).setPeso(Peso);
                                ((Tramontana) carros.get(posicion)).setCorrido(corrido);
                            }
                        }
                    }
                }
            }
        }//fin del while del menu principal
    }//fin del main
}//fin de la clase
