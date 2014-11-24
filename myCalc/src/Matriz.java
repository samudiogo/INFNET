import java.util.Scanner;

public class Matriz
{

	private static Scanner in;

	public static void main(String[] args)
	{
		int[][] turma;// turma[alunos][materias]
		String[]materias = {"Estruturas I","Fundamentos I","UML I","Organização","Web"};
		String[]alunos = {"Samuel","Fabricio"};//,"Bianchi","Telles"};
		float[] cr;
		turma = new int[alunos.length][materias.length];
		
		cr = new float[materias.length];
		
		in = new Scanner(System.in);
		float media = 0;

		for (int aluno = 0; aluno < turma.length; aluno++)
		{
			media = 0;
			for(int materia = 0; materia < turma[aluno].length; materia++)
			{
				System.out.println("digite a nota do aluno "+ alunos[aluno] + " em " +materias[materia]+ ":");
				turma[aluno][materia] = in.nextInt();
				media += turma[aluno][materia]; 
			}
			cr[aluno] = media / materias.length;
		}
		
		for(int aluno = 0; aluno < alunos.length; aluno++)
		{
			System.out.println(alunos[aluno] + ", seu CR neste ciclo foi de: "+ cr[aluno]);
		}
		
		

	}

}
