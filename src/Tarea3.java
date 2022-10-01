import java.lang.Math;
public class Tarea3 {
	public static void main(String[] args) {
		int X=2;
		int Y=8;
		double N =8.2;
		double M =2.8;
		//Mostramos los valores iniciales de las variable declaradas en pantalla
		System.out.println("\n el valor de X es = "+ X +"\n el valor de Y es = " + Y + "\n el valor de N es = " + N + "\n el valor de M es = " + M);
		//Operaciónes entre las Variables X y Y
		System.out.println(" La Suma X + Y es = "+ (X+Y)+ "\n La Diferencia X - Y es = " +(X-Y)+ "\n El producto X*Y es = " + (X*Y)+ "\n El cocientre X/Y es = "+(X/Y)+ "\n El resto X%Y = "+ (X%Y));
		//Operaciónes entre las Variables N y M
		System.out.println(" La Suma N + M es = "+ (Math.round(N+M))+ "\n La Diferencia N - M es = " +(Math.round(N-M))+ "\n El producto N*M es = " + (Math.round(N*M))+ "\n El cocientre N/M es = "+(Math.round(N/M))+ "\n El resto N%M = "+ (Math.round(N%M)));
		//Operaciónes entre las Variables X,Y,N,M
		System.out.println(" el cociente Y/M es = "+(Math.round(Y/M))+ "\n el resto Y%M = "+ (Math.round(Y%M))+"\n el doble de X = "+(X*X)+"\n el doble de Y = "+(Y*Y)+"\n el doble de N = "+(N*N)+"\n el doble de M = "+(M*M) + "\n La suma de todas las variables es = " + (Math.round(X+Y+N+M))+ "\n El producto de todas las variables es " + (Math.round(X*Y*N*M)));
		
	
		
		
	}

}
