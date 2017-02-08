package XML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by jkkoe on 07/02/2017.
 */
public class JaxbMain2 {
    public static void main(String[] args) throws JAXBException {

    try {
        File file = new File("C:\\Users\\jkkoe\\Desktop\\customer_address.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
        System.out.println(customer);

    }catch (JAXBException e){
        e.printStackTrace();
    }
    }
}
