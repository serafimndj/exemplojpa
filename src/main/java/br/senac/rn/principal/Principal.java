package br.senac.rn.principal;

import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Sexo;

public class Principal {

    public static void main(String[] args) {

//       Sexo s1 = new Sexo();
//       Sexo s2 = new Sexo();
//       Sexo s3 = new Sexo();
//       
//       s1.setNome("Masculino");
//       s1.setSigla('M');
//       
//       s2.setNome("Feminino");
//       s2.setSigla('F');
//               
//       s3.setNome("Outro");
//       s3.setSigla('O');
//       
//        SexoDAO dao = new SexoDAO();
        
//       dao.inserir(s1);
//       dao.inserir(s2);
//       dao.inserir(s3);

//       System.out.println(dao.buscarTodos().toString());

//        dao.buscarTodos().stream().forEach((s) -> { //mostra todos os dados do banco
//            System.out.println(s);
            
//        dao.excluir(dao.buscarPorId(6)); //exclui no banco atraves do id
 //       dao.excluir(dao.buscarPorId(5)); //exclui no banco atraves do id 
 
 //       Sexo s4 = new Sexo(2, "Indefinido", 'I'); //atualizar informações no banco
//        dao.atualizar(s4);//atualizar informações no banco
          
          
        new SexoDAO().insert(new Sexo(0, "Masculino", 'M'));  
        System.exit(0);
        
        
     

        // Sexo s1 = new Sexo(3, "Indefinido", 'I');
        //SexoDAO dao = new SexoDAO();
        //dao.inserir(s1);
//        Sexo s1 = new Sexo();
//        
//        s1.setId(2);
//        s1.setNome("Outros");
//        s1.setSigla('0');
//                
//        System.out.println(s1.toString());
//        
//        Sexo s2 = new Sexo(2, "Outro", '0');
//    
//        System.out.println(s2.toString()); 
//        
//        if (s1.equals(s2)) {
//            System.out.println("IGUAIS");
//        } else {
//            System.out.println("DIFERENTES");
    }
}
