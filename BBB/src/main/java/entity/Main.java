package entity;

import com.example.bbb.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //fazer o session e persist
        //Session session = HibernateUtil.getSessionFactory().openSession();
        //session.persist("acao1");

        Cadastros.CadastroMain();

    }
}