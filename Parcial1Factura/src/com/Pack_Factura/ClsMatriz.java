/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pack_Factura;

import java.text.DecimalFormat;

/**
 *
 * @author USUARIOTC
 */
public class ClsMatriz {
    DecimalFormat df = new DecimalFormat ("###.##");
    private int unidades=0;
    private int descripcion=1;
    private int precio=2;
    private int kg=3;
    private int gastoPeso=4;
    private int gastoValor=5;
    private int costoUnidad=6;
    private int totalVenta=7;
    private String matriz [][] = new String [4][9];
    public int filaActual;
    
    //Variables para calculos 
    private double sumaVentas; 
    private double sumaPeso;
    private double coeficienteGasto;
    private double coeficientePeso;
    
    //Impuestos 
    private int seguro = 3500;
    private int impuestos=5000;
    private int comisiones=200;
    
    //Transporte
    private int fletes=2500;
    private int acarreo=5000;
    
    
public ClsMatriz(){
    
}
    
  
public void llendoDatos(Clsfactura fac){
    if(1==1){
    matriz[filaActual][0]= fac.getCantidad()+"";
    matriz[filaActual][1]=fac.getDescripcion()+"";
    matriz[filaActual][2]=fac.getPrecio()+"";
    matriz[filaActual][3]=fac.getKgProducto()+"";
    matriz[filaActual][4]=" ----";
    filaActual++;
    }
    else{
        System.out.println("Error compa");
    }
    
    
}

//public void llenarMatriz(){
//     for(int f=0; f<matriz.length; f++){
//            for(int c=0; c<matriz[0].length; c++){
//                matriz[f][c]="Hola";
//            }
//        }
//}
public void encabezado(){
    String arr[]={"Unidades ","Descripcion","Valor", "Kg", "----","gastoValor", "GastoTrans","ValorUni", "Total"};
    for (int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
        if (i!=arr.length-1){
            System.out.print("    \t|");
        }
    }
}
public void imprimirMatriz(){
    encabezado();
    System.out.println("\n_______________________________________________________________________________________________________________________________________");
     for(int f=0; f<matriz.length; f++){
         
            for(int c=0; c<matriz[0].length; c++){
                System.out.print(matriz[f][c]+"\t"); 
                if (c!=matriz.length-1 ){
                    System.out.print("\t|");
                } 
                
            }
            System.out.println("\n_______________________________________________________________________________________________________________________________________");
        }
}

public void totalesProductos(int cantidad, int  valor){
    double sumaProducto=0;
    double guardadoTotal=0;
    for (int f=0; f<matriz.length; f++){
        
        sumaProducto=Double.parseDouble(matriz[f][cantidad])* Double.parseDouble(matriz[f][valor]);
        guardadoTotal+=sumaProducto;
        
    }
    sumaVentas=guardadoTotal;
}

public void coeficienteGastos(int col){
    int sumaImpuestos = seguro + impuestos + comisiones;
    coeficienteGasto= sumaImpuestos / sumaVentas;
    
    for (int f=0; f<matriz.length; f++){
        matriz[f][col] =(df.format(coeficienteGasto * Integer.parseInt(matriz[f][2]))+" ");
    }
}

public void totalPeso(int cantidad,int kg){
    double suma=0;
    double guardado=0;
    for(int f=0; f<matriz.length; f++){
        suma = Double.parseDouble(matriz[f][cantidad]) * Double.parseDouble(matriz[f][kg]);
        guardado+=suma;
    }
    sumaPeso=guardado;
}

public void coeficientePeso(int col){
    int sumaTransporte = fletes + acarreo;
    coeficientePeso= sumaTransporte / sumaPeso;
    
    for (int f=0; f<matriz.length; f++){
        matriz[f][col] =(df.format(coeficientePeso * Integer.parseInt(matriz[f][3]))+" ");
    }
}
public void costoUnidad(int col){
    double suma;
    for(int f=0; f<matriz.length; f++){
       matriz[f][col]=df.format(Double.parseDouble(matriz[f][2])+ Double.parseDouble(matriz[f][5])+Double.parseDouble(matriz[f][6]))+"";
    }
}

public void totalFinal(int col){
    for (int f=0; f<matriz.length; f++){
        matriz[f][col]=(df.format(Double.parseDouble(matriz[f][0])* Double.parseDouble(matriz[f][7])))+"";
    }
}
public void granTotal(){
    int granTotal=0;
    for(int f=0; f<matriz.length; f++){
        granTotal+=Double.parseDouble(matriz[f][8]);
    }
    System.out.println("El resultado del ejercicio es: Q."+df.format(granTotal));
}
        
}
