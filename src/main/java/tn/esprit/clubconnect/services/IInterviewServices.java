package tn.esprit.clubconnect.services;

import org.springframework.web.multipart.MultipartFile;
import tn.esprit.clubconnect.entities.Interview;

import java.util.List;

public interface IInterviewServices {
    Interview addInterviewWithImage(Interview interview);

    Interview updateInterview(Interview interview);

    void deleteInterview(Integer idI);

    Interview getInterviewById(Integer idI);

    List<Interview> getAllInterviews();

    void exportInterviewsToExcel(String s);


}

