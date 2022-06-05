package id.ac.uns.vokasi.d3ti.perpustakaan.service;

import java.util.List;

import id.ac.uns.vokasi.d3ti.perpustakaan.model.Buku;

public interface BukuService {

List < Buku > getAllBuku();
	
	void saveBuku(Buku buku);
	
	Buku getBukuById(long id);
	
	void deleteBukuById(long id);
	
}
