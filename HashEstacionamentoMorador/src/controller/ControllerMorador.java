package controller;
import br.ewefernandes.lista.listaobject.*;
import model.Morador;

public class ControllerMorador implements IControllerMorador {
	
	Lista[] vetAptos;
	
	public ControllerMorador () {
		vetAptos = new Lista[10];
		for (int i = 0; i < 10; i ++) {
			vetAptos[i] = new Lista();
		}
	}

	@Override
	public void Cadastro(Morador m) throws Exception {
		
		int hash = m.hashCode();
		Lista l = vetAptos[hash];
		if (l.isEmpty()) {
			l.addFirst(m);
		} else {
			l.addLast(m);
		}
		
	}

	@Override
	public void Consulta(Morador m, String nome) throws Exception {
		int hash = m.hashCode();
		Lista l = vetAptos[hash];
		int tam = l.size();
		
		for (int i = 0; i < tam; i++) {
			Morador morador = (Morador) l.get(i);
			if (morador.getNome().equals(m.getNome())) {
				System.out.println("Morador: " +m.nome+ " - Apto: " +m.numApto);
			}
		}
		
	}

	@Override
	public void Deleta(Morador m, String nome) throws Exception {
		int hash = m.hashCode();
		Lista l = vetAptos[hash];
		int tam = l.size();
		
		for (int i = 0; i < tam; i ++) {
			Morador morador = (Morador) l.get(i);
			if (morador.getNome().equals(m.getNome())) {
				l.remove(i);
				break;
			}
		}
	}

	@Override
	public void ListaAndar(int andar) throws Exception {
		
	}
	
	private int hashCode(int numApto) {
		int pos = numApto % 10;
		return pos;
	}
	
}
