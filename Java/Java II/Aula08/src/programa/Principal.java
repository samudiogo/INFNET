package programa;
import java.util.ArrayList;
import java.util.Comparator;

import entities.*;

public class Principal {

	public static void main(String[] args) 
	{
		//criando um novo contato;
		Contato c1  = new Contato("Samuel Diogo", 21,"2332-6456",TipoContato.Comercial);
		Contato c2  = new Contato("marina Meu Amor", 21,"S2 S2 S2",TipoContato.Residenticial);
		Contato c3  = new Contato("Carlos Renato", 21,"2332-6456",TipoContato.Comercial);
		Contato c4  = new Contato("Carlos Renato", 21,"2332-6456",TipoContato.Comercial);
		Contato c5  = new Contato("Frank Aguiar", 21,"2332-6456",TipoContato.Comercial);
		Contato c6  = new Contato("Alice Delicinha", 21,"S2 S2 S2",TipoContato.Residenticial);
		Contato c7  = new Contato("Pedro Alvares Cabral", 21,"2332-6456",TipoContato.Comercial);
		Contato c8  = new Contato("Wesley Safadão", 21,"S2 S2 S2",TipoContato.Residenticial);
		Contato c9  = new Contato("Pedro Alvares Cabral", 21,"2332-6456",TipoContato.Comercial);
		Contato c10 = new Contato("Rafael Pinho", 21,"S2 S2 S2",TipoContato.Residenticial);
			
		AgendaTelefonica AgendaEspecial = new AgendaTelefonica("Agenda de Gads!");
						
		AgendaEspecial.AddContatos(c1);
		AgendaEspecial.AddContatos(c2);
		AgendaEspecial.AddContatos(c3);
		AgendaEspecial.AddContatos(c4);
		AgendaEspecial.AddContatos(c5);
		AgendaEspecial.AddContatos(c6);
		AgendaEspecial.AddContatos(c7);
		AgendaEspecial.AddContatos(c8);
		AgendaEspecial.AddContatos(c9);
		AgendaEspecial.AddContatos(c10);
		
				
		ArrayList<Contato> Lis = AgendaEspecial.getContatos();
		
		AgendaEspecial.GetContatosRepitidos();
	}

}
