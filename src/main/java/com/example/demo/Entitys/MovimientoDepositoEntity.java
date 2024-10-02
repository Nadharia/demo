package com.example.demo.Entitys;

import jakarta.persistence.*;

@Entity
public class MovimientoDepositoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private ProductoEntity producto; // Referencia a ProductoEntity

    @ManyToOne
    @JoinColumn(name = "deposito_id", referencedColumnName = "id")
    private DepositoEntity deposito; // Referencia a DepositoEntity

    @ManyToOne
    @JoinColumn(name = "deposito2_id", referencedColumnName = "id")
    private DepositoEntity2 deposito2;

    @ManyToOne
    @JoinColumn(name = "proveedor_id", referencedColumnName = "id")
    private ProveedorEntity proveedor;

    @ManyToOne
    @JoinColumn(name = "tipo_producto_id", referencedColumnName = "id")
    private TipoProductoEntity tipoProducto;


    private int cantidad;
    private String fechamovimiento;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechamovimiento() {
        return fechamovimiento;
    }

    public void setFechamovimiento(String fechamovimiento) {
        this.fechamovimiento = fechamovimiento;
    }


}
