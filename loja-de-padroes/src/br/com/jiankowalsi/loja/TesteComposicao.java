package br.com.jiankowalsi.loja;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.orcamento.ItemOrcamento;
import br.com.jiankowalsi.loja.orcamento.Orcamento;
import br.com.jiankowalsi.loja.orcamento.OrcamentoProxy;

public class TesteComposicao {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        orcamento.reprovar();

        var orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        orcamentoNovo.adicionarItem(orcamento);

        OrcamentoProxy proxy = new OrcamentoProxy(orcamentoNovo);
        System.out.println(proxy.getValor().toString());
        System.out.println(proxy.getValor().toString());
    }

}
