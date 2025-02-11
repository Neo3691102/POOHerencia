public class Gato extends Animal { //CLASE HIJO QUE HEREDA DE ANIMAL
    String nombre;
    int edad;

    public Gato(String nombre, int edad){
        super(nombre,edad); //SUPER CONSTRUCTOR NECESARIO
    }

    @Override
    public String hacerSonido(){
        return "Miau";
    }
}
