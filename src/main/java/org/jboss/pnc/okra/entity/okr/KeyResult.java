package org.jboss.pnc.okra.entity.okr;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * A key result represents a result and belongs to an OKR
 *
 * TODO: add a check-in frequency?
 */
@Entity
public class KeyResult extends PanacheEntity {

    /** name of key result */
    @NotBlank
    public String name;

    /** description of key result */
    @Lob
    public String description;

    /** many key results belongs to an okr */
    @ManyToOne
    public Okr okr;

    public double initial;
    public double target;

    @NotBlank
    public String unit;

    // TODO
    public double calculateProgressPercentage() {
        // get the latest check-in for the key result. if none exists, return 0
        return 0;

        // then calculate progress based on the initial, target, and latest check in value
        // return (latest - initial) / (target - initial) * 100;
    }
}
