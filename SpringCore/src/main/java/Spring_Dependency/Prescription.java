package Spring_Dependency;

import java.util.List;

public class Prescription {
private int id;
private String PatientName;
private List<String>medicines;
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getPatientName() {
	return PatientName;
}
public void setPatientName(String patientName) {
	PatientName = patientName;
}
public List<String> getMedicines() {
	return medicines;
}
public void setMedicines(List<String> medicines) {
	this.medicines = medicines;
}
@Override
public String toString() {
	return "Prescription [id=" + id + ", PatientName=" + PatientName + ", medicines=" + medicines + "]";
}

}
