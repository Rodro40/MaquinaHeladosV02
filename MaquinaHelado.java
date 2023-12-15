/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AaMaquinaDeHelados;

/**
 *
 * @author dev
 */
public class MaquinaHelado {
    private Helado[][] h = new Helado[3][3];
    private double monedero;
    private double ganancias;

    public MaquinaHelado() {
        h[0][0] = new Helado("ChocoBomba","tarrina",2.5);
        h[0][1] = new Helado("FresaGuapi","palo",2.5);
        h[0][2] = new Helado("LimónCanela","cucurucho",2.5);
        h[1][0] = new Helado("FrigLemon","tarrina",2.5);
        h[1][1] = new Helado("PiñaHelada","palo",2.5);
        h[1][2] = new Helado("MoraGuay","cucurucho",2.5);
        h[2][0] = new Helado("ChocoLoco","tarrina",2.5);
        h[2][1] = new Helado("TuttiFrutti","palo",2.5);
        h[2][2] = new Helado("Mentazul","cucurucho",2.5);
    }
    
    public Helado obtenerHelados(int n1 , int n2){
        return this.h[n1][n2];
    }
    
    public void introducirMonedas(double n){
        this.monedero = this.monedero + n;
    }
    
    public void pedirHelado(int n1 , int n2){
        h[n1][n2].restarHelado();
        this.ganancias = this.ganancias + h[n1][n2].getPrecio();
        this.monedero = this.monedero - h[n1][n2].getPrecio();
    }

    public double getMonedero() {
        return monedero;
    }

    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }
    
    
}
