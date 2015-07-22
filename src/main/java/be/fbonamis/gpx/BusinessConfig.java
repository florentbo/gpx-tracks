package be.fbonamis.gpx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BusinessConfig {

/*    @Inject
    private DaoConfig daoConfig;*/

    @Bean
    public TrackService getTrackService() {
        return new TrackService();
    }
}
