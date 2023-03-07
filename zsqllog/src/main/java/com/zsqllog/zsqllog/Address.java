package com.zsqllog.zsqllog;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    int id;

    String name;

}
