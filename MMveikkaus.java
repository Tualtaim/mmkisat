import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class MMveikkaus {

	private static Scanner lukija;
	
	public static void main(String[] args) throws IOException {

		//Luodut joukkueet tallettava lista
		ArrayList<Joukkue> joukkueet = new ArrayList<Joukkue>();

		Joukkue russia = new Joukkue(1, 1, "Venäjä"); joukkueet.add(russia);
		Joukkue sarabia = new Joukkue(2, 1, "Saudi-Arabia"); joukkueet.add(sarabia);
		Joukkue egypt = new Joukkue(3, 1, "Egypti"); joukkueet.add(egypt);
		Joukkue uruguay = new Joukkue(4, 1,"Uruguay"); joukkueet.add(uruguay);
		Joukkue portugal = new Joukkue(1, 2, "Portugali"); joukkueet.add(portugal);
		Joukkue spain = new Joukkue(2, 2, "Espanja"); joukkueet.add(spain);
		Joukkue morocco = new Joukkue(3, 2, "Marokko"); joukkueet.add(morocco);
		Joukkue iran = new Joukkue(4, 2, "Iran"); joukkueet.add(iran);
		Joukkue france = new Joukkue(1, 3, "Ranska"); joukkueet.add(france);
		Joukkue australia = new Joukkue(2, 3, "Australia"); joukkueet.add(australia);
		Joukkue peru = new Joukkue(3, 3, "Peru"); joukkueet.add(peru);
		Joukkue denmark = new Joukkue(4, 3, "Tanska"); joukkueet.add(denmark);
		Joukkue argentina = new Joukkue(1, 4, "Argentiina"); joukkueet.add(argentina);
		Joukkue iceland = new Joukkue(2, 4, "Islanti"); joukkueet.add(iceland);
		Joukkue croatia = new Joukkue(3, 4, "Kroatia"); joukkueet.add(croatia);
		Joukkue nigeria = new Joukkue(4, 4, "Nigeria"); joukkueet.add(nigeria);
		Joukkue brazil = new Joukkue(1,5,"Brasilia"); joukkueet.add(brazil);
		Joukkue switzerland = new Joukkue (2,5,"Sveitsi"); joukkueet.add(switzerland);
		Joukkue costarica = new Joukkue (3,5,"Costa Rica"); joukkueet.add(costarica);
		Joukkue serbia = new Joukkue (4,5,"Serbia"); joukkueet.add(serbia);
		Joukkue germany = new Joukkue (1,6,"Saksa"); joukkueet.add(germany);
		Joukkue mexico = new Joukkue (2,6,"Meksiko"); joukkueet.add(mexico);
		Joukkue sweden = new Joukkue (3,6,"Ruotsi"); joukkueet.add(sweden);
		Joukkue southkorea = new Joukkue (4,6,"Etelä-Korea"); joukkueet.add(southkorea);
		Joukkue belgium = new Joukkue (1,7,"Belgia"); joukkueet.add(belgium);
		Joukkue panama = new Joukkue (2,7,"Panama"); joukkueet.add(panama);
		Joukkue tunisia = new Joukkue (3,7,"Tunisia"); joukkueet.add(tunisia);
		Joukkue england = new Joukkue (4,7,"Englanti"); joukkueet.add(england);
		Joukkue poland = new Joukkue (1,8,"Puola"); joukkueet.add(poland);
		Joukkue senegal = new Joukkue (2,8,"Senegal"); joukkueet.add(senegal);
		Joukkue colombia = new Joukkue (3,8,"Kolumbia"); joukkueet.add(colombia);
		Joukkue japan = new Joukkue (4,8,"Japani"); joukkueet.add(japan);
		
		ArrayList<Joukkue> LohkoA = luoLohko(russia, sarabia, egypt, uruguay);
		ArrayList<Joukkue> LohkoB = luoLohko(portugal, spain, morocco, iran);
		ArrayList<Joukkue> LohkoC = luoLohko(france, australia, peru, denmark);
		ArrayList<Joukkue> LohkoD = luoLohko(argentina, iceland, croatia, nigeria);	
		ArrayList<Joukkue> LohkoE = luoLohko(brazil, switzerland, costarica, serbia);
		ArrayList<Joukkue> LohkoF = luoLohko(germany, mexico, sweden, southkorea);
		ArrayList<Joukkue> LohkoG = luoLohko(belgium,panama,tunisia,england);
		ArrayList<Joukkue> LohkoH = luoLohko(poland, senegal, colombia, japan);
		
		System.out.println("1. kierros");
		System.out.println("Syötä ottelun lopputulos muodossa x-x");
		ottelukierros1(LohkoA);
		tulostaLohko(LohkoA, 'A');
		ottelukierros1(LohkoB);
		tulostaLohko(LohkoB, 'B');
		ottelukierros1(LohkoC);
		tulostaLohko(LohkoC, 'C');
		ottelukierros1(LohkoD);
		tulostaLohko(LohkoD, 'D');
		ottelukierros1(LohkoE);
		tulostaLohko(LohkoE, 'E');
		ottelukierros1(LohkoF);
		tulostaLohko(LohkoF, 'F');
		ottelukierros1(LohkoG);
		tulostaLohko(LohkoG, 'G');
		ottelukierros1(LohkoH);
		tulostaLohko(LohkoH, 'H');
		System.out.println(" ");
	
		System.out.println("2. kierros");	
		ottelukierros2(LohkoA);
		ottelukierros2(LohkoB);
		ottelukierros2(LohkoC);
		ottelukierros2(LohkoD);
		ottelukierros2(LohkoE);
		ottelukierros2(LohkoF);
		ottelukierros2(LohkoG);
		ottelukierros2(LohkoH);
		System.out.println("Lohkojen tilanteet 2. ottelukierroksen jälkeen:");
		tulostaLohko(LohkoA, 'A');
		tulostaLohko(LohkoB, 'B');
		tulostaLohko(LohkoC, 'C');
		tulostaLohko(LohkoD, 'D');	
		tulostaLohko(LohkoE, 'E');
		tulostaLohko(LohkoF, 'F');
		tulostaLohko(LohkoG, 'G');
		tulostaLohko(LohkoH, 'H');
		System.out.println(" ");	
		
		ottelukierros3(LohkoA);
		ottelukierros3(LohkoB);
		ottelukierros3(LohkoC);
		ottelukierros3(LohkoD);
		ottelukierros3(LohkoE);
		ottelukierros3(LohkoF);
		ottelukierros3(LohkoG);
		ottelukierros3(LohkoH);
		System.out.println("Lohkojen lopputulokset:");
		tulostaLohko(LohkoA, 'A');
		tulostaLohko(LohkoB, 'B');
		tulostaLohko(LohkoC, 'C');
		tulostaLohko(LohkoD, 'D');	
		tulostaLohko(LohkoE, 'E');
		tulostaLohko(LohkoF, 'F');
		tulostaLohko(LohkoG, 'G');
		tulostaLohko(LohkoH, 'H');
		System.out.println(" ");

		Joukkue voittaja1 = neljannesvalierat(LohkoA, LohkoB);
		Joukkue voittaja2 = neljannesvalierat(LohkoC, LohkoD);
		Joukkue voittaja3 = neljannesvalierat(LohkoE, LohkoF);
		Joukkue voittaja4 = neljannesvalierat(LohkoG, LohkoH);
		Joukkue voittaja5 = neljannesvalierat(LohkoB, LohkoA);
		Joukkue voittaja6 = neljannesvalierat(LohkoD, LohkoC);
		Joukkue voittaja7 = neljannesvalierat(LohkoF, LohkoE);
		Joukkue voittaja8 = neljannesvalierat(LohkoH, LohkoG);
		
		//Puolivälierät
		System.out.println(" ");
		System.out.println("*Puolivälierät*");
		Joukkue semifinalisti1 = pudotuspelit(voittaja1, voittaja2);
		Joukkue semifinalisti2 = pudotuspelit(voittaja3, voittaja4);
		Joukkue semifinalisti3 = pudotuspelit(voittaja5, voittaja6);
		Joukkue semifinalisti4 = pudotuspelit(voittaja7, voittaja8);
		
		//Välierät
		System.out.println(" ");
		System.out.println("*Välierät*");
		Joukkue finalisti1= pudotuspelit(semifinalisti1, semifinalisti2);
		Joukkue finalisti2= pudotuspelit(semifinalisti3, semifinalisti4);
		
		//Finaali 
		System.out.println(" ");

		System.out.println("FINAALI");
		Joukkue maailmanmestari = pudotuspelit(finalisti1,finalisti2);
		System.out.println("Maailmanmestari on: " + maailmanmestari.getNimi());
	}

	public static void tulostaLohko(ArrayList<Joukkue> lohko, char a) {	
		System.out.println();	
		System.out.println("Lohko " + a);
		jarjestaLohko(lohko);
		System.out.printf("%-20s%-10s%-10s%-10s%-10s", "Joukkue",  "Ottelut", "Pisteet", "TM", "PM");
		System.out.println("");		
		for (Joukkue joukkue: lohko) {
			System.out.printf("%-20s%-10d%-10d%-10d%-10d", joukkue.nimi,  joukkue.pelatut, joukkue.pisteet, joukkue.maalit, joukkue.paastetyt);
			System.out.println("");
		}
		System.out.println();

	}
	
	public static ArrayList<Joukkue> luoLohko(Joukkue a, Joukkue b, Joukkue c, Joukkue d) {
		ArrayList<Joukkue> joukkueet = new ArrayList<Joukkue>();
		joukkueet.add(a);
		joukkueet.add(b);
		joukkueet.add(c);
		joukkueet.add(d);
		return joukkueet;
	}
		
	/** 1. ottelukierroksella kohtaavat arvontakori 1. ja 2. sekä 3. ja 4. **/
	public static void ottelukierros1(ArrayList<Joukkue> lohko) {
		for(int i=0; i<lohko.size(); i = i+2)	{
			System.out.print(lohko.get(i).getNimi() +"-"+ lohko.get(i+1).getNimi() +" ");
			kysyLopputulos(lohko.get(i), lohko.get(i+1));
			lohko.get(i).pelatut();
			lohko.get(i+1).pelatut();
		}
	}
	
	//2. kierroksella 1. korin joukkue vs. 3. korin joukkue ja 4. korin joukkue vs. 2. korin joukkue
	public static void ottelukierros2 (ArrayList<Joukkue> lohko){
		for (Joukkue a: lohko) {	
			for(Joukkue b :lohko) {
				if (a.kori==1 && b.kori == 3) {
				System.out.print(a.nimi +"-"+ b.nimi + " ");
				kysyLopputulos(a, b);
				a.pelatut();
				b.pelatut();}
				if (a.kori==4 && b.kori == 2) {
				System.out.print(a.nimi +"-"+ b.nimi + " ");
				kysyLopputulos(a, b);
				a.pelatut();
				b.pelatut();
				}
			}
		}
	}
	
	//3. kierroksella 4. korin joukkue vs. 1. korin joukkue ja 2. korin joukkue vs. 3. korin joukkue
	public static void ottelukierros3 (ArrayList<Joukkue> lohko){
		for (Joukkue a: lohko) {	
			for(Joukkue b :lohko) {
				if (a.kori==4 && b.kori == 1) {
				System.out.print(a.nimi +"-"+ b.nimi + " ");
				kysyLopputulos(a, b);
				a.pelatut();
				b.pelatut();}
				if (a.kori==2 && b.kori == 3) {
				System.out.print(a.nimi +"-"+ b.nimi + " ");
				kysyLopputulos(a, b);
				a.pelatut();
				b.pelatut();
				}
			}
		}	
	}
	
	//Kysyy ottelun lopputuloksen, joukkueille annetaan pisteet ja maalit
	public static void kysyLopputulos(Joukkue a, Joukkue b){
		lukija = new Scanner(System.in);
		boolean ok;
		do {
			String lopputulos = lukija.nextLine();
			String[] tulos = lopputulos.split("-"); //ottelun maalit
			if(lopputulos.contains("-")) {
				if(Integer.parseInt(tulos[0]) > Integer.parseInt(tulos[1])) {
					a.voitto();
					a.maalit(Integer.parseInt(tulos[0]));
					a.paastetyt(Integer.parseInt(tulos[1]));
					b.maalit(Integer.parseInt(tulos[1]));
					b.paastetyt(Integer.parseInt(tulos[0]));
				}
				if(Integer.parseInt(tulos[0]) < Integer.parseInt(tulos[1])) {
					b.voitto();
					a.maalit(Integer.parseInt(tulos[0]));
					a.paastetyt(Integer.parseInt(tulos[1]));
					b.maalit(Integer.parseInt(tulos[1]));
					b.paastetyt(Integer.parseInt(tulos[0]));
				}
				else if(Integer.parseInt(tulos[0]) == Integer.parseInt(tulos[1])) {
					a.tasuri();
					b.tasuri();
					a.maalit(Integer.parseInt(tulos[0]));
					a.paastetyt(Integer.parseInt(tulos[1]));
					b.maalit(Integer.parseInt(tulos[1]));
					b.paastetyt(Integer.parseInt(tulos[0]));			}	
			ok = true;
			}else {
				System.out.println("Syötä tulos muodossa x-x");
				ok = false;
			}
		}while(!ok);			
	}
			
	//Järjestää lohkon pisteiden jaa maalieron mukaan
	public static void jarjestaLohko(ArrayList<Joukkue> lohko) {
		
		//Tasapisteissä ja maalieron ollessa sama enemmän maaleja tehnyt joukkue pääsee jatkoon
		Collections.sort(lohko, new Comparator<Joukkue>() {
			@Override
			public int compare(Joukkue o1, Joukkue o2) {
				return o2.getMaalit() - o1.getMaalit();
			}
		});		
		//Tasapisteissä maaliero ratkaisee
		Collections.sort(lohko, new Comparator<Joukkue>() {
			@Override
			public int compare(Joukkue o1, Joukkue o2) {
				return o2.getMaaliero() - o1.getMaaliero();
			}
		});
		// Järjestetään pisteiden mukaan
		Collections.sort(lohko, new Comparator<Joukkue>() {
			@Override
			public int compare(Joukkue o1, Joukkue o2) {
				return o2.getPisteet() - o1.getPisteet();					}
				});
	}
	
	//Kumpi pääsee neljännesvälierissä jatkoon
	public static Joukkue neljannesvalierat(ArrayList<Joukkue> lohko1, ArrayList<Joukkue> lohko2) {
		System.out.println(lohko1.get(0).getNimi() + "-" +lohko2.get(1).getNimi());
		System.out.println("Kumpi pääsee jatkoon?");
		lukija = new Scanner(System.in);
		boolean ok;
		do {
			String voittaja = lukija.nextLine().toLowerCase();
			//voittaja = voittaja.toLowerCase();
			if(voittaja.contains(lohko1.get(0).getNimi().toLowerCase()) || voittaja.contains(lohko2.get(1).getNimi().toLowerCase())) {
				if(lohko1.get(0).getNimi().toLowerCase().equals(voittaja)) {
					return lohko1.get(0);
				}else { 
					return lohko2.get(1);
					}
			}else{
				System.out.println("Syötä nimi uudelleen");
				ok = false;
			}			
		}while(!ok);
		return null;
	}

	//Pudotuspeliparin voittaja
	private static Joukkue pudotuspelit(Joukkue voittaja1, Joukkue voittaja2) {
		System.out.println(voittaja1.getNimi() + "-" + voittaja2.getNimi());
		System.out.println("Kumpi voittaa?");
		lukija = new Scanner(System.in);	
		boolean ok;
		do {
		String voittaja = lukija.nextLine().toLowerCase();
		//voittaja = voittaja.toLowerCase();
		if(voittaja.contains(voittaja1.getNimi().toLowerCase()) || voittaja.contains(voittaja2.getNimi().toLowerCase())) {
			if(voittaja.equals(voittaja1.getNimi().toLowerCase())) {
				return voittaja1;
			}if(voittaja.equals(voittaja2.getNimi().toLowerCase())){
				return voittaja2;
			}
			ok = true;
		}else{
				System.out.println("Syötä nimi uudelleen");
				ok = false;
			}			
		}while(!ok);
			return null;		
	}	
}

