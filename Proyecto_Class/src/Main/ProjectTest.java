package Main;
import Class.Project;
public class ProjectTest {
	public static void main(String[] args) {
		Project proyecto1 = new Project();
		Project proyecto2 = new Project("Virus T");
		Project proyecto3 = new Project("Manhattan","Bomba Nuclear");
		
		System.out.println(proyecto1.elevatorPitch());
		System.out.println(proyecto2.elevatorPitch());
		System.out.println(proyecto3.elevatorPitch());
	}

}
