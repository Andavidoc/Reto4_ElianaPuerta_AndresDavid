
package com.mycompany.reto4;

// Andrés David Ocampo  
// Eliana Janneth Puerta Morales 


public class Restaurante {
    
     public static void main(String[]args ){  
         
     Plato plato1 = new Plato("Calentado","Delicioso calentado con Carne y Arepa",5000, 12000,"Desayuno");
     Cliente cliente1 = new Cliente(1017238145,"cc","Eliana Puerta");
     Pedido mesa1 = new Pedido(1,4,"Estandar");
     Venta venta1 = new Venta(plato1.getNombrePlato(),4,plato1.getPventaPlato(),cliente1.getDocumento(),cliente1.getTipoDoc());
    
         
     Plato plato2 = new Plato("","",0,0,"");
     Cliente cliente2 = new Cliente(0,"","");
     Pedido mesa2 = new Pedido(2,6,"Grande");
     plato2.setNombrePlato();
     plato2.setDescripcionPlato();
     plato2.setCostoPlato();
     plato2.setVentaPlato();
     plato2.setTipoPlato();
    
     cliente2.setNombreCliente();
     cliente2.setDocumento();
     cliente2.setTipoDoc();
     
     
     mesa2.setNumeroMesa();
     mesa2.setCapacidadMesa();
     mesa2.setDescripcionMesa();
      
     Venta venta2 = new Venta(plato2.getNombrePlato(),0,plato2.getPventaPlato(),cliente2.getDocumento(),cliente2.getTipoDoc());
     
     venta2.setCantidad();
     
         System.out.println("\nPedido Estático: \n");
     
     System.out.println("El cliente " +cliente1.getNombreCliente() + " con tipo de documento " + cliente1.getTipoDoc()+
             " con # " + cliente1.getDocumento() + " Ordeno: " + venta1.getCantidad() + " Platos de " + plato1.getNombrePlato() +
             " con valor de " + venta1.getPrecio()*venta1.getCantidad() + " Pesos en la fecha y hora: " + mesa1.getFechaYHora());        
    
         System.out.println("\nPedido ingresado por el usuario: \n");
     
    System.out.println("El cliente " +cliente2.getNombreCliente() + " con tipo de documento " + cliente2.getTipoDoc()+
             " con # " + cliente2.getDocumento() + " Ordeno: " + venta2.getCantidad() + " Platos de " + plato2.getNombrePlato() +
             " con valor de " + venta2.getPrecio()*venta2.getCantidad() + " Pesos en la fecha y hora: " + mesa2.getFechaYHora());        
     
     
     
     
   
    
     
             
         
     
     
    
     
     }
    
}
