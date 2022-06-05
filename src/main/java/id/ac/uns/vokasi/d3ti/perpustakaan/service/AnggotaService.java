package id.ac.uns.vokasi.d3ti.perpustakaan.service;

import java.util.List;

import id.ac.uns.vokasi.d3ti.perpustakaan.model.Anggota;

public interface AnggotaService {
	List < Anggota > getAllAnggota();
	
	void saveAnggota(Anggota anggota);
	
	Anggota getAnggotaById(long id);
	
	void deleteAnggotaById(long id);
}
