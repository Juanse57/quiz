package com.example.nuevoproyecto.clases;

public class Usuario {
    private String imagen;
    private String nombre;
    private String curso; // Usaremos esta variable como descripción o categoría

    public Usuario(String imagen, String nombre, String curso) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getImagen() { return imagen; }
    public String getNombre() { return nombre; }
    public String getCurso() { return curso; }
}