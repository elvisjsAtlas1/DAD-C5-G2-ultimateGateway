package com.example.ms_venta.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fecha_venta;
    private String id_cliente;
    private String id_usuario;
    private String total;
    private String metodo_pago;
    private String estado;

    public Venta() {}

    public Venta(Integer id, String fecha_venta, String id_cliente, String id_usuario, String total, String metodo_pago, String estado) {
        this.id = id;
        this.fecha_venta = fecha_venta;
        this.id_cliente = id_cliente;
        this.id_usuario = id_usuario;
        this.total = total;
        this.metodo_pago = metodo_pago;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", fecha_venta='" + fecha_venta + '\'' +
                ", id_cliente='" + id_cliente + '\'' +
                ", id_usuario='" + id_usuario + '\'' +
                ", total='" + total + '\'' +
                ", metodo_pago='" + metodo_pago + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}