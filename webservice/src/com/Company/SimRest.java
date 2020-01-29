package com.Company;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
@Path("/save")
public class Sim{
    @Path("/student")
    @GET
    @Produces("text/plain")
    public String sum (@QueryParam("name") String x ,@QueryParam("vahed") String y)
    {
        System.out.println("save executed in server");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",x);
        jsonObject.put("vahed",y);


        return "name:"+x+"\n"+"vahed ha:"+y;
    }
}