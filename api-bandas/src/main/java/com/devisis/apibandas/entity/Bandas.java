package com.devisis.apibandas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bandas")
public class Bandas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "vocalista")
	private String vocalista;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "musicaFav")
	private String musicaFav;
	
	@Column(name = "albumFav")
	private String albumFav;
	
	public Bandas() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVocalista() {
		return vocalista;
	}

	public void setVocalista(String vocalista) {
		this.vocalista = vocalista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getMusicaFav() {
		return musicaFav;
	}

	public void setMusicaFav(String musicaFav) {
		this.musicaFav = musicaFav;
	}

	public String getAlbumFav() {
		return albumFav;
	}

	public void setAlbumFav(String albumFav) {
		this.albumFav = albumFav;
	}

	@Override
	public String toString() {
		return "Bandas [id=" + id + ", nome=" + nome + ", vocalista=" + vocalista + ", genero=" + genero
				+ ", musicaFav=" + musicaFav + ", albumFav=" + albumFav + "]";
	}
	
	
	
	
	

}
