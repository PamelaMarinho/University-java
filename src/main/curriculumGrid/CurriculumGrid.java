package main.curriculumGrid;

import main.discipline.Discipline;
import java.util.Set;

public class CurriculumGrid {

    private Set<Discipline> curriculumGrid;

    public CurriculumGrid(Set<Discipline> curriculumGrid){
        this.curriculumGrid = curriculumGrid;
    }

    public Set<Discipline> getCurriculumGrid() {
        return curriculumGrid;
    }

    @Override
    public String toString() {
        return "curriculumGrid=" + curriculumGrid
                ;
    }
}
