/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafomatrizadyacencias;

/**
 *
 * @author usuario
 */
public class Grafo {
    private Dato[] vertices;
    private Dato[][] matriz;
    
    public Grafo(int tam) {
        vertices = new Dato[tam];
        matriz = new Dato[tam][tam];
    }
    
    public void setVertice(Dato dato, int indice) {
        vertices[indice] = dato;
    }
    
    public String getNombrePorIndice(int indice) {
        return vertices[indice].getNombre();
    }
    
    public void agregarEstado(int i, int j, Dato estado) {
        matriz[i][j] = estado;
    }
}
