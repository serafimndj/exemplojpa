
package br.senac.rn.dao;

import br.senac.rn.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class ClienteDAO {
    
       
    private final EntityManager manager; 
    private final EntityManagerFactory factory;
    
    public ClienteDAO() {
    factory = Persistence.createEntityManagerFactory("ConexaoDB");
    manager = factory.createEntityManager();
}
public void inserir(Cliente cliente) {  //void - não tem retorno
        manager.getTransaction().begin();
        manager.persist(cliente); //INSERIR
        manager.getTransaction().commit();
    }
    
    public void excluir(Cliente cliente) {
    manager.getTransaction().begin();
    manager.remove(cliente); //EXCLUIR
    manager.getTransaction().commit();
        }
        
    public void atualizar(Cliente cliente) {
    manager.getTransaction().begin();
    manager.merge(cliente); //ATUALIZAR
    manager.getTransaction().commit();
        }


    public List<Cliente> buscarTodos() {
        TypedQuery<Cliente> consulta = manager.createQuery("SELECT c FROM Categoria c", Cliente.class);
        return consulta.getResultList();
        
}
    
    public Cliente buscarPorId(int id) {
        return manager.find(Cliente.class, id);
    
    }

    
}
