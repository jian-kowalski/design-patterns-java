import java.math.BigDecimal;

import br.com.jiankowalsi.loja.desconto.CalculadoraDeDescontos;
import br.com.jiankowalsi.loja.orcamento.Orcamento;

public class TesteDescontos {
    public static void main(String[] args) {
        var orcamentoItens = new Orcamento(new BigDecimal("200"), 6);
        var orcamentoValor = new Orcamento(new BigDecimal("1000"), 1);
        var calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamentoItens));
        System.out.println(calculadora.calcular(orcamentoValor));
    }
}
