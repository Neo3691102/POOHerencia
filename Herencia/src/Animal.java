public class Animal { //CLASE PADRE
    String nombre;
    int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String hacerSonido(){
        return "Grrr";
    }
}
