package PlanetWars;

public class ResourceException extends Exception{
	public ResourceException(String message) {
		super(message);
	}
	public ResourceException() {
		System.out.println("Mensaje de ResourceException indeterminado.");
	}
}
