package org.jboss.pnc.okra.rest.team;

import io.quarkus.panache.common.Sort;
import org.jboss.pnc.okra.entity.team.Team;

import javax.transaction.Transactional;
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
    @Transactional
    public List<Team> list() {
        Team team = new Team();
        team.name = "haha";
        team.persist();
        return Team.listAll(Sort.ascending("name"));
    }

}
