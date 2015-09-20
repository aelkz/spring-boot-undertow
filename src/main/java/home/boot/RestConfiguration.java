package home.boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.http.MediaType;

/**
 * Created by alex on 9/20/2015.
 */
@Configuration
public class RestConfiguration extends RepositoryRestMvcConfiguration{

    @Override
    public RepositoryRestConfiguration config() {
        RepositoryRestConfiguration config = super.config();
        config.setDefaultMediaType(MediaType.APPLICATION_JSON);
        config.setBaseUri("/api");
        config.useHalAsDefaultJsonMediaType(false);
        return config;
    }
}
