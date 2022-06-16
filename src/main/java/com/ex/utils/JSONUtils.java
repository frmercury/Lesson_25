package com.ex.utils;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONUtils {

    public static String getJSONFileAsString (String filePath) throws IOException{
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

   public static JSONObject getJSONFileAsObj (String filePath) throws IOException{
        return new JSONObject(getJSONFileAsString(filePath));
    }

}
