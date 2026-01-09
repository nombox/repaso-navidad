/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.odam1.repasonavidades;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class AppAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        Alumno alumno1 = new Alumno();
        
        //Atributos publicos
        alumno1.dni = "147258369P";
        
        //Atributos privados, accedo y modifico mediante getter/setters
        alumno1.setNombre("Pepe");
        alumno1.setCiclo(CicloFP.DAW);
        
        //Usando un constructor
        Alumno alumno2 = new Alumno("12345679P", "Juan", 23);
        alumno2.setCiclo(CicloFP.DAM);
        
        System.out.println("Centro al que pertenece el alumno2: "+ Alumno.getCentro());
        
        //Meter esto en un while o do while hasta que el alumno pare de mostrar otas
       
        String decision = "";
        
        
        do{
         System.out.println("Introduce una nota");
        try{
        double nota = entradaTeclado.nextDouble();
        alumno2.anhadirNota(nota);
        }catch(InputMismatchException error){
            System.out.println("Error: Valor no valido");
        };
        
            System.out.println("Quieres Terminar de agregar notas?(S/N)");
            decision = entradaTeclado.next().toUpperCase();
        }while(!decision.equals("S"));
        
        
        
        /*Mini reto: añadir un atributo edad, un método esMayordeEdad, 
        y crear un arrayList de usuarios a partir de los datos indicados por el usuario,
        y mostrar los datos de los alumnos mayores de edad*/
        
        /*
        Creamos un ArrayList<Alumno>.

        Usamos un bucle do-while para pedir Nombre, DNI y Edad repetidamente.

        En cada vuelta, creamos un new Alumno(), guardamos sus datos y lo añadimos a la lista.

        Al terminar de pedir datos, hacemos otro bucle (un for-each) para recorrer la lista y mostrar solo los que esMayorEdad() devuelve true.*/
        
        //Se crea el ArrayList
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        decision = "";
        
        do{
        String dni;
        String nombre;
        int edad;
        int ciclo;
        
        
            System.out.println("Ingresa el nombre del alumno");
            nombre = entradaTeclado.next();
            
            System.out.println("Ingresa el dni del alumno");
            dni = entradaTeclado.next();
            
            System.out.println("Ingresa la edad del alumno");
            edad = entradaTeclado.nextInt();
            
            Alumno alumno = new Alumno(dni, nombre, edad);
            
            System.out.println("Define su ciclo: 1 DAM o 2 DAW");
            ciclo = entradaTeclado.nextInt();
            switch(ciclo){
                case 1 ->{
                    alumno.setCiclo(CicloFP.DAM);
                }
                case 2 ->{
                    alumno.setCiclo(CicloFP.DAW);
                }
            }
            
            listaAlumnos.add(alumno);
        
             System.out.println("Quieres Terminar de agregar usuarios?(S/N)");
            decision = entradaTeclado.next().toUpperCase();
        }while(!decision.equals("S"));
        
        System.out.println("Los alumnos mayores de edad son");
        for(Alumno alumno: listaAlumnos){
            if(alumno.esMayorEdad()){
                System.out.println(alumno);
            }
        }
        
    }
    
}
