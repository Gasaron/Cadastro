package view;

import javax.swing.*;

public class Cad_aluno extends JFrame{
    private JTextField jText_nome, jText_email;
    private JLabel lbl_nome, lbl_email;
    private static JButton grava, sair;

    //Construtor
    public Cad_aluno(){
        super("CADASTRO DE ALUNO");
        JPanel painel = new JPanel();
        painel.setLayout(null);
        //Adicionando o painel dentro do JFrame
        this.getContentPane().add(painel);

        //adicionando os objetos no painel
        lbl_nome = new JLabel("NOME: ");
        jText_nome = new JTextField();
        lbl_email = new JLabel("EMAIL: ");
        jText_email = new JTextField();
        grava = new JButton("GRAVAR");
//        sair = new JButton("SAIR");
        //adicionando os objetos no painel
        painel.add(lbl_nome);
        painel.add(lbl_email);
        painel.add(grava);
//        painel.add(sair);

        //posicionamento
        lbl_nome.setBounds(20,20,200,20);
        jText_nome.setBounds(100,20,200,20);

    }

    public static void main(String[] args){

    }
}
