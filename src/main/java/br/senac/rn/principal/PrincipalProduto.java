
package br.senac.rn.principal;
import br.senac.rn.dao.ProdutoDAO;
import br.senac.rn.model.Produto;

public class PrincipalProduto {

    public static void main(String[] args) {

    Produto p1 = new Produto();
    Produto p2 = new Produto();
    Produto p3 = new Produto();
    Produto p4 = new Produto();
    
    p1.setNome("Arroz");
    p1.setDescricao("Alimentos");
    p1.setPreco(2.00f);
    
            
    p2.setNome("Feijao");
    p2.setDescricao("Alimentos");
    p2.setPreco(1.80f);
            
    p3.setNome("coca-cola");
    p3.setDescricao("bebidas");
    p3.setPreco(5.80f);
            
    p4.setNome("sprite");
    p4.setDescricao("bebidas");
    p4.setPreco(4.80f);
//    
        ProdutoDAO dao = new ProdutoDAO();
////        
       dao.inserir(p1);
       dao.inserir(p2);
       dao.inserir(p3);
       dao.inserir(p4);
       
//       dao.excluir(dao.buscarPorId(7)); //exclui no banco atraves do id
//       dao.excluir(dao.buscarPorId(8));
       
       System.exit(0);
    }
}
