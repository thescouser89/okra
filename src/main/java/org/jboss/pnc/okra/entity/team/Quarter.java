package org.jboss.pnc.okra.entity.team;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Quarters belong to a team. Each quarter holds multiple OKRs
 */
@Entity
public class Quarter extends PanacheEntity {

    /* Year of quarter */
    public int year;

    /** name of quarter */
    public String name;

    @ManyToOne
    public Team team;

    /** date created */
    public Date created;

    /** date last modified */
    public Date lastModified;

    /** start of quarter */
    public Date startPeriod;

    /** end of quarter */
    public Date endPeriod;
}
