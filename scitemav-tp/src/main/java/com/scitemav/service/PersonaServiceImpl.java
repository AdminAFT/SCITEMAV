package com.scitemav.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scitemav.bean.PersonaBean;
import com.scitemav.model.Persona;
import com.scitemav.model.Usuario;

@Service
public class PersonaServiceImpl implements PersonaService{

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public PersonaBean getInformationPerfil(HttpSession session) {
		PersonaBean personabean = new PersonaBean();
		Persona persona = new Persona();		
		Query q1 = em.createQuery("SELECT p FROM Persona p JOIN p.perUsuario u WHERE u.idUsuario = :idUsuario AND u.activo =:activo");
		q1.setParameter("idUsuario", Integer.parseInt(session.getAttribute("idUsuario").toString()));
		q1.setParameter("activo", true);
		persona = (Persona) q1.getSingleResult();
		personabean.setNombre(persona.getNombre());
		personabean.setApellidoPaterno(persona.getApellidoPaterno());
		personabean.setApellidoMaterno(persona.getApellidoMaterno());
		personabean.setTelefono(persona.getTelefono());
		personabean.setEmail(persona.getPerUsuario().getEmail());
		return personabean;
	}

	@Transactional
	public boolean editInformacionPerfil(PersonaBean perbean,HttpSession session) {
		boolean resultado = false;
		Persona personaX = new Persona();
		try{
			Query q1 = em.createQuery("SELECT p FROM Persona p JOIN p.perUsuario u WHERE u.idUsuario = :idUsuario AND u.activo =:activo");
			q1.setParameter("idUsuario", Integer.parseInt(session.getAttribute("idUsuario").toString()));
			q1.setParameter("activo", true);
			personaX = (Persona) q1.getSingleResult();			
			Persona profileY = em.merge(personaX);
			profileY.setNombre(perbean.getNombre());
			profileY.setApellidoPaterno(perbean.getApellidoPaterno());
			profileY.setApellidoMaterno(perbean.getApellidoMaterno());
			profileY.setTelefono(perbean.getTelefono());
			Usuario usuarioY = em.merge(personaX.getPerUsuario());
			usuarioY.setEmail(perbean.getEmail());		
			resultado = true;
		}catch(IllegalArgumentException e){
			System.out.println(e);
			resultado = false;
		}
		
		return resultado;
	}

}
