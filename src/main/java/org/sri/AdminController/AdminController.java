package org.sri.AdminController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.sri.AdminDto.AdminDto;

@RestController
public class AdminController {

    @GetMapping("/testConnection")
    public ResponseEntity<String> testConnection() {
        return ResponseEntity.ok("Works sisss");
    }

    @GetMapping("/searchUser")
    public ResponseEntity<String> searchUser(@RequestParam(required = true) String username) {
        AdminDto adminDto=new AdminDto();
        return ResponseEntity.ok(adminDto.searchUser(username));
    }
}
