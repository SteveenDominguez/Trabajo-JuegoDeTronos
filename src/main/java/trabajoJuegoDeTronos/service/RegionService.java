package trabajoJuegoDeTronos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trabajoJuegoDeTronos.model.Region;
import trabajoJuegoDeTronos.repository.RegionRepository;
@Service
public class RegionService implements IRegionService {
	@Autowired
	RegionRepository region;
	@Override
	public List<Region> listarRegiones() {
		// TODO Auto-generated method stub
		return region.findAll();
	}

	@Override
	public Region encontrarPorId(int id) {
		// TODO Auto-generated method stub
		return region.findById(id);
	}

	@Override
	public List<Region> listarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return region.findByNombre(nombre);
	}

}
