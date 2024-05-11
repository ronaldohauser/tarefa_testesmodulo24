package com.rdias.dao.mocks;

import com.rdias.dao.ContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoDaoMock implements ContratoDao {

    @Override
    public String salvar() {
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Sucesso";
    }

    @Override
    public String excluir() {
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        return "Sucesso";
    }
}
