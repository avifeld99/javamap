package be.intecbrussel.opdracht;

import java.util.*;

import static java.util.Comparator.comparing;

public class PatientApp {
    public static void main(String[] args) {

        Set<Patient> patientSet = new LinkedHashSet<>();
        patientSet.addAll(Patient.getAllPatients());
        System.out.println(patientSet);

        Comparator<Patient> TemperatureSorter = ((patient1, patient2) ->
                Integer.compare(patient2.getTemperature(), patient1.getTemperature()));
        Comparator<Patient> AgeSorter = ((patient1, patient2) ->
                Integer.compare(patient2.getAge(), patient1.getAge()));
        Comparator<Patient> InsuranceSorter = ((patient1, patient2) ->
                Boolean.compare(patient2.isEnsured(), patient1.isEnsured()));

        Queue<Patient> priority = new PriorityQueue<>(
                TemperatureSorter.thenComparing(AgeSorter).thenComparing(InsuranceSorter));

        priority.addAll(patientSet);
        while (priority.size() > 0) {
            System.out.println(priority.poll());
        }
    }
}
