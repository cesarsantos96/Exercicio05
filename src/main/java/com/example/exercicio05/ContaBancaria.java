package com.example.exercicio05;

public class ContaBancaria {

    public String titular;

    public int numeroConta;

    protected double saldo;


    public  ContaBancaria( String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
}
    public int getNumeroConta(){
        return numeroConta;
    }
    public void depositar(double valor){
        if (valor >0){
            this.saldo = valor;
            System.out.println("Deposito " + valor + " realizado na conta de " + this.titular);
        } else{
            System.out.println("Valor inválido para deposito");
        }
}

    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado na conta de " + this.titular);
        }
    }

    public void mostarSaldo(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta:  " + this.numeroConta);
        System.out.println("Saldo:  " + this.saldo);
    }
    public void mostarSaldo1(){
        System.out.println("Saldo: " + this.saldo);
    }

}
