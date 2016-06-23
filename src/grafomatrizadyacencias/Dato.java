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
public class Dato {
    private String nombre;
    private int estado;

    public Dato(String nombre, int estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dato{" + "nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
}
