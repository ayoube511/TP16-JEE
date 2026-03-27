package ma.ens.tp8monitoring.service;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Counter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    private final Counter requestCounter;

    public DemoService(MeterRegistry meterRegistry) {
        // Compteur personnalisé exporté vers Prometheus
        this.requestCounter = Counter.builder("custom.requests.count")
                .description("Nombre de requêtes traitées")
                .register(meterRegistry);
    }

    public String processData() {
        logger.info("Démarrage du traitement des données");

        try {
            Thread.sleep(500); // Simulation d'un traitement
        } catch (InterruptedException e) {
            logger.error("Erreur dans le traitement", e);
            Thread.currentThread().interrupt();
        }

        // Incrémenter le compteur Prometheus
        requestCounter.increment();

        logger.info("Traitement terminé avec succès");
        return "Traitement effectué ✅";
    }

    public String processError() {
        logger.warn("Simulation d'une erreur dans le service");
        logger.error("Erreur simulée pour test de monitoring");
        return "Erreur simulée ❌";
    }

    public String processHeavy() {
        logger.info("Démarrage d'un traitement lourd...");
        try {
            Thread.sleep(2000); // Simulation d'un traitement long
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        requestCounter.increment();
        logger.info("Traitement lourd terminé");
        return "Traitement lourd effectué ✅";
    }
}
