
package br.senac.rn.dao;

import br.senac.rn.model.Categoria;
import br.senac.rn.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


public class CategoriaDAO extends GenericDAO<Categoria> {

    @Override
    public Class<Categoria> getClassType() {
        return Categoria.class;
    }

    public List<Categoria> exemploCriteria<String nome) {
            CriteriaBuilder builder = getEm().getCriteriaBuilder();
            CriteriaQuery<Categoria> query = builder.createQuery(Categoria.class);
            Root<Categoria> root = query.from(Categoria.class);
            Path<String> path = root.<String> get("nome");
            Predicate predicate = builder.like(path, nome);
            query.where(predicate);
            
            TypedQuery<Categoria> typedQuery = getEm().createQuery(query);
            return typedQuery.getResultList();
}
            
            
}
  
}
    
//    private EntityManager manager; // gerenciador de entidades
//    private EntityManagerFactory factory; //conexão com o banco
//
//    public CategoriaDAO() {
//        factory = Persistence.createEntityManagerFactory("ConexaoDB");
//        manager = factory.createEntityManager();
//    }
//    
//    public void inserir(Categoria categoria) {  //void - não tem retorno
//        manager.getTransaction().begin();
//        manager.persist(categoria); //INSERIR
//        manager.getTransaction().commit();
//    }
//    
//    public void excluir(Categoria categoria) {
//    manager.getTransaction().begin();
//    manager.remove(categoria); //EXCLUIR
//    manager.getTransaction().commit();
//        }
//        
//    public void atualizar(Categoria categoria) {
//    manager.getTransaction().begin();
//    manager.merge(categoria); //ATUALIZAR
//    manager.getTransaction().commit();
//        }
//
//
//    public List<Categoria> buscarTodos() {
//        TypedQuery<Categoria> consulta = manager.createQuery("SELECT c FROM Categoria c", Categoria.class);
//        return consulta.getResultList();
//        
//}
//    
//    public Categoria buscarPorId(int id) {
//        return manager.find(Categoria.class, id);
//        
//    }
//
//    public void inserir(Produto p1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//}
//
//        