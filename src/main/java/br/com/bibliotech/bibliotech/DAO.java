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
    String sql = "SELECT * FROM users_bibliotech WHERE nome = ? AND senha = ? AND tipo = ?";
    try (Connection conn = ConexaoBD.obterConexao();
    PreparedStatement ps = conn.prepareStatement(sql)){
    ps.setString(1, usuario.getNome());
    ps.setString(2, usuario.getSenha());
    ps.setString(3, usuario.getTipo());
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
    public void inserirLivros (Livros livro) throws Exception{
    String sql = "INSERT INTO tb_livros (nome, autor, editora, genero, paginas) VALUES (?, ?, ?, ?, ?)";
    try (Connection conexao = ConexaoBD.obterConexao();
    PreparedStatement ps = conexao.prepareStatement(sql)){
    ps.setString(1, livro.getNome());
    ps.setString(2, livro.getAutor());
    ps.setString(3, livro.getEditora());
    ps.setString(4, livro.getGenero());
    ps.setString(5, livro.getPaginas());
    ps.execute();
    }
}
     public void atualizarLivros (Livros livro) throws Exception{
    String sql = "UPDATE tb_livros SET nome = ?, autor = ?, editora = ?, genero = ?, paginas = ? WHERE id = ?";
    try (Connection conexao = ConexaoBD.obterConexao();
    PreparedStatement ps = conexao.prepareStatement(sql)){
    ps.setString (1, livro.getNome());
    ps.setString (2, livro.getAutor());
    ps.setString (3, livro.getEditora());
    ps.setString (4, livro.getGenero());
    ps.setString (5, livro.getPaginas());
    ps.setInt (6, livro.getId());
    ps.execute();
 }
 }
     public void removerLivros (Livros livro) throws Exception{
        String sql = "DELETE FROM tb_livros WHERE id = ?";
        try (Connection conexao = ConexaoBD.obterConexao();
        PreparedStatement ps = conexao.prepareStatement(sql);){
        ps.setInt (1, livro.getId());
        ps.execute();
        }
    }
    String obterTipo(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    
    public Usuario [] obterUsuarios () throws Exception{
        String sql = "SELECT * FROM users_bibliotech";
        try (Connection conn = ConexaoBD.obterConexao();
        PreparedStatement ps = conn.prepareStatement(sql,
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery()){

    int totalDeUsuarios = rs.last () ? rs.getRow() : 0;
    Usuario [] usuario = new Usuario[totalDeUsuarios];
    rs.beforeFirst();
    int contador = 0;
    while (rs.next()){
    int cod_pessoa = rs.getInt("cod_pessoa");
    String nome = rs.getString("nome");
    String senha = rs.getString ("senha");
    String tipo = rs.getString ("tipo");
    usuario[contador++] = new Usuario (cod_pessoa, nome, senha, tipo);
    }
    return usuario;
    }
 }
    public void inserirUsuarios (Usuario usuario) throws Exception{
    String sql = "INSERT INTO users_bibliotech (nome, senha, tipo) VALUES (?, ?, ?)";
    try (Connection conexao = ConexaoBD.obterConexao();
    PreparedStatement ps = conexao.prepareStatement(sql)){
    ps.setString(1, usuario.getNome());
    ps.setString(2, usuario.getSenha());
    ps.setString(3, usuario.getTipo());
    ps.execute();
    }
}
     public void atualizarUsuarios (Usuario usuario) throws Exception{
    String sql = "UPDATE users_bibliotech SET nome = ?, senha = ?, tipo = ? WHERE cod_pessoa = ?";
    try (Connection conexao = ConexaoBD.obterConexao();
    PreparedStatement ps = conexao.prepareStatement(sql)){
    ps.setString (1, usuario.getNome());
    ps.setString (2, usuario.getSenha());
    ps.setString (3, usuario.getTipo());
    ps.setInt (4, usuario.getCod_pessoa());
    ps.execute();
 }
 }
     public void removerUsuarios (Usuario usuario) throws Exception{
 String sql = "DELETE FROM users_bibliotech WHERE cod_pessoa = ?";
 try (Connection conexao = ConexaoBD.obterConexao();
 PreparedStatement ps = conexao.prepareStatement(sql);){
 ps.setInt (1, usuario.getCod_pessoa());
 ps.execute();
        }
     }
}