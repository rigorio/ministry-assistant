package rigor.io.sampletest.report;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reports")
@RequiredArgsConstructor
public class ReportController {
    private final ReportService reportService;

    @GetMapping
    public ResponseEntity<List<ReportDTO>> findAllReports() {
        return new ResponseEntity<>(reportService.getAllReports().stream()
                .map(ReportDTO::new)
                .collect(Collectors.toList()), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> createReport(@RequestBody ReportDTO report) {
        return new ResponseEntity<>(reportService.createReport(report), HttpStatus.ACCEPTED);
    }
}
