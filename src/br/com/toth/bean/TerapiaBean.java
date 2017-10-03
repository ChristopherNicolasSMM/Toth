package br.com.toth.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import consoleToth.dao.*;
import consoleToth.model.*;

@ManagedBean
@ViewScoped
public class TerapiaBean {
	

	// ELEMENTOS
	private Terapia terapia = new Terapia();
	
	//METODOS
	public void salvar(Terapia _terapia) {
		TerapiaDao dao = new TerapiaDao();
		dao.salva(_terapia);
		
	}
	
    public List<Terapia> buscar() {
        TerapiaDao dao = new TerapiaDao();       
        return dao.buscar(new Terapia(), 0);
    }
    
}
