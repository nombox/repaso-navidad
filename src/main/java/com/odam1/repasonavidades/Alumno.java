/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.repasonavidades;

import java.util.ArrayList;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Alumno {
    
    public String dni;
    private String nombre;
    private static String centro = "IES FERNANDO WIRTZ";
    private CicloFP ciclo;
    private ArrayList<Double> notasCurso = new ArrayList<>();
    private int edad;
    
    //Crear un atributo que sea edad alumno
    //Crear un metodo que muestre si es mayor de edad o no
    
    /*Construcctores*/
    
    public Alumno(String dni, String nombre){
    
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public Alumno(){
    
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the centro
     */
    public static String getCentro() {
        return centro;
    }

    /**
     * @param aCentro the centro to set
     */
    public static void setCentro(String aCentro) {
        centro = aCentro;
    }

    /**
     * @return the ciclo
     */
    public CicloFP getCiclo() {
        return ciclo;
    }

    /**
     * @param ciclo the ciclo to set
     */
    public void setCiclo(CicloFP ciclo) {
        this.ciclo = ciclo;
    }
    
    /*Metodos*/
    
    public void anhadirNota(double nota){ //autobocing en java, transforma en Double
        this.notasCurso.add(nota);
    
    }
    
    @Override
    public String toString(){
        return  "Alumno: "+this.nombre+"\n"+
                "DNI: "+this.dni+"\n"+
                "Nota: "+this.notasCurso+"\n";
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
