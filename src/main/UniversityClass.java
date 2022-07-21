package main;

import main.course.Course;
import main.curriculumGrid.CurriculumGrid;
import main.discipline.Discipline;
import main.discipline.IdDiscipline;
import main.field.Field;

import java.util.HashSet;
import java.util.Set;

public class UniversityClass {
    public static void main(String[] args) {

        Discipline english = new Discipline(IdDiscipline.ENGLISH, "English");
        Discipline physiology = new Discipline(IdDiscipline.PHYSIOLOGY, "physiology");
        Discipline anatomy = new Discipline(IdDiscipline.ANATOMY, "anatomy");

        Set<Discipline> curriculumGrid = new HashSet<>();
        curriculumGrid.add(english);
        curriculumGrid.add(physiology);
        curriculumGrid.add(anatomy);

        CurriculumGrid grid = new CurriculumGrid(curriculumGrid);

        Field field= Field.HEALTH;

        Course course = new Course(1, "Fisioterapia", 320, field,grid);
        System.out.println(course);
    }
}
