package com.xinhuanet.common;

import java.util.concurrent.ConcurrentHashMap;

public class Constant {

    public static ConcurrentHashMap<Integer, String> siteWebDomainMap = new ConcurrentHashMap<Integer, String>();

    public static ConcurrentHashMap<String, Integer> languageMap = new ConcurrentHashMap<String, Integer>();
}
