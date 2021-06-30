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
}
