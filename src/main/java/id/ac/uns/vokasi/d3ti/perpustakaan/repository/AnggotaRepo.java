package id.ac.uns.vokasi.d3ti.perpustakaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.ac.uns.vokasi.d3ti.perpustakaan.model.Anggota;

@Repository
public interface AnggotaRepo extends JpaRepository<Anggota, Long>{

}
