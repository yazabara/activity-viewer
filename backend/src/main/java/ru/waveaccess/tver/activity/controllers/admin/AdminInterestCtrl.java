package ru.waveaccess.tver.activity.controllers.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.waveaccess.tver.activity.model.event.Interest;
import ru.waveaccess.tver.activity.service.InterestService;

@RestController
@RequestMapping("/admin/interest")
@RequiredArgsConstructor
public class AdminInterestCtrl {

	private final InterestService interestService;

	@GetMapping("/all")
	public ResponseEntity getAll() {
		return ResponseEntity.ok(interestService.getAll());
	}

	@GetMapping("/{interestId}")
	public ResponseEntity getOne(@PathVariable Long interestId) {
		return ResponseEntity.ok(interestService.getOne(interestId));
	}

	@PostMapping("/save")
	public ResponseEntity saveNew(@RequestBody Interest interest) {
		interestService.saveNew(interest);
		return ResponseEntity.ok("New interest was successful saved");
	}

	@PutMapping("/update")
	public ResponseEntity update(@RequestBody Interest interest) {
		interestService.update(interest);
		return ResponseEntity.ok("Interest was successful updated");
	}

	@DeleteMapping("/{interestId}")
	public ResponseEntity delete(@PathVariable Long interestId) {
		interestService.delete(interestId);
		return ResponseEntity.ok("Interest was successful deleted");
	}
}
