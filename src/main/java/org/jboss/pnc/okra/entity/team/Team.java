package org.jboss.pnc.okra.entity.team;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * A team is the top-level entry to okra. A team contains multiple quarters. For each quarter, OKRs can be defined.
 */
@Entity
public class Team extends PanacheEntity {

    /** Name of team */
    @Column(unique = true)
    public String name;

    public String description;

    /** date created */
    public Date created;

    /** date last modified */
    public Date lastModified;
}
