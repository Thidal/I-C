import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;

/**
 * Created by jkkoe on 07/02/2017.
 */
@XmlRootElement
public class Customer {
    private String name;
    private String dateOfBirth;
    private HashMap<String, Object> addresses;

    public Customer(){
        addresses = new HashMap<String, Object>();
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
        return "Customer [name=" + name + ", Date of Birth=" + dateOfBirth + ", Addresses=" + addresses + "]";
     }

    @XmlElement
    public HashMap<String, Object> getAddresses(){
        return addresses;
     }

    public void setAddresses(String s, Object o){
        addresses.put(s, o);
    }

}
