/**
 * <h1>Classe Cilindro che estende Cerchio</h1>
 * 
 * @author Davide
 * @version 3.0
 *
 */

public class Cilindro extends Cerchio 
{
	private double altezza;
	
	/**
	 * @param raggio	raggio del cilindro
	 * @param altezza	altezza del cilindro
	 */
	
	public Cilindro(double raggio, double altezza) 
	{
		super(raggio);
		this.altezza=altezza;
	}
	
	/**
	 * @return ritorna il valore del volume
	 */
	
	public double volume() 
	{
		double vol=area()*altezza;
		return(vol);
	}
}
