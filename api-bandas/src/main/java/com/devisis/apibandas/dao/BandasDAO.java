package com.devisis.apibandas.dao;

import java.util.List;

import com.devisis.apibandas.entity.Bandas;

public interface BandasDAO {

	public List<Bandas> getBandas();

	public void saveBandas(Bandas theBanda);

	public Bandas getBandas(int TheId);

	public void deleteBandas(int theId);

}
