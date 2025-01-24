package com.hope.request_management;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requests")
public class RequestController {

    @Autowired
    private RequestService requestService;

    // Create a new request
    @PostMapping
    public ResponseEntity<Request> createRequest(@RequestBody Request request) {
        return ResponseEntity.ok(requestService.createRequest(request));
    }

    // Retrieve request details by ID
    @GetMapping("/{id}")
    public ResponseEntity<Request> getRequest(@PathVariable String id) {
        return ResponseEntity.ok(requestService.getRequestById(id));
    }

    // Update request status by ID
    @PutMapping("/{id}")
    public ResponseEntity<Request> updateRequestStatus(@PathVariable String id, @RequestBody String status) {
        return ResponseEntity.ok(requestService.updateRequestStatus(id, status));
    }
}


