package rigor.io.sampletest.report;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportDTO {
    private Long id;
    private String day;
    private int placements = 0;
    private int videos = 0;
    private int hours = 0;
    private int minutes  = 0;
    private int returnVisits = 0;
    private int bibleStudies = 0;
    public ReportDTO(Report report) {
        this.id = report.getId();
        this.day = report.getDay();
        this.placements = report.getPlacements();
        this.videos = report.getVideos();
        this.hours = report.getHours();
        this.minutes = report.getMinutes();
        this.returnVisits = report.getReturnVisits();
        this.bibleStudies = report.getBibleStudies();
    }
}
