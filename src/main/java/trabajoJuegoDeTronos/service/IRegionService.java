package trabajoJuegoDeTronos.service;

import java.util.List;

import trabajoJuegoDeTronos.model.Region;

public interface IRegionService {
	List<Region> listarRegiones();
	Region encontrarPorId(int id);
	List<Region> listarPorNombre(String nombre);
	void guardar(Region region);
	void eliminar(int id);
}
