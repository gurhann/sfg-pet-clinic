package com.gurhan.sfgpetclinic.service;

import com.gurhan.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastname(String lastname);
}
