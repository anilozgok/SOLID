import Services.LoginService.LoginService;
import Services.AddressService.AddressService;
import Entity.User.User;
import Entity.Address.Address;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //Address
        Address address = new Address();
        address.setCountry("Turkey");
        address.setCity("Istanbul");
        address.setStreet("Emin Ali Pasa");
        address.setApartment("Beyazkosk");
        address.setFlat_Number(5);

        //User
        User user = new User();
        user.setName("Anıl Can");
        user.setSurname("Özgök");
        user.setUsername("anilozgok");
        user.setAddress(address);
        user.setE_mail("anil@mail.com");
        user.setDate_of_birth(new Date("25/05/2001"));
        //implement password service for encryption
        user.setPassword("password");

        //Login Service
        LoginService loginService = new LoginService(user);
        if (loginService.Login("anilozgok", "password")) {

            //Address Service
            AddressService addressService = new AddressService(address);
            addressService.changeAddress(new Address());

            loginService.Logout("anilozgok");
        }



    }
}