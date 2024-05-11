package com.rdias.service;

import com.rdias.dao.ContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoServiceImpl implements ContratoService {

    private ContratoDao contratoDao;

    public ContratoServiceImpl(ContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Sucesso";
    }
}
