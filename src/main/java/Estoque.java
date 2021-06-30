import java.util.List;

public class Estoque
{
    public static float imprimirQuantosItensNoEstoque(List<Vestimenta> vestimentas) {

        float total = 0;
        for (Vestimenta vestimenta: vestimentas) {
            total++;
        }
        return total;
    }

    public static float imprimirEstoque(List<Vestimenta> vestimentas)
    {
        for (Vestimenta vestimenta: vestimentas)
        {
            System.out.println(vestimenta.getEtiqueta());
        }
}
