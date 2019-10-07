package at.htl.vehicleShop.rest;

import at.htl.vehicleShop.business.PickUpService;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class PickUpResource {
    @Inject
    @RestClient
    PickUpService pickUpService;

    //Count how many pickups there are
    @GET
    @Path("/pickup/amount")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "getNumberOfPickUps")
    @Timed(name = "timer", description = "This is how long it takes to perform this task: ", unit = MetricUnits.MILLISECONDS)
    public int getNumberOfPickUps() {
        return pickUpService.getPickUp().size();
    }

    //average maxLoads of pickups
    @GET
    @Path("/pickup/avg/maxload")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "getAvgMaxLoads")
    public double getAvgMaxLoads() {
        return pickUpService.getPickUp().stream().mapToDouble(p -> p.getMaxLoad()).average().getAsDouble();
    }
}
