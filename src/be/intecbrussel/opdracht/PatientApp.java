package be.intecbrussel.opdracht;

import java.util.*;

import static java.util.Comparator.comparing;

public class PatientApp {
    public static void main(String[] args) {

        Patient patient3 = new Patient();
        patient3.isUnKnownVirus();

        Set<Patient> patientSet = new LinkedHashSet<>();
        patientSet.addAll(Patient.getAllPatients());
        //System.out.println(patientSet);

        //----------------------

        Comparator<Patient> TemperatureSorter = ((patient1, patient2) ->
                Integer.compare(patient2.getTemperature(), patient1.getTemperature()));
        Comparator<Patient> AgeSorter = ((patient1, patient2) ->
                Integer.compare(patient2.getAge(), patient1.getAge()));
        Comparator<Patient> InsuranceSorter = ((patient1, patient2) ->
                Boolean.compare(patient2.isEnsured(), patient1.isEnsured()));

        Queue<Patient> priority = new PriorityQueue<>(
                TemperatureSorter.thenComparing(AgeSorter).thenComparing(InsuranceSorter));

        priority.addAll(patientSet);
        /*while (!priority.isEmpty()) {
            System.out.println(priority.poll());
        }*/

        //--------------------------

        List<Patient> cat1 = new ArrayList<>();
        List<Patient> cat2 = new ArrayList<>();
        List<Patient> cat3 = new ArrayList<>();
        List<Patient> cat4 = new ArrayList<>();

        for (Patient patient : priority) {
            if (patient.getAge() >= 65 && patient.getTemperature() >= 38 ||
                    patient.getTemperature() >= 40 && patient.isUnKnownVirus()) {
                cat1.add(patient);
            } else if (patient.getTemperature() >= 38 && patient.isUnKnownVirus()) {
                cat2.add(patient);
            } else if (patient.isUnKnownVirus()) {
                cat3.add(patient);
            } else {
                cat4.add(patient);
            }
        }

        System.out.println(cat1.size());
        System.out.println(cat2);

        Map<Integer, List<Patient>> mapCollection = new HashMap<>();
        mapCollection.put(1, cat1);
        mapCollection.put(2, cat2);
        mapCollection.put(3, cat3);
        mapCollection.put(4, cat4);

        //System.out.println(mapCollection.get(4));

        for (Map.Entry<Integer, List<Patient>> category : mapCollection.entrySet()) {
            int key = category.getKey();
            System.out.println(category.getValue().size());
        }
        System.out.println(priority);

    }
}
