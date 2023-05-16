package controller;
import model.Morador;

public interface IControllerMorador {
	public void Cadastro(Morador m) throws Exception;
	public void Consulta(Morador m, String nome) throws Exception;
	public void Deleta(Morador m, String nome) throws Exception;
	public void ListaAndar(int numAp) throws Exception;
}
