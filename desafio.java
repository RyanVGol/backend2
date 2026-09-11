import java.util.ArrayList;

public class desafio{
    public static void main(String[] arc){
     java.util.ArrayList<String> carrinho = new ArrayList<>();

     carrinho.add("Maça");
     carrinho.add("Banana");
     carrinho.add("pitaya");
     carrinho.add("durião");
     carrinho.add("abacate");

     System.out.println(carrinho);

     System.out.println("quinta fruta do estoque " + carrinho.get(4));
     System.out.println("tipos de frutas vendidas " + carrinho.size());
    
     carrinho.remove("durião");
     System.out.println("Frutas no carrinho depois da retirada do durião " + carrinho);

    }


}