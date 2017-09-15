
package br.senac.rn.dao;

import br.senac.rn.model.Categoria;
import br.senac.rn.model.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class CategoriaDAO {
    
    private EntityManager manager; // gerenciador de entidades
    private EntityManagerFactory factory; //conexão com o banco

    public CategoriaDAO() {
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }
    
    public void inserir(Categoria categoria) {  //void - não tem retorno
        manager.getTransaction().begin();
        manager.persist(categoria); //INSERIR
        manager.getTransaction().commit();
    }
    
    public void excluir(Categoria categoria) {
    manager.getTransaction().begin();
    manager.remove(categoria); //EXCLUIR
    manager.getTransaction().commit();
        }
        
    public void atualizar(Categoria categoria) {
    manager.getTransaction().begin();
    manager.merge(categoria); //ATUALIZAR
    manager.getTransaction().commit();
        }


    public List<Categoria> buscarTodos() {
        TypedQuery<Categoria> consulta = manager.createQuery("SELECT c FROM Categoria c", Categoria.class);
        return consulta.getResultList();
        
}
    
    public Categoria buscarPorId(int id) {
        return manager.find(Categoria.class, id);
        
    }

    public void inserir(Produto p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

        