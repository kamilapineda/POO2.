package Actividades.Taller1;

public class Profesor {
    private Long idp;
    private String nombrep;
    private String apellidop;
    private Integer tipoContrato;

    public  Profesor(Long idp, String nombrep, String apellidop, Integer tipoContrato){
        this.idp=idp;
        this.nombrep=nombrep;
        this.apellidop=apellidop;
        this.tipoContrato=tipoContrato;
    }
    public Profesor() {
    }
    public Long getIdp (){
        return idp;
    }
    public void setIdp (Long idp){
        this.idp=idp;
    }
    public String getNombrep(){
        return nombrep;
    }
    public void setNombrep(String nombrep){
        this.nombrep=nombrep;
    }
    public String getApellidop(){
        return apellidop;
    }
    public void setApellidop(String apellidop){
        this.apellidop=apellidop;
    }
    public Integer getTipoContrato(){
        return tipoContrato;
    }
    public void setTipoContrato(Integer tipoContrato){
        this.tipoContrato=tipoContrato;
    }
    public static void add(Profesor prof) {
    }
    
    public void contrato(int tipo){
        if(tipo ==1){
            System.out.println("Contrato de tiempo completo");

        }
        else if(tipo ==2){
            System.out.println("Contrato de catedra");
        }
    }
}
