package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mills on 3/9/17.
 */
public class Business implements Addressable {
    String name;
    ArrayList<Address> addresses;

    public Business(String name) {
        this.name = name;
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
