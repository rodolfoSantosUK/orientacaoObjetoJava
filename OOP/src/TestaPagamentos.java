import java.util.ArrayList;

public class TestaPagamentos {

    public static void main(String[] args) {
        Pagamentos pagamentos = new Pagamentos();
        Pagamento pagamento1 = new Pagamento();
        Pagamento pagamento2 = new Pagamento();

        pagamento1.setValor(105);
        pagamento2.setValor(25);

        pagamentos.registraPagamento(pagamento1);
        pagamentos.registraPagamento(pagamento2);

        System.out.println("Valor total pago:  " + pagamentos.getValorPago());



    }

}
