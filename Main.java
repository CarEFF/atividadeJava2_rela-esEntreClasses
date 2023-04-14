/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.newpackage;

/**
 *
 * @author Aluno
 */
    public class Main {
    public static void main(String[] args) {

        //Alimentando dados via set para inserção na Class
        Conta contaBancaria = new Conta("Bradesco", 9999, "9999-9", "Corrente", 10000.00,20000.00);
        Funcionario dadosFuncionario = new Funcionario(1, "Igor Xibatiado", "Rua da o Furo", "99-99999-9999", "igorxibatiado@gmail", contaBancaria);

        //exibindo dados armazenados
        System.out.println("D A D O S   F U N C I O N A R I O");
        System.out.println("Codigo Funcionario: "+dadosFuncionario.getCodigoFuncionario());
        System.out.println("Nome: "+dadosFuncionario.getNome());
        System.out.println("Endereço: "+dadosFuncionario.getEndereco());
        System.out.println("Telefone: "+dadosFuncionario.getTelefone());
        System.out.println("Email: "+dadosFuncionario.getEmail());
        System.out.println("Banco: " +dadosFuncionario.getBanco().getBanco());
        System.out.println("Agência: "+dadosFuncionario.getBanco().getAgencia());
        System.out.println("Conta: "+dadosFuncionario.getBanco().getNumConta());
    }
}