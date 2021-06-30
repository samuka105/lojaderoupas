public class Camiseta extends Vestimenta
{
    private String cor;
    private String tipoDeCamiseta;
    private String tamanho;

    public Camiseta(int etiqueta, float preco, String cor, String tipoDeCamiseta, String tamanho) //Construtor
    {
        super(etiqueta, preco);
        this.cor = cor;
        this.tipoDeCamiseta = tipoDeCamiseta;
        this.tamanho = tamanho;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public String getTipoDeCamiseta()
    {
        return tipoDeCamiseta;
    }

    public void setTipoDeCamiseta(String tipoDeCamiseta)
    {
        this.tipoDeCamiseta = tipoDeCamiseta;
    }

    public String getTamanho()
    {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
}
