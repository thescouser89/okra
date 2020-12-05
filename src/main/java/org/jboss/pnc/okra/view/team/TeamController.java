package org.jboss.pnc.okra.view.team;

import org.jboss.pnc.okra.entity.team.Team;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import java.io.Serializable;
import java.util.List;

@RequestScoped
@Named
public class TeamController implements Serializable {

    public List<Team> list() {
        return Team.listAll();
    }
}
