package com.tdtu.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "factory_location")
public class Factory extends BaseEntity{
    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;
}
