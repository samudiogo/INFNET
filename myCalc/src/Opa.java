class Aluno
{
	String nome;
	int nota;
	public void imprimeNota()
	{
		System.out.println("Nome: "+ this.nome + " || Nota: " + this.nota);
	}
}
class Turma
{
	Aluno[] alunos;
	
	public void imprimeNotas()
	{
		for (int i = 0; i < alunos.length; i++)
		{
			Aluno aluno = this.alunos[i];
			if (alunos[i] == null) continue;
			
			System.out.println("Nome: "+ aluno.nome + " || Nota: " + aluno.nota);
			
		}
	}
	
}
public class Opa
{

	public static void main(String[] args)
	{
		Aluno obj = new Aluno();
		obj.nome = "Samuel";
		obj.nota = 10;
		
		obj.imprimeNota();
		System.out.println(" ******** ");
		Turma gads = new Turma();
		gads.alunos = new Aluno[10]; 
		gads.alunos[0] = new Aluno();
		gads.alunos[0].nome = "Samuel Diogo";
		gads.alunos[0].nota = 10;
		
		gads.imprimeNotas();
	}

}
