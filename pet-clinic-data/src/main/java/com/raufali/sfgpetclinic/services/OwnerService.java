package com.raufali.sfgpetclinic.services;

import com.raufali.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
