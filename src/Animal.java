

public class Animal {
	private String ime;
	private String vrstaZivotinje;
	private int brNogu;
	/**
	 * postavljanje inicijalnih vrijednosti
	 */
	public Animal (){
		this.setIme("nepoznato");
		this.setVrstaZivotinje("nepoznato");
		this.setBrNogu(0);
	}
	/**
	 * Setovanje ime,vrsta zivotinje,broj nogu
	 * @param ime
	 * @param vrstaZivotinje
	 * @param brNogu
	 */
	public Animal(String ime, String vrstaZivotinje, int brNogu) {
		this.setIme(ime);
		this.setVrstaZivotinje(vrstaZivotinje);
		this.setBrNogu(brNogu);
	}
	public String getIme(){
		return ime;
	}

	public void setIme(String ime){
		this.ime = ime;
	}

	public String getVrstaZivotinje(){
		return vrstaZivotinje;
	}

	public void setVrstaZivotinje(String vrstaZivotinje){
		this.vrstaZivotinje = vrstaZivotinje;
	}

	public int getBrNogu(){
		return brNogu;
	}

	public void setBrNogu(int brNogu){
		this.brNogu = brNogu;
	}
	
	/**
	 * Ubacivanje podataka u niz
	 */
	public String toString(){
		String zivotinjaString = "";
		
		zivotinjaString = "Ime: " + ime;
		zivotinjaString = "\nTip: " + vrstaZivotinje;
		zivotinjaString = "\nBroj nogu: "+brNogu;
		
		return zivotinjaString;
	}
	/**
	 * nemam pojma sta bi ovo trebalo da radi
	 * @param ime
	 * @param vrstaZivotinje
	 * @param brNogu
	 */
	public void animalUnos(String ime,String vrstaZivotinje ,int brNogu){
		this.ime=getIme();
		this.vrstaZivotinje=getVrstaZivotinje();
		this.brNogu=getBrNogu();
	}
	

	
	
	
}
