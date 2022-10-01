
public class Tarea5 {

	public static void main(String[] args) {
		
		int A= 1;
		int B= 2;
		int C= 3;
		int D= 4;
		//Valor inicial de las variables
		System.out.println("\n A vale = " +(A) + "\n B vale = " +(B) + "\n C vale = " +(C) + "\n D vale = " +(D) );
		B = C; 
		C = A;
		A = D;
		D = B;
		//Valor Final de las variables
		System.out.println("\n A vale = " +(A) + "\n B vale = " +(B) + "\n C vale = " +(C) + "\n D vale = " +(D) );
	    

	}

}
