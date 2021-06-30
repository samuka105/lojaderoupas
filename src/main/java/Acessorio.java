public class Acessorio extends Vestimenta
{
    private String marca;

    public Acessorio(int etiqueta, float preco, String marca)
    {
        super(etiqueta, preco);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
