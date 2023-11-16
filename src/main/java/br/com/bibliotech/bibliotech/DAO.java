/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bibliotech.bibliotech;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author unity
 */
public class DAO {
    public boolean existe (Usuario usuario) throws Exception{
    String sql = "SELECT * FROM users_bibliotech WHERE nome = ? AND senha = ?";
    try (Connection conn = ConexaoBD.obterConexao();
    PreparedStatement ps = conn.prepareStatement(sql)){
    ps.setString(1, usuario.getNome());
    ps.setString(2, usuario.getSenha());
    try (ResultSet rs = ps.executeQuery()){
    return rs.next();
   }
  }
 }
    public Livros [] obterLivros () throws Exception{
     String sql = "SELECT * FROM tb_livros";
    try (Connection conn = ConexaoBD.obterConexao();
    PreparedStatement ps =
    conn.prepareStatement(sql,
     ResultSet.TYPE_SCROLL_INSENSITIVE,
     ResultSet.CONCUR_READ_ONLY);
    ResultSet rs = ps.executeQuery()){

    int totalDeLivros = rs.last () ? rs.getRow() : 0;
    Livros [] livros = new Livros[totalDeLivros];
    rs.beforeFirst();
    int contador = 0;
    while (rs.next()){
    int id = rs.getInt("id");
    String nome = rs.getString("nome");
    String autor = rs.getString ("autor");
    String editora = rs.getString ("editora");
    String genero = rs.getString ("genero");
    String paginas = rs.getString ("paginas");
    livros[contador++] = new Livros (id, nome, autor, editora, genero, paginas);
    }
    return livros;
    }
 }
   
}
