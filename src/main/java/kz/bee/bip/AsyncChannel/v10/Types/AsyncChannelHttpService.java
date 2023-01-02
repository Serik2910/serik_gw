
package kz.bee.bip.AsyncChannel.v10.Types;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AsyncChannelHttpService", targetNamespace = "http://bip.bee.kz/AsyncChannel/v10/Interfaces/Binding", wsdlLocation = "file:/Users/janalinov/Downloads/esedogw/src/main/resources/AsyncChannelHttp_Service.wsdl")
public class AsyncChannelHttpService
    extends Service
{

    private final static URL ASYNCCHANNELHTTPSERVICE_WSDL_LOCATION;
    private final static WebServiceException ASYNCCHANNELHTTPSERVICE_EXCEPTION;
    private final static QName ASYNCCHANNELHTTPSERVICE_QNAME = new QName("http://bip.bee.kz/AsyncChannel/v10/Interfaces/Binding", "AsyncChannelHttpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/janalinov/Downloads/esedogw/src/main/resources/AsyncChannelHttp_Service.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ASYNCCHANNELHTTPSERVICE_WSDL_LOCATION = url;
        ASYNCCHANNELHTTPSERVICE_EXCEPTION = e;
    }

    public AsyncChannelHttpService() {
        super(__getWsdlLocation(), ASYNCCHANNELHTTPSERVICE_QNAME);
    }

    public AsyncChannelHttpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ASYNCCHANNELHTTPSERVICE_QNAME, features);
    }

    public AsyncChannelHttpService(URL wsdlLocation) {
        super(wsdlLocation, ASYNCCHANNELHTTPSERVICE_QNAME);
    }

    public AsyncChannelHttpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ASYNCCHANNELHTTPSERVICE_QNAME, features);
    }

    public AsyncChannelHttpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AsyncChannelHttpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IAsyncChannel
     */
    @WebEndpoint(name = "AsyncChannelHttpPort")
    public IAsyncChannel getAsyncChannelHttpPort() {
        return super.getPort(new QName("http://bip.bee.kz/AsyncChannel/v10/Interfaces/Binding", "AsyncChannelHttpPort"), IAsyncChannel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAsyncChannel
     */
    @WebEndpoint(name = "AsyncChannelHttpPort")
    public IAsyncChannel getAsyncChannelHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bip.bee.kz/AsyncChannel/v10/Interfaces/Binding", "AsyncChannelHttpPort"), IAsyncChannel.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ASYNCCHANNELHTTPSERVICE_EXCEPTION!= null) {
            throw ASYNCCHANNELHTTPSERVICE_EXCEPTION;
        }
        return ASYNCCHANNELHTTPSERVICE_WSDL_LOCATION;
    }

}