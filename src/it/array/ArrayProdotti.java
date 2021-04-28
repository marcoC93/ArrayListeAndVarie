package it.array;

//
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayProdotti extends Prodotti {
	
//	creo un oggetto lista il quale rappresenta 
	public List<Prodotti> getListaProdotti(){
	
		Scanner s = new Scanner(System.in);
		
//		Queste variabili le dichiaro per poter rendere dinamico l'inserimento di elementi all'interno dell array 
		String nome ;
		String marca ;
		double prezzo ;
		
		
		List <Prodotti> listaProdotti = new ArrayList<> ();
		
//		Questi sono metodi di input che permetteranno di popolare la lista dinamicamente  .
		System.out.println("Che prodotto é ? ");
		nome = s.nextLine() ;
		System.out.println(" Marca ? ");
		marca = s.nextLine();
		System.out.println("Prezzo ? ");
		prezzo = s.nextDouble();
		
/*		tramite questo metodo .add aggiungo un  (Oggetto??) Prodotti con i parametri richiesti dall oggetto Prodotti realizzato all'interno della classe omonima
 		inserendo come parametri gli elementi ricevuti in input all'interno di questo oggetto 									*/		
		
	 	listaProdotti.add(new Prodotti(nome , marca , prezzo)) ;
		return listaProdotti;
	}
	
	
}
