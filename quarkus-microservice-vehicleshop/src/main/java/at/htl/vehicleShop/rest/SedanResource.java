package at.htl.vehicleShop.rest;

import at.htl.vehicleShop.business.SedanService;
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
public class SedanResource {
    @Inject
    @RestClient
    SedanService sedanService;

    //Count how many sedans there are
    @GET
    @Path("/sedan/amount")
    @Produces(MediaType.TEXT_PLAIN)
    @Counted(name = "getNumberOfSedans")
    @Timed(name = "timer", description = "This is how long it takes to perform this task: ", unit = MetricUnits.MILLISECONDS)
    public int getNumberOfSedans(){return sedanService.getSedan().size();}



}
