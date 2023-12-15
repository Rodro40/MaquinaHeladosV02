/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AaMaquinaDeHelados;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Exec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaquinaHelado machine = new MaquinaHelado();
        String intoUsu;
        do {
            intoUsu = menuInicial(sc);
            if (intoUsu.equals("1")) {
                verHelados(machine);
            } else if (intoUsu.equals("2")) {
                introducirMonedas(machine, sc);
            } else if (intoUsu.equals("3")) {
                pedirHelado(machine , sc);
            }
        } while (!intoUsu.equals("4"));
        System.out.println("No olvides recoger tu cambio: " + machine.getMonedero());
        System.out.println("Las ganancias han sido de: " + machine.getGanancias());
    }

    public static String menuInicial(Scanner sc) {
        String opcion;
        do {
            System.out.println("--------Inicio--------");
            System.out.println("(1)-Ver helados \n(2)-Introducir monedas \n(3)-Pedir helado \n(4)-Apagar máquina");
            System.out.print("Opción: ");
            opcion = sc.nextLine();
            if (!(opcion.equals("1") || opcion.equals("2") || opcion.equals("3") || opcion.equals("4"))) {
                System.out.println("Valor inválido");
            }
        } while (!(opcion.equals("1") || opcion.equals("2") || opcion.equals("3") || opcion.equals("4")));
        return opcion;
    }

    public static void verHelados(MaquinaHelado m) {
        Helado h;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                h = m.obtenerHelados(i, j);
                System.out.println("" + h.getSabor() + " de " + h.getTipo() + " " + h.getPrecio() + "€ Cantidad: " + h.getCantidad());
            }
        }
    }

    public static void introducirMonedas(MaquinaHelado m, Scanner sc) {
        String opcion;
        System.out.println("Valor de las monedas: \n(1) 0.10€\n(2) 0.20€\n(3) 0.50€\n(4) 1€\n(5) 2€\n(s) Salir");
        do {
            System.out.print("¿Que introduces? :");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1" -> {
                    m.introducirMonedas(0.10);
                    System.out.println("Se añadio 0.10€ a su monedero");
                }
                case "2" -> {
                    m.introducirMonedas(0.20);
                    System.out.println("Se añadio 0.20€ a su monedero");
                }
                case "3" -> {
                    m.introducirMonedas(0.50);
                    System.out.println("Se añadio 0.50€ a su monedero");
                }
                case "4" -> {
                    m.introducirMonedas(1);
                    System.out.println("Se añadio 1€ a su monedero");
                }
                case "5" -> {
                    m.introducirMonedas(2);
                    System.out.println("Se añadio 2€ a su monedero");
                }
                case "s", "S" -> {
                    System.out.println("");
                }
                default -> {
                    System.out.println("Dame un valor válido");
                }
            }
        } while (!(opcion.equalsIgnoreCase("s")));
        System.out.println("Valor del monedero: " + m.getMonedero() + "€");
        System.out.println("");
    }
    
    public static void pedirHelado(MaquinaHelado m , Scanner sc){
        int n1 , n2;
        System.out.println("Introduzca el helado deseado: ");
        System.out.print("N1: ");
        n1 = Integer.parseInt(sc.nextLine());
        System.out.print("N2: ");
        n2 = Integer.parseInt(sc.nextLine());
        if (n1 >= 3 || n2 >= 3) {
            System.out.println("Valor incorrecto");
        } else if (m.obtenerHelados(n1, n2).getCantidad() == 0) {
            System.out.println("No quedan helados de ese tipo.");
        } else if (m.obtenerHelados(n1, n2).getPrecio() > m.getMonedero()) {
            System.out.println("Saldo insuficiente");
        } else {
            m.pedirHelado(n1, n2);
            System.out.println("Aqui tiene su helado: " + m.obtenerHelados(n1, n2).getSabor());
            System.out.println("No olvides recoger tu cambio: " + m.getMonedero());
            m.setMonedero(0);
        }
    }
}
