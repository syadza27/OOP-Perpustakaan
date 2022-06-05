package id.ac.uns.vokasi.d3ti.perpustakaan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.uns.vokasi.d3ti.perpustakaan.model.Anggota;
import id.ac.uns.vokasi.d3ti.perpustakaan.model.Buku;
import id.ac.uns.vokasi.d3ti.perpustakaan.repository.BukuRepo;

@Service
public class BukuServiceImpl implements BukuService {

	@Autowired
	private BukuRepo bukuRepository;
	
	@Override
	public List<Buku> getAllBuku() {
		// TODO Auto-generated method stub
		return bukuRepository.findAll();
	}

	@Override
	public void saveBuku(Buku buku) {
		// TODO Auto-generated method stub
		this.bukuRepository.save(buku);
		
	}

	@Override
	public Buku getBukuById(long id) {
		// TODO Auto-generated method stub
		Optional < Buku > optional = bukuRepository.findById(id);
		Buku buku = null;
		
		if(optional.isPresent()) {
			buku = optional.get();
		} else {
			throw new RuntimeException("Buka dengan id :" + id + " tidak ditemukan");
		}
		return buku;
	}

	@Override
	public void deleteBukuById(long id) {
		// TODO Auto-generated method stub
		this.bukuRepository.deleteById(id);
	}

}
