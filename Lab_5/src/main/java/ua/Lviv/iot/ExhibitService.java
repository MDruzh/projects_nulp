package ua.Lviv.iot;

import ua.Lviv.iot.persistance.dao.ExhibitDao;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Path("/exhibit")
public class ExhibitService implements Serializable {
    private static Map<Integer, Exhibit> exhibitMap = new HashMap<>();

    @Inject
    private ExhibitDao dao;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public final Exhibit getExhibit(@PathParam("id") Integer id){
        return exhibitMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createExhibit(Exhibit exhibit){
        exhibitMap.put(exhibit.getId(),exhibit);
        return Response.status(200).entity("ua.Lviv.iot.Exhibit").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteExhibit(@PathParam("id") Integer id){
        exhibitMap.remove(id);
        return Response.status(200).entity("ua.Lviv.iot.Exhibit").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateExhibit(Exhibit exhibit){
        exhibitMap.put(exhibit.getId(), exhibit);
        return Response.status(200).entity("ua.Lviv.iot.Exhibit").build();
    }



}
