package org.jboss.pnc.okra.entity.team;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Quarters belong to a team. Each quarter holds multiple OKRs
 */
@Entity
public class Quarter extends PanacheEntity {

    /* Year of quarter */
    @Min(value = 1, message = "Please specify a valid quarter year")
    public int year;

    /** name of quarter */
    @NotNull
    public String name;

    @ManyToOne
    public Team team;

    /** date created */
    @NotNull
    public Date created;

    /** date last modified */
    @NotNull
    public Date lastModified;

    /** start of quarter */
    @NotNull
    public Date startPeriod;

    /** end of quarter */
    @NotNull
    public Date endPeriod;
}
