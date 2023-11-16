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
    private static String host = "projetobilbiotech-bibliotecha3.a.aivencloud.com";
    private static String porta = "17243";
    private static String db = "defaultdb";
    private static String usuario = "avnadmin";
    private static String senha = "AVNS_jSNGniC83B5x0r57XgI";

    public static Connection obterConexao () throws Exception{
    String url = String.format(
 "jdbc:postgresql://%s:%s/%s",
 host,
 porta,
 db
 );
return DriverManager.getConnection(url, usuario, senha);
 }
}

