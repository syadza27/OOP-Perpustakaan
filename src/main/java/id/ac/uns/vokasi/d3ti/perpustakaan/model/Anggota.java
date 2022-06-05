package id.ac.uns.vokasi.d3ti.perpustakaan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anggota")
public class Anggota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nama")
	private String nama;
	
	@Column(name = "tplhr")
	private String tplhr;
	
	@Column(name = "tglhr")
	private String tglhr;
	
	@Column(name = "email")
	private String email;	
	
	@Column(name = "jk")
	private String jk;

	@Column(name = "kelas")
	private String kelas;

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTplhr() {
		return tplhr;
	}

	public void setTplhr(String tplhr) {
		this.tplhr = tplhr;
	}

	public String getTglhr() {
		return tglhr;
	}

	public void setTglhr(String tglhr) {
		this.tglhr = tglhr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJk() {
		return jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}

	public String getKelas() {
		return kelas;
	}

	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	
	
}
