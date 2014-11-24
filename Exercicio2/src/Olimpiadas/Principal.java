package Olimpiadas;

import java.io.ObjectInputStream.GetField;

import delegacao.Atleta;
import esportes.Modalidade;
public class Principal
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Atleta[] atletas = new Atleta[5];
		
		atletas[0] = Atleta.cadastrarAtleta("Cesar Cielo", 23, 'm', Modalidade.cadastrarModalidade("Swinng", 9000.50), 3);
		atletas[1] = Atleta.cadastrarAtleta("Tony Brady", 23, 'm', Modalidade.cadastrarModalidade("Football", 10000.00), 9);
		atletas[2] = Atleta.cadastrarAtleta("Guga", 23, 'm', Modalidade.cadastrarModalidade("tenis", 28000.00), 5);
		atletas[3] = Atleta.cadastrarAtleta("Brown", 23, 'm', Modalidade.cadastrarModalidade("basktetBall", 12000.00), 6);
		atletas[4] = Atleta.cadastrarAtleta("Samuel", 23, 'm', Modalidade.cadastrarModalidade("MountainBike", 23000.00), 8);
		
		Atleta famoso = new Atleta();
		Atleta rico = new Atleta();
		Atleta ricoEFamoso = new Atleta();
		famoso = atletas[0]; rico = atletas[0]; ricoEFamoso = atletas[0]; 
		for(Atleta index: atletas)
		{	
			//famoso = index; rico = index;ricoEFamoso = index;
			double salario = index.getModalidade().getSalarioMedio();
			int fama = index.getFama();
			if(index.getFama() > famoso.getFama())
				famoso = index;
			if(index.getModalidade().getSalarioMedio() > rico.getModalidade().getSalarioMedio())
				rico = index;
			if(fama >= famoso.getFama() && (salario >= rico.getModalidade().getSalarioMedio()))
				ricoEFamoso = index;
			System.out.println(index.getNome() + " || " + index.getModalidade().getNome() + " || R$ " + index.getModalidade().getSalarioMedio() );
		}
		
		System.out.println("");
		
		System.out.println("O atleta mais fomoso é : " + famoso.getNome());
		System.out.println("O atleta mais rico é : "   + rico.getNome());
		System.out.println("O fodão é : " 			   + ricoEFamoso.getNome());
		

	}

}
