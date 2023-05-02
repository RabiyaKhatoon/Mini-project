package in.ashokit.runner;

import in.ashokit.entity.CitizenPlan;
import in.ashokit.repo.CitizenPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private CitizenPlanRepository repo;   // Needed to save the data in DB. Not requred when we have UI as data comes from UI
    @Override
    public void run(ApplicationArguments args) throws Exception {

       // repo.deleteAll();

        // Cash plan data
        CitizenPlan c1 = new CitizenPlan();
        c1.setCitizenName("John Smith");
        c1.setGender("Male");
        c1.setPlanName("Cash");
        c1.setPlanStatus("Approved");
        c1.setPlanStartDate(LocalDate.now());
        c1.setPlanEndDate(LocalDate.now().plusMonths(6));
        c1.setBenefitAmount(5000.00);

        CitizenPlan c2 = new CitizenPlan();
        c2.setCitizenName("Angela Hauser");
        c2.setGender("Fe-Male");
        c2.setPlanName("Cash");
        c2.setPlanStatus("Approved");
        c2.setPlanStartDate(LocalDate.now());
        c2.setPlanEndDate(LocalDate.now().plusMonths(6));
        c2.setBenefitAmount(5000.00);

        CitizenPlan c3 = new CitizenPlan();
        c3.setCitizenName("Jonathan");
        c3.setGender("Male");
        c3.setPlanName("Cash");
        c3.setPlanStatus("Denied");
        c3.setDenialReason("Rental Income");

        CitizenPlan c4 = new CitizenPlan();
        c4.setCitizenName("Patricia Quinlain");
        c4.setGender("Fe-Male");
        c4.setPlanName("Cash");
        c4.setPlanStatus("Denied");
        c4.setDenialReason("Rental Income");

        CitizenPlan c5 = new CitizenPlan();
        c5.setCitizenName("Firoj Pathan");
        c5.setGender("Male");
        c5.setPlanName("Cash");
        c5.setPlanStatus("Terminated");
        c5.setPlanStartDate(LocalDate.now().minusMonths(4));
        c5.setPlanEndDate(LocalDate.now().plusMonths(6));
        c5.setBenefitAmount(5000.00);
        c5.setTerminatedDate(LocalDate.now());
        c5.setTerminationReason("Employed");

        CitizenPlan c6 = new CitizenPlan();
        c6.setCitizenName("Saida Infy");
        c6.setGender("Fe-Male");
        c6.setPlanName("Cash");
        c6.setPlanStatus("Terminated");
        c6.setPlanStartDate(LocalDate.now().minusMonths(4));
        c6.setPlanEndDate(LocalDate.now().plusMonths(6));
        c6.setBenefitAmount(5000.00);
        c6.setTerminatedDate(LocalDate.now());
        c6.setTerminationReason("Employed");

        // Fod plan data

        CitizenPlan c7 = new CitizenPlan();
        c7.setCitizenName("Gopi Krishnan");
        c7.setGender("Male");
        c7.setPlanName("Food");
        c7.setPlanStatus("Approved");
        c7.setPlanStartDate(LocalDate.now());
        c7.setPlanEndDate(LocalDate.now().plusMonths(6));
        c7.setBenefitAmount(5000.00);

        CitizenPlan c8 = new CitizenPlan();
        c8.setCitizenName("Anita Saqlani");
        c8.setGender("Fe-Male");
        c8.setPlanName("Food");
        c8.setPlanStatus("Approved");
        c8.setPlanStartDate(LocalDate.now());
        c8.setPlanEndDate(LocalDate.now().plusMonths(6));
        c8.setBenefitAmount(5000.00);

        CitizenPlan c9 = new CitizenPlan();
        c9.setCitizenName("Jonathan");
        c9.setGender("Male");
        c9.setPlanName("Food");
        c9.setPlanStatus("Denied");
        c9.setDenialReason("property holder");

        CitizenPlan c10 = new CitizenPlan();
        c10.setCitizenName("Patricia Quinlain");
        c10.setGender("Fe-Male");
        c10.setPlanName("Food");
        c10.setPlanStatus("Denied");
        c10.setDenialReason("property holder");

        CitizenPlan c11 = new CitizenPlan();
        c11.setCitizenName("Suraj Bhan");
        c11.setGender("Male");
        c11.setPlanName("Food");
        c11.setPlanStatus("Terminated");
        c11.setPlanStartDate(LocalDate.now().minusMonths(4));
        c11.setPlanEndDate(LocalDate.now().plusMonths(6));
        c11.setBenefitAmount(5000.00);
        c11.setTerminatedDate(LocalDate.now());
        c11.setTerminationReason("Employed");

        CitizenPlan c12 = new CitizenPlan();
        c12.setCitizenName("Sahanashree");
        c12.setGender("Fe-Male");
        c12.setPlanName("Food");
        c12.setPlanStatus("Terminated");
        c12.setPlanStartDate(LocalDate.now().minusMonths(4));
        c12.setPlanEndDate(LocalDate.now().plusMonths(6));
        c12.setBenefitAmount(5000.00);
        c12.setTerminatedDate(LocalDate.now());
        c12.setTerminationReason("Employed");

        // Medical Plan

        CitizenPlan c13 = new CitizenPlan();
        c13.setCitizenName("Asad Uddin");
        c13.setGender("Male");
        c13.setPlanName("Medical");
        c13.setPlanStatus("Approved");
        c13.setPlanStartDate(LocalDate.now());
        c13.setPlanEndDate(LocalDate.now().plusMonths(6));
        c13.setBenefitAmount(5000.00);

        CitizenPlan c14 = new CitizenPlan();
        c14.setCitizenName("Aisha Jilani");
        c14.setGender("Fe-Male");
        c14.setPlanName("Medical");
        c14.setPlanStatus("Approved");
        c14.setPlanStartDate(LocalDate.now());
        c14.setPlanEndDate(LocalDate.now().plusMonths(6));
        c14.setBenefitAmount(5000.00);

        CitizenPlan c15 = new CitizenPlan();
        c15.setCitizenName("John Henry");
        c15.setGender("Male");
        c15.setPlanName("Medical");
        c15.setPlanStatus("Denied");
        c15.setDenialReason("property holder");

        CitizenPlan c16 = new CitizenPlan();
        c16.setCitizenName("Maha Sehgal");
        c16.setGender("Fe-Male");
        c16.setPlanName("Medical");
        c16.setPlanStatus("Denied");
        c16.setDenialReason("property holder");

        CitizenPlan c17 = new CitizenPlan();
        c17.setCitizenName("Shreya Sehgal");
        c17.setGender("Male");
        c17.setPlanName("Medical");
        c17.setPlanStatus("Terminated");
        c17.setPlanStartDate(LocalDate.now().minusMonths(4));
        c17.setPlanEndDate(LocalDate.now().plusMonths(6));
        c17.setBenefitAmount(5000.00);
        c17.setTerminatedDate(LocalDate.now());
        c17.setTerminationReason("Employed");

        CitizenPlan c18 = new CitizenPlan();
        c18.setCitizenName("Sai Priya");
        c18.setGender("Fe-Male");
        c18.setPlanName("Medical");
        c18.setPlanStatus("Terminated");
        c18.setPlanStartDate(LocalDate.now().minusMonths(4));
        c18.setPlanEndDate(LocalDate.now().plusMonths(6));
        c18.setBenefitAmount(5000.00);
        c18.setTerminatedDate(LocalDate.now());
        c18.setTerminationReason("Employed");

               // Employment plan

        CitizenPlan c19 = new CitizenPlan();
        c19.setCitizenName("Hanshik Mehta");
        c19.setGender("Male");
        c19.setPlanName("Employment");
        c19.setPlanStatus("Approved");
        c19.setPlanStartDate(LocalDate.now());
        c19.setPlanEndDate(LocalDate.now().plusMonths(6));
        c19.setBenefitAmount(5000.00);

        CitizenPlan c20 = new CitizenPlan();
        c20.setCitizenName("Samiksha");
        c20.setGender("Fe-Male");
        c20.setPlanName("Employment");
        c20.setPlanStatus("Approved");
        c20.setPlanStartDate(LocalDate.now());
        c20.setPlanEndDate(LocalDate.now().plusMonths(6));
        c20.setBenefitAmount(5000.00);

        CitizenPlan c21 = new CitizenPlan();
        c21.setCitizenName("iurii Starukhin");
        c21.setGender("Male");
        c21.setPlanName("Employment");
        c21.setPlanStatus("Denied");
        c21.setDenialReason("property holder");

        CitizenPlan c22 = new CitizenPlan();
        c22.setCitizenName("Mohanty Swagatika");
        c22.setGender("Fe-Male");
        c22.setPlanName("Employment");
        c22.setPlanStatus("Denied");
        c22.setDenialReason("property holder");

        CitizenPlan c23 = new CitizenPlan();
        c23.setCitizenName("Shahzad Irani");
        c23.setGender("Male");
        c23.setPlanName("Employment");
        c23.setPlanStatus("Terminated");
        c23.setPlanStartDate(LocalDate.now().minusMonths(4));
        c23.setPlanEndDate(LocalDate.now().plusMonths(6));
        c23.setBenefitAmount(5000.00);
        c23.setTerminatedDate(LocalDate.now());
        c23.setTerminationReason("Employed");

        CitizenPlan c24 = new CitizenPlan();
        c24.setCitizenName("Renuka Sahane");
        c24.setGender("Fe-Male");
        c24.setPlanName("Employment");
        c24.setPlanStatus("Terminated");
        c24.setPlanStartDate(LocalDate.now().minusMonths(4));
        c24.setPlanEndDate(LocalDate.now().plusMonths(6));
        c24.setBenefitAmount(5000.00);
        c24.setTerminatedDate(LocalDate.now());
        c24.setTerminationReason("Employed");

        CitizenPlan c25 = new CitizenPlan();
        c25.setCitizenName("Shahriyar");
        c25.setGender("Male");
        c25.setPlanName("Cash");
        c25.setPlanStatus("Approved");
        c25.setPlanStartDate(LocalDate.now().minusMonths(4));
        c25.setPlanEndDate(LocalDate.now().plusMonths(6));
        c25.setTerminatedDate(LocalDate.now());
        c25.setTerminationReason("Employed");

        List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25);

        repo.saveAll(list);

    }
}
