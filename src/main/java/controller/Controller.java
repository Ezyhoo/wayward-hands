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

        put("/raise", (request, response) -> {
            return "";
        });

        put("/call", (request, response) -> {
            return "";
        });

        put("/fold", (request, response) -> {
            return "";
        });

        put("/allIn", (request, response) -> {
            return "";
        });

        get("/updatePlayers", (request, response) -> {
            return "";
        });
    }
}
