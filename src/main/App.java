package main;

import main.com.ant.sanju.Resident;
import main.com.ant.sanju.ResidentService;

/**
 * Created by Lenovo on 17/09/2018.
 */
public class App {
    public static void main(String[] args) {
        ResidentService service = new ResidentService();
        System.out.println(service.getResident().toString());
    }
}

