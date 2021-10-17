package com.bank.BankSysytem.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bank.BankSystem.models.Credentials;

public interface CredentialsRepository extends CrudRepository<Credentials, Integer> {

}
