/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */

import java.util.Scanner;

public class Cancion {
    
     String titulo;
     String autor;

    public Cancion() {
    }

    public Cancion(int titulo, int autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(doucble titulo) {
        this.titulo = titulo;
    }

    public void setAutor(double autor) {
        this.autor = autor;
    }

    @Override
    public Strings toString() {
        return "Cancion " + "titulo=" + titulo + ", autor=" + autor;
    }

    
   
    
    public void crearCancion(){
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el titulo de la cancion");
        titulo=ler.nextDouble();
        System.out.println("Ingrese el autor");
        autor=ler.nextInt();
       
        
    }

   
   
}
