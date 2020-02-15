package eu.x_road.emta_v6;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2020-02-15T00:35:05.962+02:00
 * Generated source version: 3.2.0
 * 
 */
@WebServiceClient(name = "webService", 
                  wsdlLocation = "classpath:services.wsdl",
                  targetNamespace = "http://emta-v6.x-road.eu") 
public class WebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://emta-v6.x-road.eu", "webService");
    public final static QName Port = new QName("http://emta-v6.x-road.eu", "port");
    static {
        URL url = WebService.class.getClassLoader().getResource("services.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(WebService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:services.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public WebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns WebServiceInterface
     */
    @WebEndpoint(name = "port")
    public WebServiceInterface getPort() {
        return super.getPort(Port, WebServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceInterface
     */
    @WebEndpoint(name = "port")
    public WebServiceInterface getPort(WebServiceFeature... features) {
        return super.getPort(Port, WebServiceInterface.class, features);
    }

}
