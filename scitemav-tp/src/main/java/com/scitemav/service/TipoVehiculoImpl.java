package com.scitemav.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scitemav.bean.TipoVehiculoBean;
import com.scitemav.model.TipoVehiculo;

@Service
public class TipoVehiculoImpl implements TipoVehiculoService {

	@PersistenceContext
	EntityManager em;

	@Transactional
	public boolean registro(TipoVehiculoBean tipBean) {

		boolean resultado = false;

		TipoVehiculo tipovehiculo = new TipoVehiculo();

		try {
			if(!(tipBean.getNombre().isEmpty())){
				tipovehiculo.setNombre(tipBean.getNombre());
				em.persist(tipovehiculo);
				resultado = true;
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			resultado = false;
		}
		return resultado;
	}

}
