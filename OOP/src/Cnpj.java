public class Cnpj {

    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Cnpj{" +
                "valor='" + valor + '\'' +
                '}';
    }

    public boolean cnpjValido() {
        return primeiroDigitoVerificador() == primeiroDigitoCorreto() &&
                segundoDigitoVerificador() == segundoDigitoCorreto();
    }

    private int primeiroDigitoCorreto() {
        return 1;
    }

    private int segundoDigitoCorreto() {
        return 2;
    }

    private int primeiroDigitoVerificador() {
        return 1;
    }

    private int segundoDigitoVerificador() {
       return 2;
    }




}
