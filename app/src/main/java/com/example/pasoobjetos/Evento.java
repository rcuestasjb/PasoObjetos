package com.example.pasoobjetos;
class Evento  {
    String categoria;
    String descripcion;
    String dia;
    String hora;
    String id;
    String titulo;
    public Evento(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() { return titulo; }
}