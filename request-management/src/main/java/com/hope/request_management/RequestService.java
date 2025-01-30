package com.hope.request_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    // Create request
    public Request createRequest(Request request) {
        request.setStatus("Pending"); // Ensure Request class has setStatus()
        return requestRepository.save(request);
    }

    // Get request by ID
    public Request getRequestById(String id) {
        return requestRepository.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
    }

    // Update request status
    public Request updateRequestStatus(String id, String status) {
        Optional<Request> optionalRequest = requestRepository.findById(id);
        if (optionalRequest.isPresent()) {
            Request request = optionalRequest.get();
            request.setStatus(status);  // Ensure this method exists in Request.java
            return requestRepository.save(request);
        } else {
            throw new RuntimeException("Request not found");
        }
    }
}

