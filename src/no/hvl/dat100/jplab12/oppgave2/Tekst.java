package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.common.TODO;

public class Tekst extends Innlegg {

	protected String tekst;
	
	public Tekst () {
		
	}
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato=dato;
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato=dato;
		this.tekst = tekst;
		this.likes = likes;
	}
	
	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		return "TEKST\n"+id+"\n"+bruker+"\n"+dato+"\n"+likes+"\n"+tekst+"\n";
		}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
