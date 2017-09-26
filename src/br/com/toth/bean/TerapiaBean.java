package br.com.toth.bean;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.toth.dao.TerapiaDao;
import br.com.toth.model.Terapia;

@ManagedBean
public class TerapiaBean {
	

	private Terapia terapia = new Terapia();
	private List<Terapia> lista = new ArrayList<Terapia>();

	public Terapia getTerapia() {
		return terapia;
	}
	
	
    public List<Terapia> buscar() {
        
        Terapia _terapia = new Terapia();
        TerapiaDao dao = new TerapiaDao();       
        return lista = dao.buscar(_terapia, 0);
    }

}
