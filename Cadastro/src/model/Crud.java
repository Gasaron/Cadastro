package model;

import controller.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Crud {

    private final Connection connection;

    public Crud(){
        this.connection = new Conexao().getConnection();
    }

    public void cadastra_Dados(Aluno li){

        try{
            String sql = "INSERT INTO usuario(nome,email) VALUES(?,?)";

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, li.getNome());
            stmt.setString(2, li.getEmail());

            stmt.execute();
            stmt.close();

        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}