package at.htl.vehicleShop.rest;

import at.htl.vehicleShop.business.RoadsterService;
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
public class RoadsterResource {
    @Inject
    @RestClient
    RoadsterService roadsterService;

    //Count how many roadster there are
    @GET
    @Path("/roadster/amount")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "getNumberOfRoadsters")
    @Timed(name = "timer", description = "This is how long it takes to perform this task: ", unit = MetricUnits.MILLISECONDS)
    public int getNumberOfRoadster() {
        return roadsterService.getRoadster().size();
    }

    //average top_speed of roadsters
    @GET
    @Path("/roadster/avg/topSpeed")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "getAvgTopSpeed")
    public double getAvgTopSpeed() {
        return roadsterService.getRoadster().stream().mapToDouble(r -> r.getTop_speed()).average().getAsDouble();
    }
}
