package XML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created by jkkoe on 13/02/2017.
 */
public class XDS {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Customer.class);
        ClassToSchemaOutputResolver x = new ClassToSchemaOutputResolver();
        context.generateSchema(x);
    }
}
