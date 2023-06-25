package rigor.io.sampletest.report;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String day;
    private int placements = 0;
    private int videos = 0;
    private int hours = 0;
    private int minutes  = 0;
    private int returnVisits = 0;
    private int bibleStudies = 0;

    public Report(ReportDTO reportDTO) {
        this.id = reportDTO.getId();
        this.day = reportDTO.getDay();
        this.placements = reportDTO.getPlacements();
        this.videos = reportDTO.getVideos();
        this.hours = reportDTO.getHours();
        this.minutes = reportDTO.getMinutes();
        this.returnVisits = reportDTO.getReturnVisits();
        this.bibleStudies = reportDTO.getBibleStudies();
    }
}
