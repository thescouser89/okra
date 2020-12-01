package org.jboss.pnc.okra.entity.okr;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

/**
 * Key result value check-ins. Each check-in belongs to a key result
 */
@Entity
public class KeyResultCheckIn extends PanacheEntity {

    @ManyToOne
    public KeyResult keyResult;

    /** value check-in */
    public double value;

    /** Description of why the change in value happened */
    @Lob
    public String description;

    @Min(value = 0, message = "Confidence percentage must not be less than 0%")
    @Max(value = 100, message = "Confidence percentage must not be greater than 100%")
    public int confidencePercentage;

    /** Date of check-in */
    // Should be only 1 entry per day.
    public Date date;

}
