public class Pulseira extends Acessorio
{
    private boolean PrataOuOuro; //Se verdadeiro, é Prata. Se falso, é de Ouro.

    public Pulseira(int etiqueta, float preco, String material, boolean prataOuOuro)
    {
        super(etiqueta, preco, material);
        PrataOuOuro = prataOuOuro;
    }

}
