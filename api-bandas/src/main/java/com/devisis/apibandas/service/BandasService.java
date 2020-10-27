package com.devisis.apibandas.service;

import java.util.List;

import com.devisis.apibandas.entity.Bandas;

public interface BandasService {
	
	public List < Bandas > getBandas();

    public void saveBandas(Bandas theBanda);

    public Bandas getBandas(int theId);

    public void deleteBandas(int theId);


}
