package Actividades.Taller1;

public class Estudiante {
    private static int length;
    private Long id;
    private String nombre;
    private String apellido;
    private Integer semestre;

    public  Estudiante(Long id, String nombre, String apellido, Integer semestre){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.semestre=semestre;
    }
    public Estudiante() {
    }
    public Long getId (){
        return id;
    }
    public void setId (Long id){
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public Integer getSemestre(){
        return semestre;
    }
    public void setSemestre(Integer semestre){
        this.semestre=semestre;
    }
    public static void add(Estudiante est) {
    }
    public static void exces(int id){
        int i = 0;
        while(i< Estudiante.length){
            if (Estudiante[i] != texto.getId);
        }
    }
}
