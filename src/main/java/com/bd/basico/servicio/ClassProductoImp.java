package com.bd.basico.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bd.basico.model.TblProducto;
import com.bd.basico.repositorio.IProductoRepositorio;

public class ClassProductoImp  implements IProductoServicio{
	
	//aplicamos la inyeccion de dependencia...
	@Autowired
	private IProductoRepositorio iproductorepository;

	@Override
	public List<TblProducto> ListadoProductos() {
		// devuelve listado
		return (List<TblProducto>)iproductorepository.findAll();
	}

	@Override
	public void RegistrarProducto(TblProducto producto) {
		// registra los datos de producto
		iproductorepository.save(producto);
		
	}

	@Override
	public TblProducto BuscarPorId(Integer id) {
		// buscar producto por codigo, si no encuentra devuelve nulo...
		return iproductorepository.findById(id).orElse(null);
	}

	@Override
	public void Eliminar(Integer id) {
		// eliminar por codigo
		iproductorepository.deleteById(id);
		
	}
	
	
	
	

}
