package rigor.io.sampletest.report;

import java.util.List;

public interface ReportService {
    List<Report> getAllReports();

    Report createReport(ReportDTO reportDTO);
}
