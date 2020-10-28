/**
 * 
 */
package org.openmanager.LCL.sii.dte;



/**
 * @author raul
 * El taxid en Chile se llama RUT
 * La definición del RUT según el Servicio de Impuestos Internos es un número entero sin separadores de miles,
 * seguido de un guión y digito verificador.
 * 
 * En general el formato del RUT es X-Y
 * Donde:
 * X: Es un número entero >100.000 . Los ceros delante de este número no se consideran.
 * -: el caracter guión "-" es un caracter que separa el número X del dígito verificador Y
 * Y: es el dígito verificador de X, para un número X existe un único dígito Y. El cual se puede determinar
 * por medio de un algoritmo de cálculo. Según este algoritmo Y puede tomar valores enteros entre 0 y 9 o la letra K (mayuscula).
 * 
 * Algoritmo de cálculo de Y:
 * 1.-El primer número (dígito) de X de derecha a izquierda se amplifica por 2, el siguiente número por tres,
 * el sucesivo por cuatro y así susecivamente. En el octavo dígito se vuelve a empezar con el número 2, el noveno por 3, etc.
 * 2.-Se suman los resultados parciales de las multiplicaciones obtenidas en el paso anterior.
 * 3.-La suma total del punto anterior se divide por 11 para obtener el Residuo de la división.
 * 4.-Cuando el Residuo es 1, el valor de Y es K y si es 0 el valor de Y es 0, para los otros casos. El valor de Y es la diferencia entre 11 y el residuo.
 * 
 * Facilidades de la clase:
 * Intentará construir un RUT a partir de un String. Si el String contiene puntos los eliminará y si no contiene el guión en
 * la penúltima posición lo insertará dentro del String en esa posición, asumiendo que el último dígito del String es el digito verificador.
 * 
 * 
 */
public class RUT {

	private char dv;
	private char guion='-';
	public String bodyrut2test;
	
	public RUT(String rut2test) throws RUTException {
		
		if (rut2test==null || rut2test.trim().length() <2) throw (new RUTException("falta rut"));
		rut2test=rut2test.trim();
		//if (rut2test.indexOf("-")==-1) rut2test=rut2test.substring(0,rut2test.length()-1)+guion+rut2test.substring(rut2test.length()-1,rut2test.length());//+por mi
		if (rut2test.indexOf(guion)==-1) rut2test = new StringBuilder(rut2test).insert(rut2test.length()-1, guion).toString();
		char gguion = rut2test.charAt(rut2test.length() - 2);
		if (gguion != guion)
			throw (new RUTException("El RUT está malo, el guión debe estar justo antes del Digito Verificador"));
		
		dv = Character.toUpperCase(rut2test.charAt(rut2test.length() - 1));
		if (!Character.isDigit(dv) && dv != 'K') // dv puede ser un numero entre 0 y 9 o K
			throw (new RUTException("El Digito Verificador está malo"));
		
		bodyrut2test = rut2test.substring(0, rut2test.length() - 2);
		try {
		int bodyrut2testint = Integer.parseInt(bodyrut2test.replace(".",""));
		bodyrut2test = Integer.toString(bodyrut2testint);
		} catch (NumberFormatException nfe) {
			throw (new RUTException("El Rut está malo, solo pueden ser números los que lo componen o K para el Digito Verificador"));
		}
		
		
		
		if (dv != getDigito())
			throw (new RUTException("El dígito verificador no corresponde:"+dv+" <> "+getDigito()));
	}
		
	public char getDigito() {
		int mult = 2; // 2 hasta 7
		int suma = 0;

		for (int i = bodyrut2test.length() - 1; i >= 0; i--) {
			suma += mult * Character.digit(bodyrut2test.charAt(i),Character.LETTER_NUMBER);
			if (mult == 7)
				mult = 2;
			else
				mult++;
		}
		suma = suma % 11;
		switch (suma) {
			case 0 :
				return ('0');
			case 1 :
				return ('K');
			default :
				return (
					Character.toUpperCase(
						Character.forDigit(
							11 - suma,
							Character.LETTER_NUMBER)));
		}
	}

	public String toString() {
		
		return (bodyrut2test + guion + getDigito());
	}
		
		
	
	
	
}
