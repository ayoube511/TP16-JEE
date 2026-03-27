package ma.ens.tp8monitoring.config;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggingConfig {

    private static final Logger logger = LoggerFactory.getLogger(LoggingConfig.class);

    @PostConstruct
    public void init() {
        logger.info("============================================");
        logger.info("  TP8 - Spring Boot Monitoring démarré !");
        logger.info("  Actuator  : http://localhost:8080/actuator");
        logger.info("  Health    : http://localhost:8080/actuator/health");
        logger.info("  Metrics   : http://localhost:8080/actuator/metrics");
        logger.info("  Prometheus: http://localhost:8080/actuator/prometheus");
        logger.info("============================================");
    }
}
