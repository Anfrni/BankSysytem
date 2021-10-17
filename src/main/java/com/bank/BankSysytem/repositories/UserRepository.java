package com.bank.BankSysytem.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bank.BankSystem.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
