package com.bd.basico.servicio;

import java.util.List;

import com.bd.basico.model.TblProducto;

public interface IProductoServicio {
	
	//declaramos los metodos 
	public List<TblProducto>ListadoProductos();
	public void RegistrarProducto(TblProducto producto);
	public TblProducto BuscarPorId(Integer id);
	public void Eliminar (Integer id);

}
