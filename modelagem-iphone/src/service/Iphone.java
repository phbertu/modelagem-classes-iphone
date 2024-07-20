package service;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void tocar() {
		System.out.print("Música tocando...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");
		
	}

	@Override
	public void passarMusica() {
		System.out.println("Próxima música");
		
	}

	@Override
	public void voltarMusica() {
		System.out.println("Música anterior");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando...");
		
	}

	@Override
	public void atenderChamada() {
		System.out.println("Chamada atendida");
		
	}

	@Override
	public void recusarChamada() {
		System.out.println("Chamada recusada");
		
	}

	@Override
	public void adicionarContato() {
		System.out.println("Novo contato adicionado");
		
	}

	@Override
	public void acessarPagina() {
		System.out.println("Home Page acessada");
		
	}

	@Override
	public void voltar() {
		System.out.println("Página anterior");
		
	}

	@Override
	public void iniciarNovaPagina() {
		System.out.println("Nova página acessada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");
		
	}

}
