package br.com.adrianobeserra.restapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.adrianobeserra.restapi.documents.Mobile;

public interface MobileRepository extends MongoRepository<Mobile, String> {

}
