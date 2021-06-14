package br.com.jiankowalsi.loja;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.imposto.CalculadoraDeImpostos;
import br.com.jiankowalsi.loja.imposto.ICMS;
import br.com.jiankowalsi.loja.imposto.ISS;
import br.com.jiankowalsi.loja.orcamento.ItemOrcamento;
import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class TesteImpostos {
    public static void main(String[] args) {

        var orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
        var calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));

    }
}
