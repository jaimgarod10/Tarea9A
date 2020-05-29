/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea9a.clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jaimg
 */
public class Fichero {
   
    PrintWriter esc = null;
    FileWriter fich;
    Scanner sc;
    
    public void leer(File fichero){
        
        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("error linea: " + ex.toString());
        }
        
    }
    
    public void escribir(String nombreFich, ArrayList<Clientes> lista){
        
        try {
            fich = new FileWriter(nombreFich); //para añadir ...(fich,true)
            esc = new PrintWriter(fich);

            for (int i = 0; i < lista.size(); i++) {

                esc.println(lista.get(i).toString());

            }

        } catch (IOException ex) {
            System.out.println("Error escritura " + ex.getMessage());

        } finally {
            esc.close();
        }
    }
    
    public void borrarFichero(File fichero) {
        if (!fichero.exists()) {
            System.out.println("El fichero no existe.");
        } else {
            fichero.delete();
            System.out.println("El fichero ha sido eliminado");
        }
    }
    
}
