package com.example.demo.Entitys;

import jakarta.persistence.*;

@Entity
public class ProductoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    private int cantidad_producto;

    public ProductoEntity(){}


    @ManyToOne
    @JoinColumn(name = "proveedor_Id", referencedColumnName ="id")
    private ProveedorEntity proveedorEntity;

    @ManyToOne
    @JoinColumn(name = "tipo_producto_id", referencedColumnName = "id")
    private TipoProductoEntity tipoProducto;
}
