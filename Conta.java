/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main.newpackage;

/**
 *
 * @author Aluno
 */
public class Conta {

    //declaração de variaveis
    private String banco;
    private int agencia;
    private String numConta;
    private String tipodaConta;
    private double saldoAtual;
    private double limiteDisponivel;

    //abertura do constructor
    public Conta(String banco, int agencia, String numConta, String tipodaConta, double saldoAtual, double limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numConta = numConta;
        this.tipodaConta = tipodaConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }
    //abertura metodos get/set
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipodaConta() {
        return tipodaConta;
    }

    public void setTipodaConta(String tipodaConta) {
        this.tipodaConta = tipodaConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
}
