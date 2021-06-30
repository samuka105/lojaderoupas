public class Colar extends Acessorio
{
    private boolean PrataOuMicanga; //se é verdadeiro, é prata. Se falso, é um colar de miçangas.

    public Colar(int etiqueta, float preco, String material, boolean prataOuMicanga)
    {
        super(etiqueta, preco, material);
        PrataOuMicanga = prataOuMicanga;
    }

    public boolean isPrataOuMicanga() {
        return PrataOuMicanga;
    }

    public void setPrataOuMicanga(boolean prataOuMicanga) {
        PrataOuMicanga = prataOuMicanga;
    }
}
