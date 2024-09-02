package aula01;
public class StringExample {
	public static void main(String[] args) {
		String s1 = "programar em Java";
		System.out.println(s1.split(" ")[0] + " é engraçado!! :)");
		System.out.println("É giro " + s1);
		for (int i=0; i<14; i++)
			System.out.println("vamos " + s1 + " na aula " + i);
	}
}



public static void notafinal(){
	//função da primeira parte do exercício
	double notaP,notaT,notaF;
	notaF = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nota Pratica: ");
	notaP=sc.nextFloat();
	System.out.println("Nota Teorica: ");
	notaT=sc.nextFloat();
	sc.close();
	if ((notaT < 20.1 && notaT > -0.1 ) && (notaP > -0.1 && notaP < 20.1)){
		if (notaT < 7.0 || notaP < 7.0){
			System.out.printf("Codigo 66, reprovado por nota minima");
		}else{
			notaF=(0.4 * notaT) + (0.6 * notaP);
			System.out.println("Nota final é de "+ notaF);
		}
	}else{
		System.out.println("Valores introduzidos invalidos"); 
	}

}