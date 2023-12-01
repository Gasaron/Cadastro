package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection getConnection(){
        //tratando exceção ou erro de conexão TRY executa o código
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/projeto_crud", "root","");
            //caso ocorrer uma exceção e tratado pelo CATCH e apresentado o tipo de excceção que ocorreu
        } catch(SQLException excecao){
            //aqui mostra o tipo de exceção
            throw new RuntimeException(excecao);

        }
    }
}
