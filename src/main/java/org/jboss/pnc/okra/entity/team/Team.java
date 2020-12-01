package org.jboss.pnc.okra.entity.team;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * A team is the top-level entry to okra. A team contains multiple quarters. For each quarter, OKRs can be defined.
 */
@Entity
public class Team extends PanacheEntity {

    /** Name of team */
    @Column(unique = true)
    @NotBlank
    public String name;

    /** description of team */
    @Lob
    public String description;

    /** date created */
    @NotNull
    public Date created;

    /** date last modified */
    @NotNull
    public Date lastModified;
}
