package miPrincipal;

public class AppDelimitador {
    public static void main(String[] args) {
        String expr = "(a+b)/2"; //CORRECTA
        Delimitadores objDel = new Delimitadores();
		if (objDel.evaluacionDelimitadores(expr))
			System.out.println("Expresion Correcta");
		else
			System.out.println("Expresion Incorrecta");
        
        expr = "(a+b/2";//INCORRECTA
        if (objDel.evaluacionDelimitadores(expr))
			System.out.println("Expresion Correcta");
		else
			System.out.println("Expresion Incorrecta");
        
        expr = "while (m<(n[8]+0)) {"+
               " int p=7;"+
               " /*comentarios*/"+
               "} "; 
        if (objDel.evaluacionDelimitadores(expr))
            System.out.println("Expresion Correcta");
        else
            System.out.println("Expresion Incorrecta");

        expr = "while (m<(n(8]+0)) {"+
               " int p=7;"+
               " /*comentarios*/"+
               "} "; 

        if (objDel.evaluacionDelimitadores(expr))
            System.out.println("Expresion Correcta");
        else
            System.out.println("Expresion Incorrecta");

        expr = "while (m<(n(8]+0)) {{"+
               " int p=7;"+
               " /*comentarios*/"+
               "} "; 
        if (objDel.evaluacionDelimitadores(expr))
            System.out.println("Expresion Correcta");
        else
            System.out.println("Expresion Incorrecta");

           
        
        
    }
}
