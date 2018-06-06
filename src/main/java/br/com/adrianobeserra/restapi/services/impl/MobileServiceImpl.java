package br.com.adrianobeserra.restapi.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.adrianobeserra.restapi.documents.Mobile;
import br.com.adrianobeserra.restapi.repositories.MobileRepository;
import br.com.adrianobeserra.restapi.services.MobileService;

@Service
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	private MobileRepository mobileRepository;

	@Override
	public List<Mobile> listAll() {
		return this.mobileRepository.findAll();
	}

	@Override
	public Mobile findByCode(String code) {
		return this.mobileRepository.findById(code).get();
	}

	@Override
	public Mobile insert(Mobile mobile) {
		return this.mobileRepository.save(mobile);
	}

	@Override
	public Mobile update(Mobile mobile) {
		return this.mobileRepository.save(mobile);
	}

	@Override
	public void remove(String code) {
		this.mobileRepository.deleteById(code);
	}
}