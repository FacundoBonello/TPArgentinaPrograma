package tp;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
	Equipo argentina =new Equipo("Argentina", "La campeona del mundo");
	Equipo arabiaSaudita =new Equipo("Arabia Saudita", "Arabes");
	Equipo mexico =new Equipo("Mexico", "los Aztecas");
	Equipo polonia =new Equipo("Polonia", "Auschwitz");
	Partido partido = new Partido(argentina, arabiaSaudita);
	Partido partido2 = new Partido(polonia, mexico);
	
	partido.leerPartido();
	
	System.out.println("los goles del equipo de " + partido.getEquipo1().getNombre() + " son: " + partido.getGolesEquipo1());
	System.out.println("los goles del equipo de " + partido.getEquipo2().getNombre() + " son: " + partido.getGolesEquipo2());
	System.out.println(partido.getEquipo1().getNombre() + " Resultó: " + partido.resultado(argentina) + " y " + partido.getEquipo2().getNombre() + " : " + partido.resultado(arabiaSaudita));
	
	partido2.leerPartido();
	
	System.out.println("los goles del equipo de " + partido2.getEquipo1().getNombre() + " son: " + partido2.getGolesEquipo1());
	System.out.println("los goles del equipo de " + partido2.getEquipo2().getNombre() + " son: " + partido2.getGolesEquipo2());
	System.out.println(partido2.getEquipo1().getNombre() + " Resultó: " + partido2.resultado(polonia) + " y " + partido2.getEquipo2().getNombre() + " : " + partido2.resultado(mexico));



}

}