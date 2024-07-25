package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerTeclado=new Scanner(System.in);
        String nombreConducto;
        String marcavehiculo;
        String modelovehiculo;
        double distancia;
        double consumoCoche;
        double preciolitro;

        System.out.println("ingrese el nombre del conductor:");
        nombreConducto=leerTeclado.nextLine();

        System.out.println("ingrese la marca del vehiculo:");
        marcavehiculo=leerTeclado.nextLine();

        System.out.println("ingrese modelo vehiculo:");
        modelovehiculo=leerTeclado.nextLine();

        System.out.println("Por favor ingrese el consumo en litros de su vehiculo por cada 100 KM recorridos");
        consumoCoche=leerTeclado.nextDouble();
        System.out.println("Por favor ingrese el precio de cada litro de combustible");
        preciolitro=leerTeclado.nextDouble();
        System.out.println("Por favor ingrese la distancia a recorrer en KILOMETROS en su vehiculo");
        distancia=leerTeclado.nextDouble();

        double litrosParaViaje;
        System.out.println("hola "+nombreConducto+" tu carro "+marcavehiculo+" modelo "+modelovehiculo+" presenta la siguiente información para tu viaje:");
        litrosParaViaje=(distancia/100)*consumoCoche;
        System.out.println("El consumo de combustible para el viaje es:"+litrosParaViaje+" litros de combustible");

        double costoCombustible;
        costoCombustible=litrosParaViaje*preciolitro;
        System.out.println("El costo del combustible para su viaje de "+distancia+" kilometros es de "+costoCombustible+" pesos");




    }
}