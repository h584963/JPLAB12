package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {
	
	protected int id;
	protected String bruker;
	protected  String dato;
	protected int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=likes;
	}
	
	public String getBruker() {
		return this.bruker;
	}

	public void setBruker(String bruker) {
		this.bruker=bruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato=dato;
	}

	public int getId() {
		return id;
	}

	public int getLikes() {
		return likes;
	}
	
	public void doLike () {
		likes+=1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		boolean lik=false;
		if(innlegg.id == this.id) {
			lik=true;
		}
		return lik;
	}
	
	@Override
	public String toString() {
		return id+"\n"+bruker+"\n"+dato+"\n"+likes+"\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
