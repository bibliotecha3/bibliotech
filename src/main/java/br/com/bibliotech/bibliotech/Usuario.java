/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bibliotech.bibliotech;

/**
 *
 * @author unity
 */
public class Usuario {
    private int cod_pessoa;
    private String nome;
    private String senha;
    private String tipo;
    
public Usuario(int cod_pessoa, String nome, String senha, String tipo) {
    this.cod_pessoa = cod_pessoa;
    this.nome = nome;
    this.senha = senha;
    this.tipo = tipo;
 }
    public int getCod_pessoa() {
    return cod_pessoa;
 }
    public void setCod_pessoa(int cod_pessoa) {
    this.cod_pessoa = cod_pessoa;
 }
    public String getNome() {
    return nome;
 }
    public void setNome(String nome) {
    this.nome = nome;
 }
    public String getSenha() {
    return senha;
 }
    public void setSenha(String senha) {
    this.senha = senha;
 }
    public String getTipo() {
    return tipo;
    }
    public void setTipo(String tipo) {
    this.tipo = tipo;
    }
    @Override
 public String toString() {
 return this.nome;
}
        public Usuario (String nome, String senha, String tipo){
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
}
        public Usuario (int cod_pessoa){
        this.cod_pessoa = cod_pessoa;
        }
}


