package mx.com.xvhx.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import mx.com.xvhx.entidades.Profesor;

public class JAXBUnMarshall {

	public static void main(String[] args) {

		try {

			File profesorXML = new File(System.getProperty("user.home")
					+ System.getProperty("file.separator") + "profesor.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(Profesor.class);
			Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
			
			Profesor profesor =  (Profesor) jaxbUnMarshaller.unmarshal(profesorXML);

			System.out.println("Datos profesor.");
			System.out.println("Codigo: "+profesor.getCodigo());
			System.out.println("Nombre: "+profesor.getNombre());
			System.out.println("Apellido: "+profesor.getApellido());
			System.out.println("Fecha Ingreso: "+profesor.getFechaIngreso());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
