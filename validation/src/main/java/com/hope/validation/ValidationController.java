@RestController
@RequestMapping("/validate")
public class ValidationController {

    @PostMapping("/email")
    public ResponseEntity<Boolean> validateEmail(@RequestBody EmailValidationRequest request) {
        // Validate email logic here
        return ResponseEntity.ok(true);
    }

    @PostMapping("/event")
    public ResponseEntity<Boolean> validateEvent(@RequestBody EventValidationRequest request) {
        // Validate event logic here
        return ResponseEntity.ok(true);
    }
}
