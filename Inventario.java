import java.util.ArrayList;

public class Inventario {

    private ArrayList<RoupaFactory> factorys = new ArrayList<RoupaFactory>();

    public Inventario() {
        factorys.add(new RoupaEsportivaFactory());
        factorys.add(new RoupaSocialFactory());
    }

    public void showInventory() {
        int i = 1;
        for (RoupaFactory factory: factorys) {
            Produto p = factory.criarCamisa();
            System.out.println(i + ". " + p.getNome());
            i++;
        }
    }

    public Produto getProduto(int index) {
        if (index <= 0 || index > factorys.size()) {
            return null;
        }
        return factorys.get(index - 1).criarCamisa();
    
    }
}