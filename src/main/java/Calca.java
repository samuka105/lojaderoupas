public class Calca extends Vestimenta
{
    private String cor;
    private String tipoDeCalca;
    private String tamanho;

    public Calca(int etiqueta, float preco, String tamanho, String cor, String tipoDeCalca)
    {
        super(etiqueta, preco);
        this.tamanho = tamanho;
        this.cor = cor;
        this.tipoDeCalca = tipoDeCalca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoDeCalca() {
        return tipoDeCalca;
    }

    public void setTipoDeCalca(String tipoDeCalca) {
        this.tipoDeCalca = tipoDeCalca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
}
