package org.jboss.pnc.okra.entity.okr;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * A key result represents a result and belongs to an OKR
 *
 * TODO: add a check-in frequency?
 */
@Entity
public class KeyResult extends PanacheEntity {

    /** name of key result */
    public String name;

    public String description;

    /** many key results belongs to an okr */
    @ManyToOne
    public Okr okr;

    public double initial;
    public double target;

    public String unit;

    // TODO
    public double calculateProgressPercentage() {
        // get the latest check-in for the key result. if none exists, return 0
        return 0;

        // then calculate progress based on the initial, target, and latest check in value
        // return (latest - initial) / (target - initial) * 100;
    }
}
