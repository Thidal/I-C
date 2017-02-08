import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

import static javax.xml.bind.JAXBContext.newInstance;

/**
 * Created by jkkoe on 07/02/2017.
 */
public class JaxbMain1 {
    public static void main(String[] args) throws JAXBException {

        Customer customer = new Customer();
        customer.setName("Jaap");
        customer.setDateOfBirth("12-December-1995");

        Address billing = new Address("Rembrandt van Rijnstraat 4 ", "3751VK ", "Bunschoten");
        Address shipping = new Address("Paulus Potterstraat 10 ", "8252GH ", "Spakenburg");

        customer.setAddresses("Billing", billing);
        customer.setAddresses("Shipping", shipping);

        try {
            File file = new File("C:\\Users\\jkkoe\\Desktop\\customer_address.xml");
            JAXBContext jaxbContext = newInstance(Customer.class, Address.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(customer, file);
            System.out.println(customer.toString());
        }catch (JAXBException e){
            e.printStackTrace();
        }
    }
}
