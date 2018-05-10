
package exemplostream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;


public class UsosStreams {
    
    List<Alumno>listaAlumnos = new ArrayList();
     List<Alumno> suspensos;
    
    public void crearLista(){
        listaAlumnos.add(new Alumno("111","Ana","dam1",4));
        listaAlumnos.add(new Alumno("222","Ana","dam1",8));
        listaAlumnos.add(new Alumno("333","Anton","dam2",6));
        listaAlumnos.add(new Alumno("444","Brais","fpb",5));
        listaAlumnos.add(new Alumno("555","Noa","adm",7));
    }
    public void amosar(){
        crearLista();
        for(Alumno al:listaAlumnos)
          System.out.println(al);
        //usando Streams
         listaAlumnos.stream().forEach(al->System.out.println(al));

        //utilizando referencia a metodos
       // listaAlumnos.stream().forEach(System.out::println);
    }
    public void amosarAlumnoDeterminado(){
         crearLista();
        //amosar os alumnos que empezan por a
        
        listaAlumnos.stream().filter(al->al.getNome().charAt(0)=='A').forEach(System.out::println);
        listaAlumnos.stream().filter(al->al.getNome().startsWith("B")).forEach(al->System.out.println(al));
         
                
    }
    public void aprobados(){
         crearLista();
        listaAlumnos.stream().filter(al->al.getNota()>=5).forEach(System.out::println);

    }
      public void suspensos(){
           crearLista();
       suspensos = listaAlumnos.stream().filter(al->al.getNota()<5).collect(Collectors.toList());
       //suspensos.forEach(al->System.out.println(al));


    }
      public void amosarSuspensos(){
          crearLista();
          suspensos.stream().forEach(System.out::println);
      }
      
      public void buscarAlumno(){
          crearLista();
          
         String nif = JOptionPane.showInputDialog("Introduce dni");
         
         listaAlumnos.stream().filter(al-> al.getDni().equals(nif)).forEach(System.out::println);
          
      }
      public void mayorNota(){
            
           crearLista();
         System.out.println(listaAlumnos.stream().max((al1,al2)->al1.getNota()-al2.getNota()).get());
      }
      public void ordenar(){
          crearLista();
          listaAlumnos.stream().sorted((al1,al2)-> al1.getNome().compareToIgnoreCase(al2.getNome())).forEach(System.out::println);
      }
      public void subirNota(){
          crearLista();
          
          listaAlumnos.stream().map((al)-> al.getNota()+2).forEach(System.out::println);
          listaAlumnos.stream().filter(al -> al.getNota()>5).map(al -> al.getNota()+2).forEach(System.out::println);
      }
}
