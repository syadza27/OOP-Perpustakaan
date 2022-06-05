package id.ac.uns.vokasi.d3ti.perpustakaan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import id.ac.uns.vokasi.d3ti.perpustakaan.model.Anggota;
import id.ac.uns.vokasi.d3ti.perpustakaan.service.AnggotaService;

@Controller
public class AnggotaController {
	
	@Autowired
	private AnggotaService anggotaService;
	
	//menampilkan daftar anggota
	@GetMapping("/anggota")
	public String viewAnggota(Model model) {
		
		model.addAttribute("listAnggota", anggotaService.getAllAnggota());
		
		return "anggota";
	}
	
	@GetMapping("/addAnggota")
	public String addAnggota(Model model) {
		
		//membuat atribut model untuk bind data
		Anggota anggota = new Anggota();
		model.addAttribute("anggota", anggota);
		
		return "tambah_anggota";
	}
	
	@PostMapping("/saveAnggota")
	public String saveAnggota(@ModelAttribute("anggota") Anggota anggota) {
		
		//simpan data ke database
		anggotaService.saveAnggota(anggota);
		
		return "redirect:/anggota";
	}
	
	@GetMapping("/editAnggota/{id}")
	public String editAnggota(@PathVariable(value = "id") long id, Model model) {
		
		//mengambil anggota dari servis
		Anggota anggota = anggotaService.getAnggotaById(id);
		
		//isi form edit dengan data sebelumnya
		model.addAttribute("anggota", anggota);
		
		return "edit_anggota";	
	}
	
	@GetMapping("anggota/deleteAnggota/{id}")
	public String deleteAnggota(@PathVariable(value = "id") long id) {
		
		// hapus data
		this.anggotaService.deleteAnggotaById(id);
		
		return "redirect:/anggota";
	}
	
}
