package lzwComp.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/")
public class restService {
    @GET // This annotation indicates GET request
    @Path("/hello")
    public Response hello() {
        //return Response.status(200).entity("index.html").build();
        //return Response.created(URI.create("index.html")).build();
        return  Response.temporaryRedirect(URI.create("C:\\Users\\Psikolojik\\Desktop\\Intern\\Project\\lzwComp\\src\\main\\webapp\\index.jsp")).build();

    }




}