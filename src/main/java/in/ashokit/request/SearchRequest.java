package in.ashokit.request;

import in.ashokit.entity.CitizenPlan;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Data
public class SearchRequest {

    // search criteria
    private String gender;
    private String planName;
    private String planStatus;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate planStartDate;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate planEndDate;

}
