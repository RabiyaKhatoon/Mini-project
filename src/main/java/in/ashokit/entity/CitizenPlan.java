package in.ashokit.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "CITIZEN_PLANS_INFO")
public class CitizenPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer citizenId;
    private String citizenName;
    private String gender;
    private String planName;
    private String planStatus;
    private LocalDate planStartDate;  // Local date format = yyyy/mm/dd
    private LocalDate planEndDate;
    private Double benefitAmount;
    private  String denialReason;
    private String terminationReason;
    private LocalDate terminatedDate;



}
