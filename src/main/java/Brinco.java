public class Brinco extends Acessorio
{
    private boolean comPerolas;

    public Brinco(int etiqueta, float preco, String material, boolean comPerolas)
    {
        super(etiqueta, preco, material);
        this.comPerolas = comPerolas;
    }
}
