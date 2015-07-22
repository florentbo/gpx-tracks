package be.fbonamis.gpx;

import javax.inject.Inject;
import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

@Produces({APPLICATION_XML, APPLICATION_JSON})
@Path("tracks/")
public class TrackEndpoint {

    @Inject
    private TrackService trackService;

    @POST
    public void post(@QueryParam("name") String name) {
        this.trackService.create(name);
    }

    @GET
    @Path("/{id}")
    public Track get(@PathParam("id") Long id) {
        return this.trackService.find(id);
    }
}
