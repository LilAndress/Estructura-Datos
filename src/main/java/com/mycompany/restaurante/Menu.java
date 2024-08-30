
package com.mycompany.restaurante;

import javax.swing.JOptionPane;


public class Menu {
    
    Platos platos[];
    int datos [][];
    String dias[] = new String[]{"lunes", "Martes", "Miercoles","Jueves","Viernes","Sabado"};
    
    
    public void crearMenu(int cantidad){
        
       platos = new Platos[cantidad]; // Inicialización del arreglo de objetos Platos
        int i = 0;

        while (i < cantidad) {
            String nombrePlato = JOptionPane.showInputDialog("Ingrese el nombre del plato " + (i + 1));
            int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del plato" + (i+1)));
            int produccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo de produccion" ));
            platos[i] = new Platos(nombrePlato,precio,produccion ); // Crear un nuevo objeto Platos y añadirlo al array
            i++;
        }
    }
    public void consultarMenu(){
      for(int i = 0; i < platos.length; i++){  
        JOptionPane.showMessageDialog(null, " Platos : " + platos[i].getNombre()+ " Precio : " +platos[i].getPrecio() + " Costo de produccion : " + platos[i].getProduccion());
       
      }
        
        
    }
    public void ingresarDatos(){
        datos = new int[6][platos.length];
        for(int f=1;f<6; f++){
            for(int c=0;c<platos.length;c++){
                datos[f][c]=Integer.parseInt(JOptionPane.showInputDialog(" Ventas para el dia" + f + "plato:" + platos[c].getNombre()));
            }
        }
    }
    
    
    public void cantidadPlatosVendidosSemana() {
        int totalVentasPorPlato[] = new int[platos.length];
        
        for (int c = 0; c < platos.length; c++) {
            int totalVentas = 0;
            for (int f = 0; f < 6; f++) {
                totalVentas += datos[f][c];
            }
            totalVentasPorPlato[c] = totalVentas;
        }
        
        for (int i = 0; i < platos.length; i++) {
            JOptionPane.showMessageDialog(null, "Total de ventas en la semana del plato " + platos[i].getNombre() + ": " + totalVentasPorPlato[i]);
        }
    }
    
     public void diaMaxMinVentasPorPlato() {
        
         for (int c = 0; c < platos.length; c++) {
            int maxVentas = datos[0][c];
            int minVentas = datos[0][c];
            int diaMax = 0;
            int diaMin = 0;

            for (int f = 1; f < 6; f++) {
                if (datos[f][c] > maxVentas) {
                    maxVentas = datos[f][c];
                    diaMax = f;
                }
                if (datos[f][c] < minVentas) {
                    minVentas = datos[f][c];
                    diaMin = f;
                }
            }

            JOptionPane.showMessageDialog(null, "Para el plato " + platos[c].getNombre() + 
                ", el día con más ventas fue " + dias[diaMax] + " con " + maxVentas + " ventas." +
                "\nEl día con menos ventas fue " + dias[diaMin] + " con " + minVentas + " ventas.");
        }
    }
     public void diaMaxMinVentasTotal() {
    int totalVentasPorDia[] = new int[6];
    
    
    for (int f = 0; f < 6; f++) {
        for (int c = 0; c < platos.length; c++) {
            totalVentasPorDia[f] += datos[f][c];
        }
    }

    
    int diaMax = 0, diaMin = 0;
    for (int f = 1; f < 6; f++) {
        if (totalVentasPorDia[f] > totalVentasPorDia[diaMax]) diaMax = f;
        if (totalVentasPorDia[f] < totalVentasPorDia[diaMin]) diaMin = f;
    }

   
    JOptionPane.showMessageDialog(null, 
        "El día con más ventas fue " + dias[diaMax] + " con " + totalVentasPorDia[diaMax] + " ventas.\n" +
        "El día con menos ventas fue " + dias[diaMin] + " con " + totalVentasPorDia[diaMin] + " ventas."
    );
}
     
     public void promedioVentas(){
         for(int c = 0; c <platos.length; c++){
             int totalventas =0;
             for (int f = 0; f < 6; f++){
                 totalventas += datos[f][c];
                 
             }
           
      
             double promedio = totalventas /6.0;
             for (int i = 0; i < platos.length; i++) {
             JOptionPane.showMessageDialog(null, "El promedio de ventas para el plato" +platos[i].getNombre() +" es de" + promedio);
         }
         }
         
     }
     
     public void ventasTotales(){
        int totalventas =0;
        double gananciasTotales = 0;
         for( int f = 0; f < 6; f++){
          for(int c=0; c< platos.length; c++){
              totalventas += datos[f][c];
          }
     }
         JOptionPane.showMessageDialog(null, "El total de ventas de todos los platos en la semana es de :" + totalventas);
         
         for (int i = 0; i < platos.length; i++) {
            Platos plato = platos[i];
            int cantidadVendida = totalventas;
            int precioVenta = plato.getPrecio();
            int costoProduccion = plato.getProduccion();
            
            double gananciaPorPlato = (precioVenta - costoProduccion) * cantidadVendida;
            gananciasTotales += gananciaPorPlato;
        }
        
        // Mostrar las ganancias totales usando JOptionPane
        JOptionPane.showMessageDialog(null, "Ganancias totales: " + gananciasTotales);
    }
         
         
         
     }
     
  