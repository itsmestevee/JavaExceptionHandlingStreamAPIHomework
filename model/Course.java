package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private int id;
    private String title;
    private String [] instructorNames;
    private String [] requirements;
    private LocalDate startDate;
}
