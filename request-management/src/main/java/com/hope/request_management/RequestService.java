package com.hope.request_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    // Create a new request
    public Request createRequest(Request request) {
        return requestRepository.save(request);
    }

    // Retrieve request by ID
    public Request getRequestById(String id) {
        return requestRepository.findById(id).orElse(null);
    }

    // Update request status by ID
    public Request updateRequestStatus(String id, String status) {
        Request request = requestRepository.findById(id).orElse(null);
        if (request != null) {
            request.setStatus(status);
            return requestRepository.save(request);
        }
        return null;
    }
}
