package ru.waveaccess.tver.activity.controller.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.waveaccess.tver.activity.model.users.ActivityUser;
import ru.waveaccess.tver.activity.service.ActivityUsersService;

import java.util.List;

@RestController
@RequestMapping("/admin/users")
@RequiredArgsConstructor
public class AdminActivityUserCtrl {

	private final ActivityUsersService usersService;

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
		usersService.saveNew(activityUser);
		return ResponseEntity.ok("New user was successful saved");
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
