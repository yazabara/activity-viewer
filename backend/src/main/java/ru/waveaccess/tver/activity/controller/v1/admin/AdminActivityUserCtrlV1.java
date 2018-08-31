package ru.waveaccess.tver.activity.controller.v1.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.waveaccess.tver.activity.model.db.users.ActivityUser;
import ru.waveaccess.tver.activity.service.ActivityUsersService;
import ru.waveaccess.tver.activity.service.i18n.MessagesService;

import java.util.List;

@RestController
@RequestMapping("/v1/admin/users")
@RequiredArgsConstructor
public class AdminActivityUserCtrlV1 {

    private final ActivityUsersService usersService;
    private final MessagesService messagesService;

    @GetMapping("/all")
    public ResponseEntity getAll() {
        List<ActivityUser> result = usersService.getAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{userId}")
    public ResponseEntity getOne(@PathVariable Long userId) {
        return ResponseEntity.ok(usersService.getOne(userId));
    }

    @PostMapping("/save")
    public ResponseEntity saveNew(@RequestBody ActivityUser activityUser) {
        Long id = usersService.saveNew(activityUser);
        return ResponseEntity.ok(messagesService.getMessage("controller.admin.users.save.new", id));
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody ActivityUser activityUser) {
        usersService.update(activityUser);
        return ResponseEntity.ok("User was successful updated");
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity delete(@PathVariable Long userId) {
        usersService.delete(userId);
        return ResponseEntity.ok("User was successful deleted");
    }
}
