public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Leon", 18);
        System.out.println("El animal llamado " + animal.nombre + " con una edad de: " + animal.edad 
        + " hace: " + animal.hacerSonido());
        
        Gato gato = new Gato("Aquiles", 9);
        System.out.println("El gato llamado: " + gato.nombre + " con una edad de: " + animal.edad 
        + " hace: " + gato.hacerSonido());
    }
}
