/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestiontienda;

/**
 *
 * @author Cesar Carrillo
 */
class Operacion<U, P> {
    private String nombreOperacion;
    private U usuario;
    private P producto;

    public Operacion(String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }

    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public void setNombreOperacion(String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }

    public U getUsuario() {
        return usuario;
    }

    public void setUsuario(U usuario) {
        this.usuario = usuario;
    }

    public P getProducto() {
        return producto;
    }

    public void setProducto(P producto) {
        this.producto = producto;
    }
}

