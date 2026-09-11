import java.util.ArrayList;

public class aula {
    public static void main(String[] args) {
        java.util.ArrayList<String> carrinho = new ArrayList<>();

        carrinho.add("Notebook");
        carrinho.add("Mouse");
        carrinho.add("Teclado");
        carrinho.add("Monitor");
        carrinho.add("Mousepad");
        carrinho.add("Fonte");
        carrinho.add("Gabinete");
        carrinho.add("Webcam");
        carrinho.add("Fone");

        carrinho.remove("Mouse");
        System.out.println("depois de remover: "+carrinho);

        System.out.println("Ultimo produto " + carrinho.get(7));
        System.out.println(carrinho);
        System.out.println("Total de produtos: " + carrinho.size());
    }
}
