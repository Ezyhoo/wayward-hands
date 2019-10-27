package controller;

import com.google.gson.Gson;
import model.DispatchAdapter;

import static spark.Spark.*;

public class Controller {

    public static void main(String[] args){
        staticFiles.location("/public");

        Gson gson = new Gson();
        DispatchAdapter dis = new DispatchAdapter();

        get("/setUp", (request, response) -> {
            return gson.toJson(dis.getSetUpInfo());
        });

        get("/raise", (request, response) -> {
            return "";
        });

        get("/call", (request, response) -> {
            return "";
        });

        get("/fold", (request, response) -> {
            return "";
        });

        get("/allIn", (request, response) -> {
            return "";
        });

        get("/updatePlayers", (request, response) -> {
            return "";
        });
    }
}
