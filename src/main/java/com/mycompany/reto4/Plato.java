
package com.mycompany.reto4;

import java.util.Scanner;


public class Plato{
    
    Scanner lector = new Scanner(System.in);

  private  String nombre;
  private  String descripcion;
  private  double costo;
  private  double venta;
  private static int numeroPlatos = 0;
  private  String tipoPlato;
    
Plato(String nombre, String descripcion, double costo, double venta ,String tipoPlato){
this.nombre = nombre;
this.descripcion = descripcion;
this.costo = costo;
this.venta = venta;
this.tipoPlato = tipoPlato;
this.numeroPlatos++;
}

    


public String getNombrePlato(){
    return this.nombre;
}

public String getTipoPlato(){
    return this.tipoPlato;
}

public String getDescripcionPlato(){
    return this.descripcion;
}

public double getCostoPlato(){
    return this.costo;
}

public double getPventaPlato(){
    return this.venta;
}

public int getplatos(){
    return this.numeroPlatos;
}

    public String setNombrePlato(){
        System.out.println("Ingresa nombre del plato");       
         this.nombre = lector.nextLine();
        return null;
   }
   
    public String setDescripcionPlato(){
        System.out.println("Ingresa descripción del plato");       
        this.descripcion = lector.nextLine();
        return null;
   }
   
   public String setTipoPlato(){
        System.out.println("Ingresa tipo de plato");       
        this.tipoPlato = lector.next();
        return null;
   }
   
   public double setCostoPlato(){
        System.out.println("Ingresa costo del plato");       
        this.costo = lector.nextDouble();        
        return 0;
   }
   
   public double setVentaPlato(){
        System.out.println("Ingresa precio de venta del plato");       
        this.venta = lector.nextDouble();
        return 0;
   }


}
