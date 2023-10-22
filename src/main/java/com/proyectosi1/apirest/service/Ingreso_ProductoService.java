package com.proyectosi1.apirest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyectosi1.apirest.entity.Ingreso_ProductoEntity;
import com.proyectosi1.apirest.repository.Ingreso_ProductoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class Ingreso_ProductoService {
    private final Ingreso_ProductoRepository ingreso_ProductoService;

    public Ingreso_ProductoEntity crearIngreso_Producto(Ingreso_ProductoEntity ingreso_Producto){
        return ingreso_ProductoService.save(ingreso_Producto);
    }

    // Actualiza un registro de Ingreso_Producto en la base de datos
    public Ingreso_ProductoEntity updateIngreso_Producto(Ingreso_ProductoEntity ingreso_Producto) {
        return ingreso_ProductoService.save((ingreso_Producto));
    }

    public void deleteIngreso_Producto(Integer id) {
        ingreso_ProductoService.deleteById(id);
    }

    public Ingreso_ProductoEntity getIngreso_Producto(Integer id) {
        return ingreso_ProductoService.findById(id).orElse(null);
    }

    public List<Ingreso_ProductoEntity> getAllIngreso_Productos() {
        return ingreso_ProductoService.findAll();
    }

}