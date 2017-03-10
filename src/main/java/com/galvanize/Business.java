package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mills on 3/9/17.
 */
public class Business implements Addressable {
    private String name;
    private List<Address> addresses;

    public Business(String name) {
        this.name = name;
        addresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void addAddress(Address address) {
        addresses.add(address);
    }
}
