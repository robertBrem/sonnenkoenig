package ch.adesso.sonnenkoenig.ask.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ask")
public class AskResource {

    @GET
    public String ask() {
        return "no";
    }

}
