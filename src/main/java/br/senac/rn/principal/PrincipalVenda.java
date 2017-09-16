package br.senac.rn.principal;
import br.senac.rn.dao.ClienteDAO;
import br.senac.rn.dao.ProdutoDAO;
import br.senac.rn.dao.VendaDAO;
import br.senac.rn.dao.ValorDAO;
import br.senac.rn.model.Produto;
import br.senac.rn.model.Venda;
import java.util.List;

public class PrincipalVenda {

    public static void main(String[] args) {

    Venda v1 = new Venda();
    Venda v2 = new Venda();
    Venda v3 = new Venda();
    
    
//        
    
    v1.setCliente(new ClienteDAO().buscarPorId(1));
    v1.setProdutos(List<Produto> Produto = dao.getList());
    
    v1.setValor(new ValorDAO().buscarPorId(1));
    
    
//        Produto x2 = new ProdutoDAO().buscarPorId(2);    
        
    c2.setCliente("Nunes");
    c2.setProdutos("987654321");
    c2.setValor(new ValorDAO().buscarPorId(1));
    
            
//        Produto x3 = new ProdutoDAO().buscarPorId(3);
            
    c3.setCliente("Maria");
    c3.setProdutos("159753852");
    c3.setValor(new ValorDAO().buscarPorId(2));
    
//    
        VendaDAO dao = new VendaDAO();
////        
       dao.inserir(v1);
       dao.inserir(v2);
       dao.inserir(v3);
      
       
//       dao.excluir(dao.buscarPorId(7)); //exclui no banco atraves do id
//       dao.excluir(dao.buscarPorId(8));
       
       System.exit(0);
    }
}