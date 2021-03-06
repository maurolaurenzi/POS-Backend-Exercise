package webapp.domain;

import webapp.domain.MarcaTarjeta;
import webapp.domain.NombreMarca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
public class Visa extends MarcaTarjeta {

    public Visa(NombreMarca nombre) {

        super(nombre);
    }

    //default constructor
    public Visa(){
        super();
    }

    @Override
    public Double porcentajeTasa(LocalDate fecha) {
        Double currentYear = Double.valueOf(fecha.getYear());
        Double currentMonth = Double.valueOf(fecha.getMonthValue());
        return ((currentYear%100)/currentMonth)*0.01;
    }

}
