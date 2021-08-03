package com.informatorio.ejerciciocomplementariorest1.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<LineaCarrito> lineaCarritos;

    private String nombre;
    private String descripcion;
    private float precioUnitario;

    private long codigoDeInventario; //no es id pero es unico
    private String categoria;

    public Producto(){

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public long getCodigoDeInventario() {
        return codigoDeInventario;
    }
    public void setCodigoDeInventario(long codigoDeInventario) {
        this.codigoDeInventario = codigoDeInventario;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
