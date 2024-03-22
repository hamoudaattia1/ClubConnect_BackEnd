package tn.esprit.clubconnect.services;

import tn.esprit.clubconnect.entities.Interview;

import java.util.List;

public interface IInterviewService {
    Interview addInterview(Interview interview);

    Interview updateInterview(Interview interview);

    void deleteInterview(Integer idI);

    Interview getInterviewById(Integer idI);

    List<Interview> getAllInterviews();
}

