/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafomatrizadyacencias;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Menu {
    public Menu () throws ExcepcionGrafo {
        int cantidadVertices = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de vertices que necesita"));
        if(cantidadVertices <= 0) {
            throw new ExcepcionGrafo("La cantidad no puede ser menor o igual a 0");
        }
        Grafo grafo = new Grafo(cantidadVertices);
        
        for (int i = 0; i < cantidadVertices; i++) {
            String nombre = JOptionPane.showInputDialog("Digite el nombre del vertice numero: " + (i+1));
            if(nombre.equals("")) {
                throw new ExcepcionGrafo("El nombre del vertice no puede estar vacio");
            }
            Dato nuevo = new Dato(nombre, 0);
            grafo.setVertice(nuevo, i);
        }
        
        for (int i = 0; i < cantidadVertices; i++) {
            String nombre1 = grafo.getNombrePorIndice(i);
            for (int j = 1; j < cantidadVertices; j++) {
                String nombre2 = grafo.getNombrePorIndice(j);
                int conexion = Integer.parseInt(JOptionPane.showInputDialog(nombre1 +" tiene conexion con " + nombre2 + " ?\n1. Si 2. No"));
                Dato nuevo = new Dato("", 0);
                if(conexion != 0 && conexion != 1) {
                    throw new ExcepcionGrafo("La opcion es invalida");
                }
                if(conexion == 1) {
                    nuevo.setEstado(1);
                } else {
                    nuevo.setEstado(0);
                }
                grafo.agregarEstado(i, j, nuevo);
                grafo.agregarEstado(j, i, nuevo);
            }
        }
    }
}
