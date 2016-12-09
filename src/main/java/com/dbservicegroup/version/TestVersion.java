package com.dbservicegroup.version;

import java.util.Properties;

/**
 * Created by Anton on 08.12.2016.
 * Test class with main function
 */
public class TestVersion {
    public static void main(String[] args) {
        Package v = TestVersion.class.getPackage();
        if (v != null) {
            String version = v.getImplementationVersion();
            System.out.println("App version: " + version + "\n");
        } else {
            System.out.println("No version information\n");
        }

        Properties p = System.getProperties();
        System.out.println("JRE version: " + p.getProperty("java.version") + "\n");
        p.list(System.out);
    }

}