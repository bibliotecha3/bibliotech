/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bibliotech.bibliotech;

/**
 *
 * @author unity
 */
public class Livros {
 private int id;
 private String nome;
 private String autor;
 private String editora;
 private String genero;
 private String paginas;
 
public Livros (int id, String nome, String autor, String editora, String genero, String paginas) {
    this.id = id;
    this.nome = nome;
    this.autor = autor;
    this.editora = editora;
    this.genero = genero;
    this.paginas = paginas;
}
    public int getId() {
    return id;
 }
    public void setId(int id) {
    this.id = id;
 }
    public String getNome() {
    return nome;
 }
    public void setNome(String nome) {
    this.nome = nome;
 }
    public String getAutor() {
    return autor;
 }
    public void setAutor(String autor) {
    this.autor = autor;
 }
    public String getEditora() {
    return editora;
 }
    public void setEditora(String editora) {
    this.editora = editora;
 }
    public String getGenero() {
    return genero;
 }
     public void setGenero(String genero) {
    this.genero = genero;
 }
     public String getPaginas() {
    return paginas;
 }
     public void setPaginas(String paginas) {
    this.paginas = paginas;
 }
     @Override
 public String toString() {
 return this.nome;
}
        public Livros (String nome, String autor, String editora, String genero, String paginas){
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.paginas = paginas;
    }
        public Livros (int id){
        this.id = id;
    }
}