package com.ictu3091081.Services;

import com.ictu3091081.Respiratory.FeedbackRepository;
import com.ictu3091081.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback submitFeedback(Feedback feedback) {
        // Handle feedback submission logic
        return feedbackRepository.save(feedback);
    }
}
