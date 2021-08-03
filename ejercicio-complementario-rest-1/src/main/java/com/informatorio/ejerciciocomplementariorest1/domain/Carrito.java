package com.informatorio.ejerciciocomplementariorest1.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<LineaCarrito> lineaCarritos;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    private LocalDate fechaDeCreacion;

    @OneToOne(mappedBy = "carrito")
    private Usuario usuario;

    private double precioFinal;

    public Carrito(){

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }
    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public List<LineaCarrito> getLineaCarritos() {
        return lineaCarritos;
    }
    public void setLineaCarritos(List<LineaCarrito> lineaCarritos) {
        this.lineaCarritos = lineaCarritos;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public double getPrecioFinal() {
        return precioFinal;
    }
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
}
