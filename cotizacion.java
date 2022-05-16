package domain;

import javax.swing.JOptionPane;

public class Cotizacion {

    private int numCotizacion;
    private String descripcionAuto;
    private double precio;
    private int porcentajeInicial;
    private int plazo;

    public Cotizacion() {

    }

    public Cotizacion(int numCotizacion, String descripcionAuto, double precio, int porcentajeInicial, int plazo) {
        this.numCotizacion = numCotizacion;
        this.descripcionAuto = descripcionAuto;
        this.precio = precio;
        this.porcentajeInicial = porcentajeInicial;
        this.plazo = plazo;
    }

    public Cotizacion(Cotizacion cotizacion) {
        System.out.println("Numero de cotizacion: " + cotizacion.numCotizacion);
        System.out.println("Descripcion del auto: " + cotizacion.descripcionAuto);
        System.out.println("Precio: " + cotizacion.precio);
        System.out.println("Porcentaje Inicial: " + cotizacion.porcentajeInicial);
        System.out.println("Plazo: " + cotizacion.plazo);
    }

    public double calculoInicial() {
        return this.precio * this.porcentajeInicial / 100;
    }

    public double totalFinanciar() {
        return this.precio - calculoInicial();
    }

    public double pagoMensual() {
        return totalFinanciar() / this.plazo;
    }

    public int getNumCotizacion() {
        return numCotizacion;
    }

    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    public String getDescripcionAuto() {
        return descripcionAuto;
    }

    public void setDescripcionAuto(String descripcionAuto) {
        this.descripcionAuto = descripcionAuto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPorcentajeInicial() {
        return porcentajeInicial;
    }

    public void setPorcentajeInicial(int porcentajeInicial) {
        this.porcentajeInicial = porcentajeInicial;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    
    public static void main(String[] args) {
        int numcotizacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cotizacion del auto: "));
        String descripcion=JOptionPane.showInputDialog("Ingrese la descripcion del auto: ");
        int precio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del auto: "));
        int porcentajeinicial=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcentaje inicial del auto: "));
        int plazo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de meses para el plazo: "));
        Cotizacion c= new Cotizacion(numcotizacion,descripcion,precio,porcentajeinicial,plazo);
        System.out.println(c.calculoInicial());
        System.out.println(c.pagoMensual());
        System.out.println(c.totalFinanciar());
        Cotizacion c2=new Cotizacion(c);
    }

}