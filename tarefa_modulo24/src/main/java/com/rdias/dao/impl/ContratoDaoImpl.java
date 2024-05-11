package com.rdias.dao.impl;

import com.rdias.dao.ContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoDaoImpl implements ContratoDao {

    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem um banco de dados");
    }

    @Override
    public String buscar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
    }

    @Override
    public String excluir() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
    }

    @Override
    public String atualizar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
    }
}
