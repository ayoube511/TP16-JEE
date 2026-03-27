# 📊 TP8 – Monitoring & Logging avec Spring Boot

## 🚀 Objectif

Ce projet a pour objectif de mettre en place une solution complète de **monitoring et logging** pour une application Spring Boot, en utilisant des outils modernes du monde DevOps.

L'application permet de :
- Exposer des métriques système (CPU, mémoire, requêtes HTTP)
- Surveiller l’état de santé de l’application
- Générer des logs structurés
- Exporter les métriques vers Prometheus
- Visualiser les données avec Grafana

---

## 🧱 Technologies utilisées

- Spring Boot
- Spring Boot Actuator
- Micrometer
- Prometheus
- Grafana
- Docker (optionnel)

---

## 📁 Structure du projet
src/main/java/ma/ens/tp8monitoring
├── Tp8MonitoringApplication.java
├── controller/
│ └── DemoController.java
├── service/
│ └── DemoService.java
└── config/
└── LoggingConfig.java


---

## ▶️ Lancement de l’application

<img width="1920" height="1080" alt="Capture d’écran (354)" src="https://github.com/user-attachments/assets/3d1b2953-dabf-46ec-8086-42569c4c7724" />
<img width="1920" height="1080" alt="Capture d’écran (354)" src="https://github.com/user-attachments/assets/b9912403-b07c-4a0e-9efb-0c7b8fb34e30" />
<img width="1919" height="466" alt="Capture d&#39;écran 2026-03-26 231432" src="https://github.com/user-attachments/assets/714238ed-a50e-4a36-ad54-b1894ba0df80" />
<img width="1919" height="1023" alt="Capture d&#39;écran 2026-03-26 231532" src="https://github.com/user-attachments/assets/6e7fdabb-aa0f-4d28-a5d8-f2f2205f9d16" />
<img width="1919" height="409" alt="Capture d&#39;écran 2026-03-26 232201" src="https://github.com/user-attachments/assets/72af677a-5d93-412b-9d05-d3963af43543" />

## 📡 Prometheus

<img width="1914" height="745" alt="Capture d&#39;écran 2026-03-27 000529" src="https://github.com/user-attachments/assets/f8647545-26a3-4975-9469-ec17b3e0b586" />
<img width="1919" height="652" alt="Capture d&#39;écran 2026-03-27 000922" src="https://github.com/user-attachments/assets/b1c4397b-104b-4fb9-9b94-138e30894f4d" />
<img width="1918" height="1028" alt="Capture d&#39;écran 2026-03-27 002033" src="https://github.com/user-attachments/assets/93c933ae-ec34-4151-8682-0f1fe9bbd4c5" />
<img width="1919" height="891" alt="Capture d&#39;écran 2026-03-27 003015" src="https://github.com/user-attachments/assets/95da42cc-de31-49c9-b5ba-635e2b362784" />
<img width="1919" height="874" alt="Capture d&#39;écran 2026-03-27 003953" src="https://github.com/user-attachments/assets/e14a45e8-b5a0-4b6e-9df1-c25de535f356" />
<img width="1919" height="1033" alt="Capture d&#39;écran 2026-03-27 122541" src="https://github.com/user-attachments/assets/8ea89589-2987-4120-b957-0b15db9b8da8" />

## 📊 Grafana

<img width="1918" height="1027" alt="Capture d&#39;écran 2026-03-27 214643" src="https://github.com/user-attachments/assets/ab562c90-7d21-4709-b2ae-cc2aa26d472a" />
<img width="1919" height="1027" alt="Capture d&#39;écran 2026-03-27 195807" src="https://github.com/user-attachments/assets/862f24a7-070b-4850-9f33-d103ca28cd57" />
<img width="1919" height="1027" alt="Capture d&#39;écran 2026-03-27 200314" src="https://github.com/user-attachments/assets/9fccd162-f9f7-45e9-a408-053fc5a2fde0" />


🧠 Bonnes pratiques
Centraliser les logs (ELK / Loki)
Utiliser des noms cohérents pour les métriques
Adapter le scrape_interval
Sécuriser les endpoints Actuator
Mettre en place des alertes
🎯 Compétences acquises
Monitoring avec Spring Boot Actuator
Export des métriques avec Prometheus
Visualisation avec Grafana
Logging structuré
Introduction au DevOps / SRE
🏁 Conclusion

Ce projet permet de transformer une application Spring Boot en une application observable, surveillée et prête pour la production grâce à une stack moderne de monitoring.
