package br.com.jiankowalsi.loja.desconto;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoPorNumeroDeItens(new DescontoPorValor(new SemDesconto()));
        return desconto.calcular(orcamento);

    }
    
}
