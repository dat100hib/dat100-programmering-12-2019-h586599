package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.common.TODO;

public class Bilde extends Tekst {

	
	private String url;
	
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		this(id, bruker, dato, 0, tekst, url);
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		super(id, bruker, dato, likes, tekst);
		this.url = url;
	}
	
	public String getUrl() {
		
		return this.url;

	}

	public void setUrl(String url) {
		
		this.url = url;
	}

	@Override
	public String toString() {
		
		return String.format("BILDE\n%s%s\n%s\n", super.superString(), super.getTekst() , url);
		
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	//public String toHTML() {
		
		
				
	}

