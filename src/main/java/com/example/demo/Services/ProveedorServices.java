package com.example.demo.Services;

import com.example.demo.Entitys.DepositoEntity;
import com.example.demo.Entitys.ProveedorEntity;
import com.example.demo.Repository.RepositoryDeposito1;
import com.example.demo.Repository.RepositoryProveedor;

public class ProveedorServices {
    private RepositoryDeposito1 repositoryDeposito1;
    private RepositoryProveedor repositoryProveedor;


    public void pedidoProducto(Long idProducto, int cantidad){
        DepositoEntity depositoIngreso=repositoryDeposito1.findById(idProducto).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        ProveedorEntity egresoProveedor=repositoryProveedor.findById(idProducto).orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        depositoIngreso.setCantidad(depositoIngreso.getCantidad()+cantidad);
        egresoProveedor.setCantidad(egresoProveedor.getCantidad()-cantidad);
    }

}
