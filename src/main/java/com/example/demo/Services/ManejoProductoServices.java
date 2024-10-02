package com.example.demo.Services;

import com.example.demo.Entitys.DepositoEntity;
import com.example.demo.Entitys.DepositoEntity2;
import com.example.demo.Repository.RepositoryDeposito1;
import com.example.demo.Repository.RepositoryDeposito2;

import java.util.List;

public class ManejoProductoServices {

    private RepositoryDeposito1 depositoRepository1;
    private RepositoryDeposito2 depositoRepository2;


    public List<DepositoEntity> obtenerAllProducts1(){
        return depositoRepository1.findAll();
    }

    public List<DepositoEntity2> obtenerAllProducts2(){
        return depositoRepository2.findAll();
    }


}
