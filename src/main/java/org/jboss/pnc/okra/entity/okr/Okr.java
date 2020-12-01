package org.jboss.pnc.okra.entity.okr;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.jboss.pnc.okra.entity.team.Quarter;

/**
 * An OKR represents an objective. It holds many key results. It has a start and end date. Many Okrs belong to a quarter
 */
// @Cacheable
@Entity
public class Okr extends PanacheEntity {

    /** name of okr */
    @NotBlank
    public String name;

    /** description */
    @Lob
    public String description;

    /** Owner of that OKR */
    @NotNull
    public String owner;

    /** An okr belongs to a quarter */
    @ManyToOne
    public Quarter quarter;
}
