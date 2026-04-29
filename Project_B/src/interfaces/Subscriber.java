package interfaces;

import models.ResearchPaper;

public interface Subscriber {
    void update(String journalName, ResearchPaper paper);
}
