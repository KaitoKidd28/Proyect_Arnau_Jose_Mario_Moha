package planetwars;

public interface MilitaryUnit {
	// Nos devolverá el poder de ataque que tenga la unidad.
	public abstract int attack();
	
	// Restará a nuestro blindaje el daño recibido por parámetro.
	public abstract void tekeDamage(int receivedDamage);
	
	// Nos devolverá el blindaje que tengamos actualmente, después de haber recibido un ataque. 
	public 	abstract int getAcualArmor();
	
	// Nos devolverá el coste de Metal que tiene crear una nueva unidad.
	public abstract int getMetalCost();
	
	// Nos devolverá el coste de Deuterium que tiene crear una nueva unidad.
	public abstract int getDeuteriumCost();
	
	// Nos la probabilidad de generar residuos al ser totalmente eliminada (bindaje 0 o inferior)
	public abstract int getChanceGeneratinWaste();
	
	// Nos da la probabilidad de generar volver a atacar.
	public abstract int getChanceAttackAgain();
	
	// Nos restablecerá nuestro blindaje a su valor original.
	public abstract void resetArmor();
	
}