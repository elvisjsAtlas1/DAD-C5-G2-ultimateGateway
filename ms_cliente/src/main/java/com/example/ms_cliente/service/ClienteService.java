package com.example.ms_cliente.service;

import com.example.ms_cliente.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    public List<Cliente> listar();

    public Cliente guardar(Cliente cliente);

    public Cliente actualizar(Cliente cliente);

    public Optional<Cliente> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}