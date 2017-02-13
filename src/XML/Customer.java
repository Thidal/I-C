package XML;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jkkoe on 07/02/2017.
 */
@XmlRootElement
public class Customer {
    private String name;
    private String dateOfBirth;
    private Map<String, Address> addresses;
//    private MAddress address;

    public Customer(){
        addresses = new HashMap<>();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @XmlElement
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "XML.MCustomer [name=" + name + ", Date of Birth=" + dateOfBirth + ", Addresses=" + addresses + "]";
     }

    @XmlElement
    public Map<String, Address> getAddresses(){
        return addresses;
     }

    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
    }
}
