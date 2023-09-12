class Personaje {
protected String nombre;
private int nivel;
public Personaje(String nombre, int nivel) {
this.nombre = nombre;
if (nivel < 1) {
    throw new IllegalAccessError(" Error: El nivel tiene que ser al menos uno");
}
this.nivel = nivel;

}
public void atacar() {
    if (nivel < 5) {
    throw new RuntimeException("Error: Para poder realizar un ataque debes ser nivel 5 ");
    
}
System.out.println(nombre + " ataca a un objetivo.");
}
public void realizarAccionEspecial() {
}
}
