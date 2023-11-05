package br.com.bibliotech.bibliotech;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unity
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "seubd";
    private static String usuario = "seusuario";
    private static String senha = "suasenha";

    public static Connection obterConexao () throws Exception{
    String url = String.format(
 "jdbc:mysql://%s:%s/%s",
 host,
 porta,
 db
 );
return DriverManager.getConnection(url, usuario, senha);
 }
}

