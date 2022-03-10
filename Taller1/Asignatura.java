package Actividades.Taller1;

public class Asignatura {
    private String nombrea;
    private String estudiantea;
    private String profesora;
    private String materiaa;
    private Float notaa;

    public Asignatura (String nombrea, String estudiantea, String profesora, String materiaa, Float notaa){
        this.nombrea=nombrea;
        this.estudiantea=estudiantea;
        this.setProfesora(profesora);
        this.setMateria(materiaa);
        this.setNotaa(notaa);
    }
    public Float getNotaa() {
        return notaa;
    }
    public void setNotaa(Float notaa) {
        this.notaa = notaa;
    }
    public Asignatura() {
    }
    public String getMateriaa() {
        return materiaa;
    }
    public void setMateria(String materiaa2) {
        this.materiaa = materiaa2;
    }
    public String getProfesora() {
        return profesora;
    }
    public void setProfesora(String profesora2) {
        this.profesora = profesora2;
    }
    public String getNombrea(){
        return nombrea;
    }
    public void setNombrea(String nombrea){
        this.nombrea=nombrea;
    }
    public String getEstudiantea(){
        return estudiantea;
    }
    public void setEstudiantea(String estudiante) {
        this.estudiantea=estudiante;
    }
    public void excnota (Float notaa)throws Exception{
        if (notaa<0 || notaa>5){
            throw new Excepcion("Digite una nota valida");
        }else{
            notaa=getNotaa();
        }
    }
}
