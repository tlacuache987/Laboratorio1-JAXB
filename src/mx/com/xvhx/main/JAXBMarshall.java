package mx.com.xvhx.main;

import java.io.File;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import mx.com.xvhx.entidades.Profesor;

public class JAXBMarshall {

	public static void main(String[] args) {

		Profesor profesor = new Profesor();
		profesor.setCodigo(123);
		profesor.setNombre("Ivan Venor");
		profesor.setApellido("García Baños");
		profesor.setFechaIngreso(new GregorianCalendar(2011, 01, 01).getTime());

		try {

			File profesorXML = new File(System.getProperty("user.home")
					+ System.getProperty("file.separator") + "profesor.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(Profesor.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(profesor, profesorXML);
			
			jaxbMarshaller.marshal(profesor, System.out);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
