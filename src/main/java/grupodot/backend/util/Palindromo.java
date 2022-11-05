package grupodot.backend.util;

public class Palindromo {

    public static String esPalindromo(String cadena) {
        String mensaje = "";
        cadena = cadena.toLowerCase();
        String[] palabras = cadena.split(" ");

        String subcadena = "";
        if (palabras.length > 1) {
            for (int i = 0, j = cadena.length() - 1; i <= j; i++, j--) {
                if (cadena.charAt(i) == cadena.charAt(j)) {
                    mensaje = "La cadena es palindromo";
                } else {
                    subcadena = subcadena + palabraMayorLongitud(cadena);
                    if (!subcadena.equals(palabraInvertida(subcadena))) {
                        mensaje = "Ni la cadena ni la subcadena de mayor longitud son palíndromos";
                    } else {
                        mensaje = "La cadena no es palíndromo pero la subcadena de mayor longitud sí";
                    }
                }
            }
        }
        else {
            for (int l = 0; l < cadena.length() - 1; l++) {
                if (!cadena.equals(palabraInvertida(cadena))) {
                    if (cadena.charAt(l) != cadena.charAt(l + 1)) {
                        mensaje = "Ni la frase ni una parte son palíndromos";
                    } else {
                        mensaje = "La frase no es palíndromo pero una parte sí";
                    }
                } else {
                    mensaje = "La frase es palíndromo";
                }
            }
        }
        return mensaje;
    }

    public static String palabraMayorLongitud(String cadena) {
        String[] palabras = cadena.split(" ");

        String mayor = palabras[0];
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > mayor.length()) {
                mayor = palabras[i];
            }
        }
        return mayor;
    }

    public static String palabraInvertida(String palabra) {
        String fraseInvertida = "";
        for (int k = palabra.length() - 1; k >= 0; k--) {
            fraseInvertida = fraseInvertida + palabra.charAt(k);
        }
        return fraseInvertida;
    }
}
