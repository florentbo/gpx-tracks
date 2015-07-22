package be.fbonamis.gpx;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/health")
public class HealthResource {

    static final String HEALTH_RESPONSE = "The server is running";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String isHealthy() {
        return HEALTH_RESPONSE;
    }
}
