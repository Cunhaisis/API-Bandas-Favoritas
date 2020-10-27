package com.devisis.apibandas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devisis.apibandas.dao.BandasDAO;
import com.devisis.apibandas.entity.Bandas;

@Service
public class BandasServiceImpl implements BandasService {

    @Autowired
    private BandasDAO bandasDAO;

    @Override
    @Transactional
    public List < Bandas > getBandas() {
        return bandasDAO.getBandas();
    }

    @Override
    @Transactional
    public void saveBandas(Bandas theBanda) {
        bandasDAO.saveBandas(theBanda);
    }

    @Override
    @Transactional
    public Bandas getBandas(int theId) {
        return bandasDAO.getBandas(theId);
    }

    @Override
    @Transactional
    public void deleteBandas(int theId) {
        bandasDAO.deleteBandas(theId);
    }
}
