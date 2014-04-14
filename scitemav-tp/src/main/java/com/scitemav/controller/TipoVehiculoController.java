package com.scitemav.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scitemav.bean.TipoVehiculoBean;
import com.scitemav.service.TipoVehiculoService;

@Controller
public class TipoVehiculoController {

	@Autowired
	TipoVehiculoService tipoVehiculoService;
	
	@RequestMapping(value="registroTipoVehiculo", method = RequestMethod.POST)
	public String registroTipoVehiculo(@ModelAttribute("tipovehiculobean") TipoVehiculoBean tipvb, Model model, HttpServletRequest req){
		String path="registrarCarroceria";
		if(tipoVehiculoService.registro(tipvb)){
			model.addAttribute("msgOk", "Se ha registrado correctamente");
		}
		else{
			model.addAttribute("msg", "Se ha producido un error al registrarse");
		}
		return path;
	}
}
