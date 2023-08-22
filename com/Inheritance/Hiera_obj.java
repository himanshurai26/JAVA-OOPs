package com.Inheritance;

public class Hiera_obj {
    public static void main(String[] args) {
        A_Hierarchical re = new A_Hierarchical();
        re.display();
        BB ref  = new BB();
        ref.show();
        ref.display();

        CC r = new CC();
        r.ageDisplay();
        r.display();
        ref.show();

    }
}
