package org.jboss.pnc.okra.entity.okr;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.jboss.pnc.okra.entity.team.Quarter;

import java.util.Date;

/**
 * An OKR represents an objective. It holds many key results. It has a start and end date. Many Okrs belong to a quarter
 */
// @Cacheable
@Entity
public class Okr extends PanacheEntity {

    /** name of okr */
    public String name;

    /** description */
    public String description;

    /** Owner of that OKR */
    public String owner;

    /** An okr belongs to a quarter */
    @ManyToOne
    public Quarter quarter;
}
