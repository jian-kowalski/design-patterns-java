package br.com.jiankowalsi.loja;

import java.math.BigDecimal;

import br.com.jiankowalsi.loja.http.JavaHttpClient;
import br.com.jiankowalsi.loja.orcamento.Orcamento;
import br.com.jiankowalsi.loja.orcamento.RegistroDeOrcamento;

public class TesteAdapterHttp {
    public static void main(String[] args) {
        
        var orcamento = new Orcamento(new BigDecimal("1000"), 1);
        orcamento.aprovar();
        orcamento.finalizar();
        RegistroDeOrcamento regitro = new RegistroDeOrcamento(new JavaHttpClient());
        regitro.registrar(orcamento);
    }
}
