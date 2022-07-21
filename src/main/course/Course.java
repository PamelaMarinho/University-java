package main.course;

import main.curriculumGrid.CurriculumGrid;
import main.field.Field;

public class Course {

    private Integer id;
    private String name;
    private Integer durationHours;
    private Field field;
    private CurriculumGrid curriculumGrid;

    public Course(Integer id, String name, Integer durationHours, Field field, CurriculumGrid curriculumGrid) {
        this.id = id;
        this.name = name;
        this.durationHours = durationHours;
        this.field = field;
        this.curriculumGrid = curriculumGrid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(Integer durationHours) {
        this.durationHours = durationHours;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public CurriculumGrid getCurriculumGrid() {
        return curriculumGrid;
    }

    public void setCurriculumGrid(CurriculumGrid curriculumGrid) {
        this.curriculumGrid = curriculumGrid;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", durationMinutes=" + durationHours +
                ", field='" + field + '\'' +
                ", curriculum grid' " + getCurriculumGrid() + '\'' +
                '}';
    }
}