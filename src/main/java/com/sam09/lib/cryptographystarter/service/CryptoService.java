package com.sam09.lib.cryptographystarter.service;

import java.io.UnsupportedEncodingException;

public interface CryptoService {
    String encrypt(byte[] byteArray) throws UnsupportedEncodingException;
    byte[] decrypt(String str);
}
