package com.rdias.service;

import com.rdias.dao.ContratoDao;
import com.rdias.dao.impl.ContratoDaoImpl;
import com.rdias.dao.mocks.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        // Inicialização do DAO e do Service usando um mock
        ContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoServiceImpl(dao);

        // Execução do método a ser testado
        String retorno = service.salvar();

        // Verificação do resultado esperado
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        // Inicialização do DAO e do Service usando a implementação real
        ContratoDao dao = new ContratoDaoImpl();
        ContratoService service = new ContratoServiceImpl(dao);

        // Execução do método a ser testado, esperando uma exceção
        String retorno = service.salvar();
    }

    @Test
    public void buscarTest(){
        ContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest() {
        ContratoDao dao = new ContratoDaoImpl();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.buscar();
    }

    @Test
    public void excluirTest(){
        ContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest() {
        ContratoDao dao = new ContratoDaoImpl();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.excluir();
    }

    @Test
    public void atualizarTest(){
        ContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest() {
        ContratoDao dao = new ContratoDaoImpl();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.atualizar();
    }
}
