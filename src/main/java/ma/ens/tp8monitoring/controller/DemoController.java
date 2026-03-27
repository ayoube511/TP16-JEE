package ma.ens.tp8monitoring.controller;

import ma.ens.tp8monitoring.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    private final DemoService service;

    public DemoController(DemoService service) {
        this.service = service;
    }

    // Page d'accueil avec les liens utiles
    @GetMapping("/")
    public Map<String, Object> home() {
        logger.info("Accès à la page d'accueil");
        return Map.of(
                "app", "TP8 - Spring Boot Monitoring",
                "status", "✅ UP",
                "time", LocalDateTime.now().toString(),
                "endpoints", Map.of(
                        "process", "/process",
                        "process-heavy", "/process-heavy",
                        "process-error", "/process-error",
                        "actuator-health", "/actuator/health",
                        "actuator-metrics", "/actuator/metrics",
                        "actuator-prometheus", "/actuator/prometheus",
                        "actuator-info", "/actuator/info"
                )
        );
    }

    // Endpoint principal simulant un traitement
    @GetMapping("/process")
    public String process() {
        logger.debug("Requête reçue sur /process");
        return service.processData();
    }

    // Endpoint simulant un traitement long
    @GetMapping("/process-heavy")
    public String processHeavy() {
        logger.debug("Requête reçue sur /process-heavy");
        return service.processHeavy();
    }

    // Endpoint simulant une erreur
    @GetMapping("/process-error")
    public String processError() {
        logger.warn("Requête reçue sur /process-error");
        return service.processError();
    }
}
