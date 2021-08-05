/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1factura;

import com.Pack_Factura.ClsMatriz;
import com.Pack_Factura.Clsfactura;
import java.util.Scanner;

/**
 * 
 * @author USUARIOTC
 */
public class Parcial1Factura {
    
    static ClsMatriz objMatriz = new ClsMatriz ();
    static Clsfactura objFactura = new Clsfactura();
    static Scanner sn = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        datos();
        factura();
        
        
        
    } 
    
public static void datos(){
    //Primer elemento cemento
    objFactura.setCantidad(50);
    objFactura.setDescripcion("Cemento ");
    objFactura.setPrecio(60);
    objFactura.setKgProducto(50);
    objMatriz.llendoDatos(objFactura);
       
    //segundo elemento cal
    objFactura.setCantidad(150);
    objFactura.setDescripcion("Bolsas de cal ");
    objFactura.setPrecio(40);
    objFactura.setKgProducto(20);
    objMatriz.llendoDatos(objFactura);
    
    //tercer elemento tubo
    objFactura.setCantidad(200);
    objFactura.setDescripcion("Tubo pc ");
    objFactura.setPrecio(55);
    objFactura.setKgProducto(10);
    objMatriz.llendoDatos(objFactura);
     
    //cuarto elemento hierro
    objFactura.setCantidad(50);
    objFactura.setDescripcion("Hierro ");
    objFactura.setPrecio(350);
    objFactura.setKgProducto(50);
    objMatriz.llendoDatos(objFactura);
}
public static void factura(){
    //calcula la suma de los productos 
    objMatriz.totalesProductos(0,2);
    //calcula la suma del peso
    objMatriz.totalPeso(0,3);
    //extrae el coeficiente de gstos
    objMatriz.coeficienteGastos(5);
     // extra el coeficiente de peso  
    objMatriz.coeficientePeso(6);
    //hace el valor total de la unidad
    objMatriz.costoUnidad(7);
    //Y por ultimo se saca el total 
    objMatriz.totalFinal(8);
    objMatriz.imprimirMatriz();
    objMatriz.granTotal();
}
    
}
