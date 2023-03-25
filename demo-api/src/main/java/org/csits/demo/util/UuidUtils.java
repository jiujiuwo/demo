package org.csits.demo.util;

import java.util.UUID;

public class UuidUtils {

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
