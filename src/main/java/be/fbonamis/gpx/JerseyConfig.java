package be.fbonamis.gpx;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class JerseyConfig extends ResourceConfig {

/*    private MethodMatcher methodMatcher = new MethodMatcher() {
        public boolean matches(java.lang.reflect.Method method) {
            return method.getDeclaringClass().getName().startsWith("be.credoc.utilities.address.api");
        }
    };

    @Autowired
    public MetricRegistry metricRegistry;*/

    @PostConstruct
    public void buildConfig() {
        /*if (metricRegistry != null) {
            this.register(new InstrumentedResourceMethodApplicationListener(metricRegistry, methodMatcher));
            this.register(new MetricsResource(metricRegistry));
        }*/
        this.register(HealthResource.class);
        this.register(TrackEndpoint.class);
    }
}
