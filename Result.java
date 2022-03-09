
public class Result {
public static void main(String[] args) {
	Manager manager= new Manager();
	Engineering engineering= new Engineering();
	manager.setGrade("A");
	manager.setSal(7000);
		
	System.out.println(manager.getGrade()+"  "+manager.getSal());
	}
}
