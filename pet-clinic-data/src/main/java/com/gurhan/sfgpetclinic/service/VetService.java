package com.gurhan.sfgpetclinic.service;

import com.gurhan.sfgpetclinic.model.Pet;
import com.gurhan.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Pet owner);

    Set<Vet> findAll();
}
