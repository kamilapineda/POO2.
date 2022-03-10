import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Actividades.Taller1.Asignatura;
import Actividades.Taller1.Estudiante;
import Actividades.Taller1.Profesor;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int option;
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        List<Profesor> profesores = new ArrayList<Profesor>();
        List<Asignatura> asignaturas = new ArrayList<Asignatura>();
        do{
            System.out.println("- Sistema de registro -");
            System.out.println("Ingrese la opción de desee realizar");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar profesor");
            System.out.println("3. Registrar materia");
            System.out.println("4. Buscar estudiante");
            System.out.println("5. Buscar profesor");
            System.out.println("6. Buscar materia");
            System.out.println("7. Mostrar estudiante");
            System.out.println("8. Mostrar profesor");
            System.out.println("9. Mostrar materia");
            System.out.println("0. Salir");
            option= scan.nextInt();
            switch(option){
                case 1: //Registrar estudiante
                try{
                    System.out.println("Ingrese identificación: ");
                    Long id=scan.nextLong();
                    System.out.println("Ingrese su nombre: ");
                    String nombre=scan.next();
                    System.out.println("Ingrese su apellido: ");
                    String apellido=scan.next();
                    System.out.println("Ingrese el número de semestre que cursa: ");
                    int semestre=scan.nextInt();

                    Estudiante est= new Estudiante();
                    est.setId(id);
                    est.setNombre(nombre);
                    est.setApellido(apellido);
                    est.setSemestre(semestre);
                    estudiantes.add(est);

                } catch (Exception e){}
                break;

                case 2: //Registrar profesor
                try{
                    System.out.println("Ingrese identificación: ");
                    Long idp=scan.nextLong();
                    System.out.println("Ingrese su nombre: ");
                    String nombrep=scan.next();
                    System.out.println("Ingrese su apellido: ");
                    String apellidop=scan.next();
                    System.out.println("Ingrese el tipo de profesor: ");
                    System.out.println("1. Tiempo completo");
                    System.out.println("2. Catedra");
                    Integer contrato=scan.nextInt();

                    Profesor profe = new Profesor();
                    profe.setIdp(idp);
                    profe.setNombrep(nombrep);
                    profe.setApellidop(apellidop);
                    profe.setTipoContrato(contrato);
                    profesores.add(profe);
                     
                } catch( Exception e){}
                break;
                case 3: //Registrar Materia 
                try {

                    System.out.println("Ingrese el nombre de la materia:");
                    String nombrea= scan.next();
                    System.out.println("Ingrese el nombre del estudiante:");
                    String estudiantea = scan.next();
                    System.out.println("Ingrese el profesor:");
                    String profesora = scan.next();
                    System.out.println("Ingrese la nota:");
                    Float notaa = scan.nextFloat();

                    Asignatura Asign = new Asignatura();
                    Asign.setNotaa(notaa);
                    Asign.setEstudiantea(estudiantea);
                    Asign.setProfesora(profesora);
                    Asign.setNombrea(nombrea);
                    Asign.excnota(notaa);
                    asignaturas.add(Asign);
                } catch (Exception e) {
                    System.out.println("Error:"+ e.getMessage());
                }
                break;
                case 4: //Buscar estudiante
                    System.out.println("Ingrese el nombre del estudiante que desea buscar:");
                    String texto = scan.next();

                try {
                    List<Estudiante> estudiantes1 = estudiantes.stream()
                        .filter(v -> v.getNombre().startsWith(texto))
                        .collect(Collectors.toList());
                    estudiantes1.forEach((v) -> System.out.println(" Id:"+ v.getId()+ " Nombre:"+ v.getNombre()+ " Apellido:"+ v.getApellido() + " Semestre:"+ v.getSemestre()));        
                    
                } catch (Exception e) {
                    System.out.println("ERROR:"+ e.getMessage());
                }
                finally{
                    System.out.println("Gracias por usar nuestros servidores");
                }   
                break;

                case 5:// Buscar profesor
                    System.out.println("Ingrese el nombre del profesor que desea buscar:");
                    String texto1 = scan.next();
                try {
                    List<Profesor> profe = profesores.stream()
                        .filter(v -> v.getNombrep().startsWith(texto1))
                        .collect(Collectors.toList());
                    profe.forEach((v) -> System.out.println(" Id:"+ v.getIdp()+ " Nombre:"+ v.getNombrep()+ " Apellido:"+ v.getApellidop() + " Tipo de contrato:"+ v.getTipoContrato()));        
                
                } catch (Exception e) {
                    System.out.println("ERROR:"+ e.getMessage());
                }
                break;

                case 6:// Buscar Materia
                    System.out.println("Ingrese el nombre de la materia que desea buscar:");
                    String texto2 = scan.next();
                try {
                    List<Asignatura> asign = asignaturas.stream()
                    .filter(v -> v.getNombrea().startsWith(texto2))
                    .collect(Collectors.toList());
                asign.forEach((v) -> System.out.println("Nombre de la materia:"+ v.getNombrea()+ " Nombre del estudiante:"+ v.getEstudiantea()+ " Nombre del maestro:"+ v.getProfesora() + " Nota:"+ v.getNotaa()));        
                }
                 catch (Exception e) {}
                break;

                case 7: //Mostrar estudiante
                try {
                    estudiantes.forEach((p)-> System.out.println("Id del estudiante:"+ p.getId()+ " Nombre del estudiante:"+ p.getNombre()+ " Apellido del estudiante:"+ p.getApellido() + " Semestre que cursa:"+ p.getSemestre()));
                    break;
                    
                } catch (Exception e) {}
                break;
                case 8: //Mostrar profesor
                try{
                    profesores.forEach((p)-> System.out.println("Id del profesor:" + p.getIdp()+ " Nombre del profesor:"+ p.getNombrep()+ " Apellido del profesor:"+ p.getApellidop()+ " Tipo de contrato:"+ p.getTipoContrato()));
                    break;
                } catch (Exception e){}
                case 9: //Mostrar materia
                try{
                    asignaturas.forEach((p) -> System.out.println("Nombre de la materia:"+ p.getNombrea()+" Nombre del estudiante:"+ p.getEstudiantea()+ " Nombre del profesor:"+ p.getProfesora()+ " Nota:"+ p.getNotaa()));
                break;
                } catch(Exception e){}
            }  
        }while(option !=0);
    }
}