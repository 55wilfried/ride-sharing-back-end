package com.ictu3091081.Services;
import com.ictu3091081.Respiratory.UserRepository;
import com.ictu3091081.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Perform registration logic, e.g., password hashing, etc.
        return userRepository.save(user);
    }

    public String loginUser(User user) {
        // Perform login logic and return authentication token
        return "token"; // Replace with actual token generation logic
    }
}
