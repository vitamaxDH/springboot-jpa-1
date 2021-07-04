package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zicode;

    protected Address() {}

    public Address(String city, String street, String zicode) {
        this.city = city;
        this.street = street;
        this.zicode = zicode;
    }
}
