
package br.senac.rn.principal;
import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.model.Categoria;

public class PrincipalCategoria {

    public static void main(String[] args) {

    Categoria c1 = new Categoria() ;
    Categoria c2 = new Categoria() ;
    Categoria c3 = new Categoria() ;
    Categoria c4 = new Categoria() ;
    
    c1.setNome("sandalia");
    c1.setdescricao("calcados");
            
    c2.setNome("chinelo");
    c2.setdescricao("calcados");
            
    c3.setNome("tenis");
    c3.setdescricao("calcados");
            
    c4.setNome("sapato");
    c4.setdescricao("calcados");
//    
    CategoriaDAO dao = new CategoriaDAO();
////        
       dao.inserir(c1);
       dao.inserir(c2);
       dao.inserir(c3);
       dao.inserir(c4);
       
//       dao.excluir(dao.buscarPorId(7)); //exclui no banco atraves do id
//       dao.excluir(dao.buscarPorId(8));
       
       System.exit(0);
       
            
//       
    
}
    
}
