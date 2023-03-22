package controller;

import java.util.List;

import dao.detallesPedidosDao;
import dao.pedidosDao;
import model.modelDetallesPedidos;
import model.modelPedidos;

public class pedidosController {

	public static boolean insertarPedido(modelPedidos pedido, List <modelDetallesPedidos> detalles) {
		if(pedidosDao.insertarPedido(pedido)) {
			int id = pedidosDao.devolverIdPedido(pedido.getId_usuario());
			if(insertarDetalles(detalles, id)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean insertarDetalles(List <modelDetallesPedidos> detalles, int id) {
		for(modelDetallesPedidos detalle : detalles) {
			detalle.setId_pedido(id);
		}
		
		if(detallesPedidosDao.insertarDetallesPedido(detalles)) {
			return true;
		}
		return false;
	}
	
}
