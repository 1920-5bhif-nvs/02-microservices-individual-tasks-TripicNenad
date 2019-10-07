package at.htl.vehicleShop.business;

import at.htl.vehicleShop.model.Roadster;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/roadster")
@RegisterRestClient
public interface RoadsterService {

    @GET
    @Produces("application/json")
    List<Roadster> getRoadster();
}
