package br.com.adrianobeserra.restapi.services;

import java.util.List;

import br.com.adrianobeserra.restapi.documents.Mobile;

public interface MobileService {

	List<Mobile> listAll();
	Mobile findByCode(String code);
	Mobile insert(Mobile mobile);
	Mobile update(Mobile mobile);
	void remove(String code);
	
}
