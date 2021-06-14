package br.com.jiankowalsi.loja;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.desconto.CalculadoraDeDescontos;
import br.com.jiankowalsi.loja.orcamento.ItemOrcamento;
import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class TesteDescontos {
    public static void main(String[] args) {

        var orcamentoValor = new Orcamento();
        orcamentoValor.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        var calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamentoValor));
    }
}
