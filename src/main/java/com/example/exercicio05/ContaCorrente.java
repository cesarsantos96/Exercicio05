package com.example.exercicio05;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public  ContaCorrente(String titular, int numeroConta, double limiteChequeEspecial){
        super(titular, numeroConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    @Override
    public void sacar(double valor){
        if (valor >0 && (saldo+ limiteChequeEspecial) >= valor){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso ");
        }else {
            System.out.println("Saque inválido, saldo insuficiente");
        }
    }
}
