package com.rp.pattern.facadeExample.demo;

import com.rp.pattern.facadeExample.EncryptorFacade;

public class ClientDemo {
    public static void main(String[] args) {
        String myText = "Encrypt this text";
        EncryptorFacade e= new EncryptorFacade();
        System.out.println("MD5 encryption");
        System.out.println(e.encrypt("MD5", myText));
        System.out.println("SHA encryption");
        System.out.println(e.encrypt("SHA", myText));
        System.out.println("SHA256 encryption");
        System.out.println(e.encrypt("SHA256", myText));
    }
}
