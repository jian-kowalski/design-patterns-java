import java.math.BigDecimal;

import br.com.jiankowalsi.loja.pedido.GeraPedido;

public class TestePedidos {
    public static void main(String[] args) {
        var geraPedido = new GeraPedido("Ana da Cruz", new BigDecimal("100"), 10);
        geraPedido.executa();
    }
}
