package seminar1;

import java.time.LocalDate;

public class Vaccination {
    private String vaccineName;
    private LocalDate vaccinationDate;

    public Vaccination(String vaccineName, LocalDate vaccinationDate) {
        this.vaccineName = vaccineName;
        this.vaccinationDate = vaccinationDate;
    }

    @Override
    public String toString() {
        return String.format("Vaccine: %s, %s", vaccineName, vaccinationDate);
    }
}