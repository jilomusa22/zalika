package ConstructorAndThisKeyWordConcept;

public class Country {
	
	String name;
	String city;
	int population;
	long size_in_sqkm;
	// The above is prototype or Blue Print
	
	public Country(String name, String city, int population, long size_in_sqkm) {
		
		this.name=name;
		this.city=city;
		this.population=population;
		this.size_in_sqkm=size_in_sqkm;
		// The above is prototype Or Blue Print
		
	}

	public static void main(String[] args) {
		Country tr=new Country("Sierra Leone"," Kailahun ",8000000,71740);
		Country tr1=new Country("Guinea"," Conakry ",13000000,245860);
		Country tr2=new Country("Liberia"," Morovia ",5000000,111370);
		
		System.out.println(tr.name + " " + tr.city + " "+ tr.population +" "+ tr.size_in_sqkm);
		System.out.println(tr1.name + " " + tr1.city+" " +tr1.population +" "+tr1.size_in_sqkm);
		System.out.println(tr2.name + " " + tr2.city+" " +tr2.population +" "+tr2.size_in_sqkm);

	}

}
