public class Camiseta extends Vestimenta
{
    private String cor;
    private String tipoDeCamiseta;
    private String tamanho;

    public Camiseta(int etiqueta, float preco, String tamanho, String cor, String tipoDeCamiseta)
    {
        super(etiqueta, preco);
        this.tamanho = tamanho;
        this.cor = cor;
        this.tipoDeCamiseta = tipoDeCamiseta;
    }
}
