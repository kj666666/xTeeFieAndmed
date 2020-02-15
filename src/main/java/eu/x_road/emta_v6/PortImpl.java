
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package eu.x_road.emta_v6;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2020-02-15T00:35:05.856+02:00
 * Generated source version: 3.2.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "webService",
                      portName = "port",
                      targetNamespace = "http://emta-v6.x-road.eu",
                      wsdlLocation = "classpath:services.wsdl",
                      endpointInterface = "eu.x_road.emta_v6.WebServiceInterface")
                      
public class PortImpl implements WebServiceInterface {

    private static final Logger LOG = Logger.getLogger(PortImpl.class.getName());

    /* (non-Javadoc)
     * @see eu.x_road.emta_v6.WebServiceInterface#xteeFieAndmed(eu.x_road.emta_v6.PersonalIdentityCode keha, eu.x_road.xsd.identifiers.XRoadClientIdentifierType client, eu.x_road.xsd.identifiers.XRoadServiceIdentifierType service, java.lang.String id, java.lang.String protocolVersion, java.lang.String userId, java.lang.String issue, eu.x_road.emta_v6.PersonalIdentityCode paring, eu.x_road.emta_v6.XteeFieAndmedResponseType keha2)*
     */
    public void xteeFieAndmed(eu.x_road.emta_v6.PersonalIdentityCode keha, javax.xml.ws.Holder<eu.x_road.xsd.identifiers.XRoadClientIdentifierType> client, javax.xml.ws.Holder<eu.x_road.xsd.identifiers.XRoadServiceIdentifierType> service, javax.xml.ws.Holder<java.lang.String> id, javax.xml.ws.Holder<java.lang.String> protocolVersion, javax.xml.ws.Holder<java.lang.String> userId, javax.xml.ws.Holder<java.lang.String> issue, javax.xml.ws.Holder<PersonalIdentityCode> paring, javax.xml.ws.Holder<XteeFieAndmedResponseType> keha2) { 
        LOG.info("Executing operation xteeFieAndmed");
        System.out.println(keha);
        System.out.println(client.value);
        System.out.println(service.value);
        System.out.println(id.value);
        System.out.println(protocolVersion.value);
        System.out.println(userId.value);
        System.out.println(issue.value);
        try {
            eu.x_road.emta_v6.PersonalIdentityCode paringValue = null;
            paring.value = paringValue;
            eu.x_road.emta_v6.XteeFieAndmedResponseType keha2Value = null;
            keha2.value = keha2Value;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
