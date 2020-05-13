package ProyectoStock;

import java.util.ArrayList;

public class Destino extends DatosComercio {

	private ArrayList<Producto> stockDestino = new ArrayList<>();
	
	
	
	/**
	 * @return the stockDestino
	 */
	public ArrayList<Producto> getStockDestino() {
		return stockDestino;
	}

	/**
	 * @param stockDestino the stockDestino to set
	 */
	public void setStockDestino(ArrayList<Producto> stockDestino) {
		this.stockDestino = stockDestino;
	}

	@Override
	public void AgregarProducto(ArrayList<Producto> stockFuente) {
		if(stockFuente.size()>0 && stockFuente.size()<=100 && stockDestino.size()<=100) {
			stockDestino.add(stockFuente.get(0));
			stockFuente.remove(0);
		}
	}

	@Override
	public void RemoverProducto(ArrayList<Producto> stockFuente) {
		// TODO Auto-generated method stub
		
	}
	
	
}
