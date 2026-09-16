

import java.util.HashMap;
public class aula3 {
public static void main(String[] args) {
HashMap<Integer, String> produtos = new HashMap<>();
produtos.put(101, "Notebook"); 
produtos.put(102, "Mouse"); 
produtos.put(103, "Teclado");
System.out.println(produtos);
System.out.println("Produto 102: " + produtos.get(102));
if (produtos.containsKey(999)) {
System.out.println("Produto: " + produtos.get(999));
} else {
System.out.println("Produto não encontrado!");
}
produtos.remove(102);
System.out.println("Depois de remover: " + produtos);
}
}
