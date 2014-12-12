import javax.naming.NoInitialContextException;


public class TestAnimal {

	

	public static void main(String[] args) {
		Animal no1=new Animal();
		System.out.println(no1.toString());
		Animal no11=new Animal("Tom", "macka", 4);
		System.out.println(no11.toString());

		
		Skloniste udomljavanje=new Skloniste();
		skloniste.addAnimal("Pujdo","dog");
		skloniste.addAnimal("Maca","cat");
		skloniste.addAnimal("Bufi","dog");
		skloniste.addAnimal("Cicko","bird");
		skloniste.addAnimal("Miki","bird");
		
	}

}
