package com.pi.CitoyenWebService;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Path("/service")
public class WebService {

    @Autowired
    private CitoyenRepositry citoyenRepositry;

    @GET
    @Path("/citoyens/{cin}")
    @Produces(MediaType.APPLICATION_JSON)
    public Citoyen getCitoyenByCin(@PathParam("cin") String c){
        return citoyenRepositry.findByCin(c);
    }
    @POST
    @Path("/citoyens")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Citoyen addCitoyen(Citoyen citoyen){
        return citoyenRepositry.save(citoyen);
    }

    @GET
    @Path("/citoyens")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Citoyen> getbyPrenom(@QueryParam("prenom") String prenom){
        return citoyenRepositry.findByPrenom(prenom);
    }
}
