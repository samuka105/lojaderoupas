import java.lang.reflect.Array;
import java.util.ArrayList;

public class Estoque
{

    private ArrayList<Vestimenta> vestimentas = new ArrayList<>(); //Cria um ArrayList de Vestimentas

    public ArrayList<Vestimenta> getVestimentas()
    {
        return vestimentas;
    }

    public void setVestimentas(ArrayList<Vestimenta> vestimentas)
    {
        this.vestimentas = vestimentas;
    }

    public float retornaQuantosItensNoEstoque() //Retorna o numero de itens no Estoque
    {

        float total = 0;
        for (Vestimenta vestimenta: vestimentas) {
            total++;
        }
        return total;
    }

    public void imprimirEstoque() //Imprime a etiqueta dos Itens no Estoque
    {
        for (Vestimenta vestimenta: vestimentas)
        {
            System.out.println(vestimenta.getEtiqueta());
        }
    }


