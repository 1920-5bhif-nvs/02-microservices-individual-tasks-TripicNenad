package at.htl.vehicleShop.business;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import at.htl.vehicleShop.model.Sedan;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


import java.util.List;


@Path("/sedan")
@RegisterRestClient
public interface SedanService {

    @GET
    @Produces("application/json")
    List<Sedan> getSedan();

}
