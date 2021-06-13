package br.com.jiankowalsi.loja.desconto;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDeDesconto = new DescontoPorNumeroDeItens(new DescontoPorValor(new SemDesconto()));
        return cadeiaDeDesconto.calcular(orcamento);

    }
    
}
