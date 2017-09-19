package br.senac.rn.dao;

import br.senac.rn.model.Venda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class VendaDAO {
    
       
    private final EntityManager manager; 
    private final EntityManagerFactory factory;
    
    public VendaDAO() {
    factory = Persistence.createEntityManagerFactory("ConexaoDB");
    manager = factory.createEntityManager();
    
    }
    public void inserir(Venda venda) {  //void - não tem retorno
    manager.getTransaction().begin();
    manager.persist(venda); //INSERIR
    manager.getTransaction().commit();
    manager.close(); //finalizar o comando
    }
    
    public void excluir(Venda venda) { //Venda(classe) venda(objeto)
    manager.getTransaction().begin();
    manager.remove(venda); //EXCLUIR
    manager.getTransaction().commit();
    manager.close(); //finalizar o comando
        }
        
    public void atualizar(Venda venda) {
    manager.getTransaction().begin();
    manager.merge(venda); //ATUALIZAR
    manager.getTransaction().commit();
    manager.close(); //finalizar o comando
        }


    public List<Venda> buscarTodos() {
        TypedQuery<Venda> consulta = manager.createQuery("SELECT v FROM Categoria v", Venda.class);
        return consulta.getResultList();
        
}
    
    public Venda buscarPorId(int id) {
        return manager.find(Venda.class, id);
        
    
}
}

