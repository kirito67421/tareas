public class Ejercicios
{
	//deveulve true si "numero" es par y false de lo contrario
	static boolean esPar(int numero) // este se encargar de  ver si el numero es par
	{
		if(numero%2==1) // este si es el que define si es par
			return false;
		else
			return true;	
	}
	
	
	//devuelve "gratis" si lempiras es igual a 0
	//devuelve "barato" si lempiras es menor que 100
	//devuelve "normal" si lempiras es menor que 200
	//de lo contrario devuelve caro
	//nota: solo aceptan minusculas
	static String obtenerPrecio(int lempiras)// esta encarga de decir en palabras si es barato o caro 
	{
		if(lempiras==0)  // este si envia si es gratiis, o baratom o normal o caro segun las escala
		return "gratis";
		if(lempiras>0 & lempiras<100)
		return "barato";
		if(lempiras>100 &lempiras<200)
		return "normal";
		if(lempiras>200)
		return "caro";
		return null;
	}
	
	//devuelve el factorial de "num"
	static int factorial(int num) // este se ecnargar se sacar el factorial de un numero
	{ int res=1;
	 
	for(int i=num;i>0;i--) // este for multiplica hasta llegar al factorial
	 {res=i*res;}
	return res;
	}

	
	//devuelve el elemento de "arr" en la posicion "pos"
	static int getElemento(int arr[],int pos)  //  se ecngar de ver el resiltado de un array
	{   int resu=0;
		resu=arr[pos];
		return resu;
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	static int getElemento(int arr[][],int col,int fila)
	{ int resu=0;
	resu=arr[col][fila];
		return resu;
	}
	
	//devuelve el atributo "x" de "MiClase"
	static int getX(MiClase mi_clase)
	{ 
		return mi_clase.x;
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	static int fibonacci(int num)
	{
		if(num==1) return //con este si hago el finobachi
		else if (num==0) return 0;
		return fibonacci(num-1) + fibonacci(num-2);
	}
	
	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 1 y funcionRecursiva(1) = 2
	static int funcionRecursiva(int num)
	{
		if(num==0) return 1;
		else if(num==1) return 2;
		return funcionRecursiva(num-1)*2+1;
	}
	
	public static void main(String[] args)
	{

	}

}

