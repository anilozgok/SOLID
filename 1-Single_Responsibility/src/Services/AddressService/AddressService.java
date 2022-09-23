package Services.AddressService;

import Entity.Address.Address;

public class AddressService {

    private Address address;

    public AddressService(Address address) {
        this.address = address;
    }


    public void changeAddress(Address newAddress){
        //change address logic
        this.address=newAddress;
        System.out.println("Address changed.");
    }

}
