package glavni;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.createSessionFactory().openSession();
            tx = session.beginTransaction();

            Izvodjac izvodjac1 = new Izvodjac(1, "Sting", "Band", 1985, 2005, "https://www.sting.com/");
            session.persist(izvodjac1);

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
