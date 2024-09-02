package com.ictu3091081.Controller;

import com.ictu3091081.Services.FeedbackService;
import com.ictu3091081.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/submit")
    public ResponseEntity<Feedback> submitFeedback(@RequestBody Feedback feedback) {
        Feedback submittedFeedback = feedbackService.submitFeedback(feedback);
        return ResponseEntity.ok(submittedFeedback);
    }
}
