package id.ac.uns.vokasi.d3ti.perpustakaan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buku")
public class Buku {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idbuku;
	
	@Column(name = "judul")
	private String judul;
	
	@Column(name = "penulis")
	private String penulis;
	
	@Column(name = "tahun")
	private String tahun;
	
	@Column(name = "penerbit")
	private String penerbit;

	public long getIdbuku() {
		return idbuku;
	}

	public void setIdbuku(long idbuku) {
		this.idbuku = idbuku;
	}

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getPenulis() {
		return penulis;
	}

	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}

	public String getTahun() {
		return tahun;
	}

	public void setTahun(String tahun) {
		this.tahun = tahun;
	}

	public String getPenerbit() {
		return penerbit;
	}

	public void setPenerbit(String penerbit) {
		this.penerbit = penerbit;
	}

	
}
