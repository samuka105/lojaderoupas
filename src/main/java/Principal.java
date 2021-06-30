import java.util.ArrayList;

public class Principal
{
    public static void main(String[] args)
    {

        ArrayList<Vestimenta> vestimentas = new ArrayList<Vestimenta>(); //Aloca um Array de Vestimentas

        Estoque e = new Estoque(); //Aloca um estoque

        Camiseta v1 = new Camiseta(); //Cria uma vestimenta
        v1.setEtiqueta(11);
        v1.setPreco(48.00f);
        v1.setCor('Vermelho');
        v1.setTipoDeCamiseta('Regata');
        v1.setTamanho('M');

        Calca v2 = new Calca(); //Cria uma vestimenta
        v2.setEtiqueta(12);
        v2.setPreco(22.00f);
        v2.setCor('Azul');
        v2.setTipoDeCalca('Jeans');
        v2.setTamanho('P');

        Pulseira v3 = new Pulseira(); //Cria uma vestimenta
        v3.setEtiqueta('2');
        v3.setPreco(89.00f);
        v3.setPrataOuOuro(true);

        vestimentas.add(v1);
        vestimentas.add(v2);
        vestimentas.add(v3);

        e.setVestimentas(vestimentas); //Atribui ao ArrayList no estoque, o valor do ArrayList na Principal
        System.out.println(e.retornaQuantosItensNoEstoque());
        e.imprimirEstoque();

    }
}
