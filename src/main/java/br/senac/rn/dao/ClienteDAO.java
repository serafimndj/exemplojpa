
package br.senac.rn.dao;

import br.senac.rn.model.Cliente;
import br.senac.rn.util.GenericDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class ClienteDAO extends GenericDAO<Cliente> {
    
    @Override
    public Class<Cliente> getClassType() {
        return Cliente.class;
        
        
    
       
//    private final EntityManager manager; 
//    private final EntityManagerFactory factory;
//    
//    public ClienteDAO() {
//    factory = Persistence.createEntityManagerFactory("ConexaoDB");
//    manager = factory.createEntityManager();
//}
//public void inserir(Cliente cliente) {  //void - não tem retorno
//        manager.getTransaction().begin();
//        manager.persist(cliente); //INSERIR
//        manager.getTransaction().commit();
//    }
//    
//    public void excluir(Cliente cliente) {
//    manager.getTransaction().begin();
//    manager.remove(cliente); //EXCLUIR
//    manager.getTransaction().commit();
//        }
//        
//    public void atualizar(Cliente cliente) {
//    manager.getTransaction().begin();
//    manager.merge(cliente); //ATUALIZAR
//    manager.getTransaction().commit();
//        }
//
//
//    public List<Cliente> buscarTodos() {
//        TypedQuery<Cliente> consulta = manager.createQuery("SELECT c FROM Categoria c", Cliente.class);
//        return consulta.getResultList(); // getresultlist - trará varios resultados
//        
//}
//    
//    public Cliente buscarPorId(int id) {
//        return manager.find(Cliente.class, id);
//    
//    }
//
    public Cliente buscarPorCpf(String cpf) {
        String jpql = "SELECT c FROM Cliente c WHERE c.cpf = :cpfCliente";
        TypedQuery<Cliente> consulta = manager.createQuery(jpql, Cliente.class);
        consulta.setParameter("cpfCliente", cpf);
        return consulta.getSingleResult(); //getsinglesresult - trará apenas um resultado
//    }
//    
//     public List<Cliente> buscarPorQualquerParteCpf(String cpf) { //busca por qualquer parte do cpf
//        String jpql = "SELECT c FROM Cliente c WHERE c.cpf like :cpfCliente";
//        TypedQuery<Cliente> consulta = manager.createQuery(jpql, Cliente.class);
//        consulta.setParameter("cpfCliente", "%" + cpf + "%");
//        return consulta.getResultList(); //getsinglesresult - trará apenas um resultado   
    }
}

