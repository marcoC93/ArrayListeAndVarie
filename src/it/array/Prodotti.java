package it.array;

public class Prodotti {
	private String nome ;
	private String marca ;
	private double prezzo ;
	
	public Prodotti() {}
	
	public Prodotti( String nome, String marca , double prezzo) {
		
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
				
	}
	
//	Creo i metodi get e set per la variabile Nome .
	
	 public String  getNome() {
		 return nome ;
	 }
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	
//	 Creo i metodi get() e set() per la variabile marca.
	 
	 public String getMarca() {
		 return marca;
	 }
	 
	 public void setMarca(String marca) {
		 this.marca = marca ;
	 }
	 
//	 Creo i metodi get() e set() per la variabile prezzo .
  	 
	 public double getPrezzo() {
		 return prezzo;
	 }
	 public void setPrezzo(double prezzo) {
		 this.prezzo = prezzo;
	 }
	 
//	 Sovrascrivo tramite @Override convertendo in stringa il risultato dell'oggetto .
	 
	 @Override
	 public String toString() {
		 return "Prodotti " + "nome: " +  nome + " marca: " + marca + " prezzo: " + prezzo  ;
	 }
	 
}
