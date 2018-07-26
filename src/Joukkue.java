/*Luokka joka luo joukkueen */

public class Joukkue {
	
	public String nimi;
	public int pisteet;
	public int maalit;
	public int paastetyt;
	public int pelatut = 0; //pelattujen otteluiden lkm
	int lohko;
	int kori;

	//constructor
	public Joukkue(int kori, int lohko, String nimi){
		this.nimi = nimi;
		this.lohko = lohko;
		this.kori = kori;
	}
	
	public int getLohko() {
		return lohko;
	}
	
	public int getPisteet() {
		return pisteet;
	}
	
	public int getMaalit() {
		return maalit;
	}
	
	public int getMaaliero() {
		return maalit-paastetyt;
	}
	
	public String getNimi() {
		return nimi;
	}
	
	public void voitto() {
		pisteet = pisteet +3;
	}
	public void tasuri() {
		pisteet = pisteet +1;
	}
	
	public void maalit(int a) {
		maalit = maalit + a;
	}
	
	public void paastetyt(int a) {
		paastetyt = paastetyt + a;
	}
	
	public void pelatut() {
		pelatut++;
	}
	
}
