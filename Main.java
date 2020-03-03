
import java.util.Scanner;

class Main {
	
 public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	 
	int alunos = 1;
	int total = 0;
	
	while(alunos <= 10) {
		System.out.println("Digite a nota "+ alunos +":");
		int nota = sc.nextInt();
		 total = total + nota;
		 alunos = alunos + 1;
		 
	}
	int media = total/10;
	System.out.println("Media das notas: "+ media);
	
	
	sc.close();
	}
}

