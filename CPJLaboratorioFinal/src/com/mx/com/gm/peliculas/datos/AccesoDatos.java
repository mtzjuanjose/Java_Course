package com.mx.com.gm.peliculas.datos;

import java.util.List;
import com.mx.com.gm.peliculas.domain.*;
import com.mx.com.gm.peliculas.excepciones.*;

public interface AccesoDatos {
	boolean existe(String nombreArchivo) throws AccesoDatosEx;

	public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;
	
	void escribir (Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
	
	public String buscar(String nombreArchivo, String buscar)throws LecturaDatosEx;
	
	public void create(String nombreArchivo) throws AccesoDatosEx;
	
	public void delete(String nombreArchivo)throws AccesoDatosEx;
	
}
