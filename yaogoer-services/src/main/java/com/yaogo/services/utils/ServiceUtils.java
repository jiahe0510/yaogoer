package com.yaogo.services.utils;

import com.yaogo.model.jpa.Message;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ServiceUtils {

    public static String generateMsgHashValue(Message message) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        String originalString =
                message.getUserId().toString() +
                message.getMsgDate().toString();
        byte[] encodedhash = digest.digest(
                originalString.getBytes(StandardCharsets.UTF_8)
        );

        StringBuffer hexString = new StringBuffer();
        for (byte b: encodedhash)  {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

}
