package at.htl.vehicleShop.business;


import at.htl.vehicleShop.model.PickUp;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/pickup")
@RegisterRestClient
public interface PickUpService {
    @GET
    @Produces("application/json")
    List<PickUp> getPickUp();
}
