import org.eclipse.jetty.server.*;
import org.eclipse.jetty.server.handler.*;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.websocket.javax.server.config.JavaxWebSocketServletContainerInitializer;
import socket.ControllerEndpoint;

public class ServerStarter {
    public static void main(String[] args) throws Exception {
        ServerStarter server = new ServerStarter();
        server.setPort(8081);
        server.start();
        server.join();
    }

    private final Server server;
    private final ServerConnector connector;

    public ServerStarter() {
        server = new Server();
        connector = new ServerConnector(server);
        server.addConnector(connector);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        ResourceHandler resources = new ResourceHandler();
        resources.setDirectoriesListed(true);
        resources.setDirAllowed(true);
        resources.setResourceBase("C:\\Users\\stelar7\\Desktop\\digimon\\assets\\card-images-input");
        resources.setCacheControl("public, max-age=604800");

        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[]{resources, context});

        server.setHandler(handlers);

        JavaxWebSocketServletContainerInitializer.configure(context, (servletContext, wsContainer) ->
        {
            wsContainer.setDefaultMaxSessionIdleTimeout(0);
            wsContainer.setDefaultMaxTextMessageBufferSize(65535);
            wsContainer.addEndpoint(ControllerEndpoint.class);
        });
    }

    public void setPort(int port) {
        connector.setPort(port);
    }

    public void start() throws Exception {
        server.start();
    }

    public void join() throws InterruptedException {
        System.out.println("Use Ctrl+C to stop server");
        server.join();
    }
}
