package com.example.exercicio05;

public class ContaPoupanca extends ContaBancaria{

    private double taxaRendimento;

    public ContaPoupanca(String titular, int numeroConta ,double taxaRendimento){
        super(titular, numeroConta);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        saldo += saldo * (taxaRendimento / 100);
        System.out.println("Rendimento aplicado com sucesso, seu novo saldo é de R$ " + saldo);
        System.out.println(" -----------");
    }
}
