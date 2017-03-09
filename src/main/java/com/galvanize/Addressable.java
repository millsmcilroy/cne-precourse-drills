package com.galvanize;

import java.util.List;

/**
 * Created by mills on 3/9/17.
 */
public interface Addressable {
    List<Address> getAddresses();
    void addAddress(Address address);
}
