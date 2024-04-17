package org.tufuteca.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
public class Training {

    private LocalDate trainingDate;
    private LocalTime trainingDuration;
    private TrainingType trainingType;
    private String additionally;
}
