package C195.DAO;

import C195.models.Appointment;
import java.util.List;

public interface DAOAppointment {

    public int addAppointment(Appointment appointment);
    public void modifyAppointment(Appointment appointment);
    public void deleteAppointment(Appointment appointment);
    public List<Appointment> getAllAppointments();
    public List<Appointment> getAppointmentByID(int ID);
    public List<Appointment> getAppointmentByUser(int ID);

}
