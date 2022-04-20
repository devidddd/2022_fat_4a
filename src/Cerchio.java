/**
 * Java doc
 * <h1>Classe Cerchio</h1>
 * 
 * <ul>
 * Funzioni:</b>
 * <li>Circonferenza sium
 * <li>Area
 * </ul>
 * 
 * @author Davide
 *
 */

public class Cerchio 
{
	private double raggio;
	
	/**
	 * metodo costruttore della classe cerchio
	 * 
	 * @param raggio del cerchio
	 */
	
	public Cerchio(double raggio) 
	{
		this.raggio=raggio;
	}
	
	/**
	 * calcola la circonferenza del cerchio
	 * 
	 * @return ritorna la circonferenza del cerchio
	 */
	
	public double circonferenza() 
	{
		return(2*raggio*Math.PI);
	}
	
	/**
	 * calcola l'area  del cerchio
	 * 
	 * @return ritorna l'area del cerchio
	 */
	
	public double area()
	{
		return(raggio*raggio*Math.PI);
	}
}
