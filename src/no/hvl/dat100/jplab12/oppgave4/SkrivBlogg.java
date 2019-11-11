package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.io.IOException; 

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.oppgave2.*;
import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {
		Innlegg[] innlegg = samling.getSamling();
		try {
			FileWriter fileWriter = new FileWriter(filnavn);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(samling.getAntall());
			String type = "";
			if(innlegg[0] instanceof Bilde) {
				Bilde bilde = (Bilde) innlegg[0];
				type = "BILDE";
				printWriter.println(type);
				printWriter.println(innlegg[0].getId());
				printWriter.println(innlegg[0].getBruker());
				printWriter.println(innlegg[0].getDato());
				printWriter.println(innlegg[0].getLikes());
				printWriter.println(bilde.getTekst());
				printWriter.println(innlegg[0].getLikes());
				printWriter.println(bilde.getUrl());
			} else {
				type = "TEKST";
				Tekst tekst = (Tekst) innlegg[0];
				printWriter.println(type);
				printWriter.println(innlegg[0].getId());
				printWriter.println(innlegg[0].getBruker());
				printWriter.println(innlegg[0].getDato());
				printWriter.println(innlegg[0].getLikes());
				printWriter.println(tekst.getTekst());
			}
			
			printWriter.close();

		} catch (IOException e) {
			return false;
		}
		return true;
	}
}