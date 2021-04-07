
package com.mycompany.reto4;
import java.util.Date;
import java.util.Scanner;

public class Pedido extends Mesa{ 
    Scanner lector = new Scanner(System.in);
    
  private Date fechaActual;
  private int cantidad;

    public Pedido(int numero, int capacidad, String descripcion) {
        super(numero, capacidad, descripcion);
        fechaActual = new Date();
    }
    
    
    public Date getFechaYHora(){
        return this.fechaActual;
    }
    
    public int setCantidadPlatos(){
        System.out.println("Ingrese la cantidad de platos");
        this.cantidad = lector.nextInt();
        return 0;
    }
    
   } 
    
