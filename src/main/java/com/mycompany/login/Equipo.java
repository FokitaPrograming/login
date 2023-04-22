package com.mycompany.login;

import java.util.ArrayList;

public class Equipo {
    private final String capitan;
    private final String nombre;
    private final ArrayList<Usuario> arraylist;

    public Equipo(String capitan, String nombre) {
        this.capitan=capitan;
        this.nombre=nombre;
        this.arraylist=new ArrayList<>();
    }

    public ArrayList<Usuario> getArraylist() {
        return this.arraylist;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapitan() {
        return capitan;
    }

    public void setArraylist(Usuario estudiante) {
        this.arraylist.add(estudiante);
    }
}
