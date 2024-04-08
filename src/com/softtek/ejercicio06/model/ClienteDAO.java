package com.softtek.ejercicio06.model;

public class ClienteDAO {
    private iDAO conexion;

    public ClienteDAO() {
    }

    public ClienteDAO(iDAO conexion) {
        this.conexion = conexion;
    }

    public iDAO getConexion() {
        return conexion;
    }

    public void setConexion(iDAO conexion) {
        this.conexion = conexion;
    }

    public void insertar(Cliente c1){
    }
}
