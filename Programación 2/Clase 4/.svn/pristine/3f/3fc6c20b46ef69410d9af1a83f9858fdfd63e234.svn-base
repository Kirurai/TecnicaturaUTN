package ProyectoStock;

import java.util.ArrayList;

public class Fuente extends DatosComercio{
	private ArrayList<Producto> stockFuente = new ArrayList<>();

	
	/**
	 * @return the stockFuente
	 */
	public ArrayList<Producto> getStockFuente() {
		return stockFuente;
	}



	/**
	 * @param stockFuente the stockFuente to set
	 */
	public void setStockFuente(ArrayList<Producto> stockFuente) {
		this.stockFuente = stockFuente;
	}



	@Override
	public void AgregarProducto(ArrayList<Producto> stockDestino) {
		if(stockDestino.size()>0 && stockDestino.size()<=100 && stockFuente.size()<=100) {
			stockFuente.add(stockDestino.get(0));
			stockDestino.remove(0);
		}
		
	}

	@Override
	public void RemoverProducto(ArrayList<Producto> stockDestino) {
		// TODO Auto-generated method stub
		
	}

}
