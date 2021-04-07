
package com.mycompany.reto4;

import java.util.Date;
import java.util.Scanner;


public class Venta {
      Scanner lector = new Scanner(System.in);
   private String nombrePlato;
   private int cantidad;
   private double precio;
   private Date fecha;
   private int documento;
   private String tipoDoc;
   
    
    
    public Venta(String nombre,int cantidad, double precio,int documento, String tipoDoc){
        this.nombrePlato = nombre;
        this.cantidad = cantidad;
        this.precio = precio;  
        this.documento = documento;
        this.tipoDoc = tipoDoc;       
    }
    
    public double getPrecio(){
       return this.precio;
    }
    public int getCantidad(){
       return this.cantidad;
    }
    
    public int setCantidad(){
        System.out.println("Ingresa la cantidad de platos del cliente: ");
        this.cantidad = lector.nextInt();
        return 0;
    }
    
    
   
    }
    
    
    

