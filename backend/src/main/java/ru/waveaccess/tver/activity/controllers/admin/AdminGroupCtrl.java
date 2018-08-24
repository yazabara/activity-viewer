package ru.waveaccess.tver.activity.controllers.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.waveaccess.tver.activity.model.users.Group;
import ru.waveaccess.tver.activity.service.GroupService;

@RestController
@RequestMapping("/admin/group")
@RequiredArgsConstructor
public class AdminGroupCtrl {

	private final GroupService groupService;

	@GetMapping("/all")
	public ResponseEntity getAll() {
		return ResponseEntity.ok(groupService.getAll());
	}

	@GetMapping("/{groupId}")
	public ResponseEntity getOne(@PathVariable Long groupId) {
		return ResponseEntity.ok(groupService.getOne(groupId));
	}

	@PostMapping("/save")
	public ResponseEntity saveNew(@RequestBody Group group) {
		groupService.saveNew(group);
		return ResponseEntity.ok("New group was successful saved");
	}

	@PutMapping("/update")
	public ResponseEntity update(@RequestBody Group group) {
		groupService.update(group);
		return ResponseEntity.ok("Group was successful updated");
	}

	@DeleteMapping("/{groupId}")
	public ResponseEntity delete(@PathVariable Long groupId) {
		groupService.delete(groupId);
		return ResponseEntity.ok("Group was successful deleted");
	}
}
