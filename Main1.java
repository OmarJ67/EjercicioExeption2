public class Main1 {
public static void main(String[] args) {
Personaje[] personajes = new Personaje[2];
personajes[0] = new Jugador("Omar", 1, "Guerrero");
personajes[1] = new Enemigo("Orco Vengador", 0, "Orco");
for (Personaje personaje : personajes) {
personaje.atacar();
personaje.realizarAccionEspecial();
System.out.println();
}
}
}