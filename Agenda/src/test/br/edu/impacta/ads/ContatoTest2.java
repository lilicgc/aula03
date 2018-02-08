package test.br.edu.impacta.ads;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.impacta.ads.Contato;
import br.edu.impacta.ads.ContatoDaoArquivo;

public class ContatoTest2 {

ContatoDaoArquivo cdao;
Contato contato;

@Before
public void setData(){
cdao = new ContatoDaoArquivo("contatos.txt");
contato = new Contato("Lilian", "123");
}

@Test
public void testTest() {
cdao.inserir(contato);
assertTrue("O contato nao foi adicionado.", cdao.existe(contato));
}
@Test
public void testTestBusca() {
List<Contato> listaContatos = cdao.buscar("");
Assert.assertFalse("Nome não localizado", listaContatos.size()>0);
}
}