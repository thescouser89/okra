package org.jboss.pnc.okra.rest.team;

import io.quarkus.panache.common.Sort;
import org.jboss.pnc.okra.entity.team.Team;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/v1/team")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TeamRest {

    @GET
    public List<Team> list() {
        return Team.listAll(Sort.ascending("name"));
    }

    //@GET("{id}/quarters")
}
