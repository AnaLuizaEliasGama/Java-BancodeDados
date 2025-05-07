/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Fornecedor;

/**
 *
 * @author vagne
 */
public class FornecedorDAO {
    Conexao c = new Conexao();
    
    public void salvar(Fornecedor objFornecedor) {
        
        
        try {
            String sql;
            System.out.println("Entra ");
            if (objFornecedor.getId() == null) {
                sql = "INSERT INTO fornecedor(nome,cnpj,telefone) VALUES(?,?,?,?)";
                System.out.println("Entra SALVAR");
                
                PreparedStatement stmt = c.con().prepareStatement(sql);

                stmt.setString(1, objFornecedor.getNome());
                stmt.setString(2, objFornecedor.getCnpj());
                stmt.setString(3, objFornecedor.getTelefone());
                System.out.println("Executa");
                stmt.execute();
                stmt.close();
                c.con().close();
                

            } else {
                System.out.println("Entra UPDATE");
                sql = "UPDATE fornecedor SET nome = ?, cnpj = ?, telefone = ? WHERE fornecedor.id = ?";

                PreparedStatement stmt = c.con().prepareStatement(sql);

                stmt.setString(5, objFornecedor.getId());
                stmt.setString(1, objFornecedor.getNome());
                stmt.setString(2, objFornecedor.getCnpj());
                stmt.setString(3, objFornecedor.getTelefone());
                stmt.execute();
                stmt.close();
                c.con().close();

            }
        } catch (SQLException e) {
            System.out.println("CATCH   ");
            e.printStackTrace();
        }
    }

    public  List<Fornecedor> buscar(String objFornecedor, String tipo) {
        List<Fornecedor> list = new ArrayList<>();
        try {
            String sql = "";
            if (tipo.equals("nome")) {
                sql = "SELECT * FROM fornecedor WHERE nome LIKE '%" + objFornecedor + "%' ";

            }

            PreparedStatement ps = c.con().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Fornecedor(
                    rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("cnpj"),
                    rs.getString("telefone")
                ));

            }
            ps.close();
            rs.close();
           
            c.con().close();

            return list;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }
    }

    public void deletar(int id) {
        try {
            String sql;
            if (id != 0) {
                sql = "DELETE FROM fornecedor WHERE id = ?";
                PreparedStatement stmt = c.con().prepareStatement(sql);

                stmt.setString(1, ""+ id);
                stmt.execute();
                stmt.close();
                c.con().close();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public List<Fornecedor> listarTodos() {
        try {

            List<Fornecedor> list = new ArrayList();

            PreparedStatement ps = c.con().prepareStatement("SELECT * FROM fornecedor");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new Fornecedor(
                    rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("cnpj"),
                    rs.getString("telefone")
                ));

            }
            ps.close();
            rs.close();
            c.con().close();

            return list;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }
    }

//    public static void testarConexao() throws SQLException {
//        try (Connection objConnection = new ConnectionFactory().getConnection()) {
//            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso! ");
//        }
//    }
}
