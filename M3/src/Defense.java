
public class Defense implements MilitaryUnit, Variables{
	// armor será la armadura restante de nuestra defensa durante las batallas.
	private int armor;
	// InitialArmor será la armadura inicial de nuestra defensa, es decir, la armadura al momento de crearla.
	private int initialArmor;
	// BaseDamage el poder de ataque, le llamaremos baseDamage pensando en alguna posible ampliación del proyecto.
	private int baseDAmage;
	
	public Defense(int armor, int baseDAmage) {
		super();
		this.armor = armor;
		this.baseDAmage = baseDAmage;
	}
	
	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getAcualArmor() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getMetalCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getDeuteriumCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getChanceGeneratinWaste() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getChanceAttackAgain() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void resetArmor() {
		// TODO Auto-generated method stub
		
	}
	
}
