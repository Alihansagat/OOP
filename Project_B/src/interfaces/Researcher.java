package interfaces;

import models.ResearchPaper;
import models.ResearchProject;
import java.util.Comparator;
import java.util.List;

public interface Researcher {
    int calculateHIndex();
    void printPapers(Comparator<ResearchPaper> c);
    List<ResearchPaper> getResearchPapers();
    void addResearchPaper(ResearchPaper paper);
    List<ResearchProject> getResearchProjects();
    void joinResearchProject(ResearchProject project) throws exceptions.NonResearcherException;
}
