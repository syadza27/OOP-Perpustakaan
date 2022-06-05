package id.ac.uns.vokasi.d3ti.perpustakaan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.uns.vokasi.d3ti.perpustakaan.model.Anggota;
import id.ac.uns.vokasi.d3ti.perpustakaan.repository.AnggotaRepo;

@Service
public class AnggotaServiceImpl implements AnggotaService{
	
	@Autowired
	private AnggotaRepo anggotaRepository;

	@Override
	public List<Anggota> getAllAnggota() {
		// TODO Auto-generated method stub
		return anggotaRepository.findAll();
	}

	@Override
	public void saveAnggota(Anggota anggota) {
		// TODO Auto-generated method stub
		this.anggotaRepository.save(anggota);
	}

	@Override
	public Anggota getAnggotaById(long id) {
		// TODO Auto-generated method stub
		Optional < Anggota > optional = anggotaRepository.findById(id);
		Anggota angggota = null;
		
		if(optional.isPresent()) {
			angggota = optional.get();
		} else {
			throw new RuntimeException("Anggota dengan id :" + id + " tidak ditemukan");
		}
		return angggota;
	}

	@Override
	public void deleteAnggotaById(long id) {
		// TODO Auto-generated method stub
		this.anggotaRepository.deleteById(id);
		
	}
	
}
