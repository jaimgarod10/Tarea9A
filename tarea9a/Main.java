/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea9a;

import com.mycompany.tarea9a.clases.Clientes;
import com.mycompany.tarea9a.clases.Fichero;
import com.mycompany.tarea9a.clases.Metodos;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jaimg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Clientes> listClientes = new ArrayList();
        Metodos m = new Metodos();
        Fichero f = new Fichero();
        f.escribir("Clientes.txt", listClientes);
        int opcion;
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("   MENÚ:  \n1--> Añadir cliente. \n2--> Listar clientes. \n3-->Buscar cliente. "
                    + "\n4-->Borrar cliente. \n5-->Borrar fichero. \n6-->Salir"));
            switch (opcion) {
                case 1:
                    m.crearCliente();
                    break;
                case 2:
                    m.mostrar(listClientes);
                    break;
                case 3:
                    m.consultarCliente(listClientes);
                    break;
                case 4:
                    m.borrarCliente(listClientes);
                    break;
                case 5:
                    File fich = new File("Libreria.txt");
                    f.borrarFichero(fich);
                    f.escribir("Libreria.txt", listClientes);
                    break;
                case 6:
                    m.salir();
                    break;
            }

        } while (opcion < 6);
        
        System.out.println("La opción tiene que ser < 6. Vuleva a iniciar el programa.");
             
    }
  
}
