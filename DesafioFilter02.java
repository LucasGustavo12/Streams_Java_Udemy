package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter02 {
	
	public static void main(String[] args) {
		
		AlunoAcad a1 = new AlunoAcad("Joao", 86.2, true);
		AlunoAcad a2 = new AlunoAcad("Paulo", 77.0, false);
		AlunoAcad a3 = new AlunoAcad("Lorena", 54.0, true);
		AlunoAcad a4 = new AlunoAcad("Debora", 98.0, false);
		AlunoAcad a5 = new AlunoAcad("Luca", 75.0, true);
		AlunoAcad a6 = new AlunoAcad("Ana", 100.0, false);
		
		
		List<AlunoAcad> alunosA = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<AlunoAcad> acimaPeso = a -> a.peso >= 90;
		Function<AlunoAcad, String> mensagemPeso = a -> a.nome + "Você está a cima do peso ideal ";
		Predicate<AlunoAcad> maiorDeIdade = a -> a.idade == true;
		Function<AlunoAcad, String> mensagemIdade = a -> a.nome + "Você é maior de idade";
		
		alunosA.stream().filter(acimaPeso).map(mensagemPeso).forEach(System.out::println);
		alunosA.stream().filter(maiorDeIdade).map(mensagemIdade).forEach(System.out::println);
	}

}
