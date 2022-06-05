package id.ac.uns.vokasi.d3ti.perpustakaan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import id.ac.uns.vokasi.d3ti.perpustakaan.model.Buku;
import id.ac.uns.vokasi.d3ti.perpustakaan.service.BukuService;

@Controller
public class BukuController {

	@Autowired
	private BukuService bukuService;
	
	@GetMapping("/buku")
	public String viewBuku(Model model) {
		
		model.addAttribute("listBuku", bukuService.getAllBuku());
		
		return "buku";
	}
	
	@GetMapping("/addBuku")
	public String addBuku(Model model) {
		
		//membuat atribut model untuk bind data
		Buku buku = new Buku();
		model.addAttribute("buku", buku);
		
		return "tambah_buku";
	}
	
	@PostMapping("/saveBuku")
	public String saveBuku(@ModelAttribute("buku") Buku buku) {
		
		//simpan data ke database
		bukuService.saveBuku(buku);
		
		return "redirect:/buku";
	}
	
	@GetMapping("/editBuku/{id}")
	public String editBuku(@PathVariable(value = "id") long id, Model model) {
		
		//mengambil anggota dari servis
		Buku buku = bukuService.getBukuById(id);
		
		//isi form edit dengan data sebelumnya
		model.addAttribute("buku", buku);
		
		return "edit_buku";	
	}
	
	@GetMapping("buku/deleteBuku/{id}")
	public String deleteBuku(@PathVariable(value = "id") long id) {
		
		// hapus data
		this.bukuService.deleteBukuById(id);
		
		return "redirect:/buku";
	}
	
}
