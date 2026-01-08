package src;

import java.util.*;

public class CollectionMainApp {
    static void tugas1(){
        List<String> users = new ArrayList<>();
        users.add("Badru");
        users.add("Kamal");
        users.add("Dude");

        for (String dataUser : users){
            System.out.println(dataUser);
        }
    }

    static void tugas2(){
        Set<String> roles = new HashSet<>();
        roles.add("Admin");
        roles.add("Customer");
        roles.add("Guest");

        for (String dataRole : roles){
            System.out.println(dataRole);
        }
    }

    static void tugas3(){
        Map<String, Object> dataUser = new HashMap<>();
        dataUser.put("userName ", " Badru");
        dataUser.put("email ", " badrukamal327@gmail.com");
        dataUser.put("saldo ",  1000.000);

        for (Map.Entry<String, Object> entry : dataUser.entrySet()){
            System.out.println(entry);
        }
    }



    public static void main(String[] args) {
        tugas1();
        tugas2();
        tugas3();
    }
}
