import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class FilmAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=null;
        SessionFactory factory;
        try {
        	factory=new Configuration().configure().buildSessionFactory();
        	session=factory.openSession();
        	Transaction tr=session.beginTransaction();
        	Film f=new Film();
        	f.setId(1);
        	f.setName("sa re ga ma");
        	ArrayList list=new ArrayList();
        	list.add(new Song(10,"Aa rere"));
        	list.add(new Song(11,"mind block"));
        	list.add(new Song(12,"house full"));
        	f.setSongs(list);
        	session.save(f);
        	tr.commit();
        	System.out.println("record saved");
	}
        catch(Exception e) {
        	e.printStackTrace();
        }
        finally{
        	session.flush();
        	session.close();        }

}
}
