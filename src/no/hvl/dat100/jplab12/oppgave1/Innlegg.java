package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this(id, bruker, dato, 0);
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker;
	}

	public String getDato() {
		
		return dato;
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public int getId() {
		
		return this.id;

	}

	public int getLikes() {
		
		return this.likes;

	}
	
	public void doLike () {
		
		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		return this.id == innlegg.id;

	}
	
	@Override
	public String toString() {
		
		return String.format("%d\n%s\n%s\n%d\n", id, bruker, dato, likes);
		
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	//public String toHTML() {
		
	
				
	}

