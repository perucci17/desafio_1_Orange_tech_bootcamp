package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo  {
	private String titulo;
	private String descricao;
	private LocalDate data;
	

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}

	
	
	
	
	
	public Mentoria() {
		
	}
		
	

	
	
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
		
		
	}






	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + ", calcularXp()="
				+ calcularXp() + ", getData()=" + getData() + ", getTitulo()=" + getTitulo() + ", getDescricao()="
				+ getDescricao() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}






	






	}

	







	
	
	
	
	
	
	


