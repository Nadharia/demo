package com.example.demo.Services;

import com.example.demo.Entitys.DepositoEntity;
import com.example.demo.Entitys.DepositoEntity2;
import com.example.demo.Repository.RepositoryDeposito1;
import com.example.demo.Repository.RepositoryDeposito2;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

public class DepositoServices{

    @Autowired
    private RepositoryDeposito1 repositoryDeposito1;

    @Autowired
    private RepositoryDeposito2 repositoryDeposito2;


    @Transactional
    public void transferirProductos1(Long idDepositoOrigen,Long idDepositoDestino,int cantidad) {
        DepositoEntity depositoEgreso = repositoryDeposito1.findById(idDepositoOrigen).orElseThrow(() -> new RuntimeException("Deposito no encontrado"));
        DepositoEntity2 depositoIngreso = repositoryDeposito2.findById(idDepositoDestino).orElseThrow(() -> new RuntimeException("Deposito no encontrado"));


        if (depositoEgreso.getCantidad() < cantidad) {
            throw new RuntimeException("Cantidad insuficiente");

        }

        depositoEgreso.setCantidad(depositoEgreso.getCantidad() - cantidad);
        depositoIngreso.setCantidad(depositoIngreso.getCantidad() - cantidad);

        repositoryDeposito1.save(depositoEgreso);
        repositoryDeposito2.save(depositoIngreso);
    }

    @Transactional
    public void tranferirProductos2(){

    }


}
