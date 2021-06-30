public class Vestimenta
{
    private int etiqueta; //armazena um número
    private float preco; //preço da vestimenta

    public Vestimenta(int etiqueta, float preco)
    {
        this.etiqueta = etiqueta;
        this.preco = preco;
    }

    public int getEtiqueta()
    {
        return etiqueta;
    }

    public float getPreco()
    {
        return preco;
    }

    public void setEtiqueta(int etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    public void setPreco(float preco)
    {
        this.preco = preco;
    }
}
