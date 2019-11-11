package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {
	
	Innlegg[] innleggTabell;
	private int nesteledig;
	
	public Blogg() {
		innleggTabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggTabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggTabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int p = -1;
		int i = 0;
		while( i< nesteledig && p==-1) {
			if(innleggTabell[i].erLik(innlegg)) {
				p=i;
			}
			i++;
		}
		return p;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = true;
		if(finnInnlegg(innlegg)==-1) {
			finnes = false;
		}
		return finnes;
	}

	public boolean ledigPlass() {
		boolean ledig = false;
		if(innleggTabell.length>nesteledig) {
			ledig=true;
		}
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil=!finnes(innlegg) && ledigPlass();
		if(lagtTil) {
			innleggTabell[nesteledig] = innlegg; 
			lagtTil=true;
			nesteledig++;
		}
		return lagtTil;
	}
	
	public String toString() {
		String s= getAntall() + "\n";
		for(int i=0; i<innleggTabell.length; i++) {
			s+= innleggTabell[i].toString();
			
			
		}
		return s;
	}

	
	public void utvid() {
		Innlegg[] copiTabell  = innleggTabell;
		innleggTabell = new Innlegg[copiTabell.length*2];
		
		int i = 0;
		for(Innlegg innlegg : copiTabell) {
			innleggTabell[i] = innlegg; 
			i++;
		}
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		boolean done=false;
		for(Innlegg x : innleggTabell) {
			if(!innlegg.erLik(x)) {
				done=true;
				if(nesteledig<innleggTabell.length) {
					innleggTabell[nesteledig]=innlegg;
				}else {
					utvid();
					innleggTabell[nesteledig]=innlegg;
				}
			}
		}
		return done;
	}
	
	public boolean slett(Innlegg innlegg) {
		Innlegg[] copiTabell  = innleggTabell;
		innleggTabell = new Innlegg[copiTabell.length*2];
		
		boolean done=false;
		for(Innlegg x : copiTabell) {
			if(x.erLik(innlegg)) {;
				done=true;
				x=null;
				nesteledig--;
			}
		}
		int i = 0;
		for(Innlegg x : copiTabell) {
			if(x!=null) {
				innleggTabell[i] = x; 
				i++;
			}
		}
		return done;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}