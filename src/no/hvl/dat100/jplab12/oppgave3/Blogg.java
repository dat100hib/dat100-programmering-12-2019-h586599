package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	private Innlegg[] samling;
	private int antall = 0;

	public Blogg() {
	 
		 this(20);
	}

	public Blogg(int lengde) {
		
		samling = new Innlegg[lengde];
	}

	public int getAntall() {
		
		return antall;
	}
	
	public Innlegg[] getSamling() {
		
		return samling;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for(int i = 0; i < antall; i++) 
			if (samling[i].erLik(innlegg))
				return i;
			return -1;
		}
	

	public boolean finnes(Innlegg innlegg) {
		
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		
		return antall < samling.length && antall >= 0;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if(ledigPlass()) {
			samling[antall++] = innlegg;
			return true;
			
		}
		return false;
	}
	
	public String toString() {
		
		return String.format("%d\n%s", antall, concat());
	}
	
	private String concat() {
		String current = "";
		for(int i = 0; i < antall; i++)
			current += samling[i];
		return current;
	}

	 //valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] temp = samling.clone();
		samling = new Innlegg[samling.length*2];
		
		for(int i = 0; i < temp.length; i++)
			samling[i] = temp[i];
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		if (!finnes(innlegg))
			if (ledigPlass())
			{
				if (leggTil(innlegg))
					return true;
				utvid();
				return leggTil(innlegg);
				
			}
		return false;
	}
	
	public boolean slett(Innlegg innlegg) {
		
		if (!finnes(innlegg))
			return false;
		boolean found = false;
		
		for(int i = 0; i < antall; i++) {
			if (!found) {
				if (samling[i].erLik(innlegg)) {
					found = true;
					samling[i] = null;
				}
			}
			else 
				samling[i-1] = samling[i];
		}
		antall--;
		return true;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}