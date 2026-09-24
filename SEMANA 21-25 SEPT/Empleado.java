public class Empleado {
    private String nombre;
    private String cargo;
    private double salarioBase;
    private int anosExperincia;

    public Empleado() {
    }

    public Empleado(String nombre, String cargo, double salarioBase, int anosExperincia) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.anosExperincia = anosExperincia;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAnosExperincia() {
        return anosExperincia;
    }

    public void setAnosExperincia(int anosExperincia) {
        this.anosExperincia = anosExperincia;
    }
    public String verDetalle(){
        return "el empleado se llama: "+ this.nombre +
        "su cargo es: " + this.cargo+
        "su salario base es: " + this.salarioBase +
       "anos de experiencia: " + this.anosExperincia;
        
        
    }
    public String Trabajar(int horas ){
        return "el empleado llamado: " + this.nombre + "trabaja" + horas +"aldia";
       
        
    }
    public String TomarDescanso(){
        return "el empleado" +this.nombre+" descansa una hora al dia " ;
    }
    public String TrabajayDescansa(int horas){
           String traba = this.Trabajar(horas);
           String descan = this.TomarDescanso();
           return traba + descan;
    }
   
    
    
    
}
