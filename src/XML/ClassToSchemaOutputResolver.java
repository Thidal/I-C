package XML;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ClassToSchemaOutputResolver extends SchemaOutputResolver {
    public Result createOutput(String namespaceUri, String suggestedFileName)
            throws IOException {
        System.out.println("Suggested File Name : " + suggestedFileName);
        return new StreamResult(new File(suggestedFileName));
    }
}
