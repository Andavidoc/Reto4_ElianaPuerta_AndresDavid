package com.mycompany.reto4;

import java.util.Scanner;

public class Mesa{

Scanner lector = new Scanner(System.in);
   
    
   private int numero;
   private int capacidad;
   private String descripcion;
   
   
   public Mesa(int numero, int capacidad, String descripcion){
   this.numero = numero;
   this.capacidad = capacidad;
   this.descripcion = descripcion;
   
   }
   
   
   public int setNumeroMesa(){   
        System.out.println("Ingresa el Número de la mesa");       
        this.numero = lector.nextInt();     
    return 0;
   } 
   
   public int setCapacidadMesa(){
        System.out.println("Ingresa el Número máximo de puestos");       
        this.capacidad = lector.nextInt();
        return 0;
   } 
   public String setDescripcionMesa(){
        System.out.println("Ingresa la descripcion de la mesa");       
        this.descripcion = lector.next();
        return null;
   } 
   
   public int getNumeroMesa(){
        return this.numero;
   }
    
   public int getCapacidadMesa(){
        return this.capacidad;
   }
   public String getDescripcionMesa(){
        return this.descripcion;
   }
   
   
   
   
}
    

