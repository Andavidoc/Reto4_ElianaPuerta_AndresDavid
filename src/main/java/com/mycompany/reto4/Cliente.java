package com.mycompany.reto4;

import java.util.Scanner;


public class Cliente {
    
    Scanner lector = new Scanner(System.in);
    
   private int documento;
   private String tipo;
   private String nombre;

   Cliente(int documento,String tipo, String nombre) {
   this.documento = documento;
   this.tipo = tipo;
   this.nombre = nombre; 
   }    

    
   public String setNombreCliente(){
        System.out.println("Ingresa nombre cliente: ");   
        
        this.nombre = lector.nextLine();
        return null;
   } 
   public String setTipoDoc(){
        System.out.println("Ingresa nuevo tipo de documento");       
        this.tipo = lector.next();
        return null;
   }   
   
   public int setDocumento(){
        System.out.println("Ingresa número de documento");       
        this.documento = lector.nextInt();
        return 0;
   } 
   public String getTipoDoc(){
        return this.tipo;
   }
    
   public String getNombreCliente(){
        return this.nombre;
   }
   public int getDocumento(){
        return this.documento;
   }    
    
}
