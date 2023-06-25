package rigor.io.sampletest.report;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultReportHandler implements ReportService {
    private final ReportRepository reportRepository;


    @Override
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    @Override
    public Report createReport(ReportDTO reportDTO) {
        return reportRepository.save(new Report(reportDTO));
    }
}
