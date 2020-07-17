package lzwComp.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class restService {
    @GET // This annotation indicates GET request
    @Path("/hello")
    public Response hello() {
        return Response.status(200).entity("hello").build();
    }
}