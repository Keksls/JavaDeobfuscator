import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;

/**
 * Interface pour les rapports d'inventaire
 * Démontre l'utilisation d'interfaces, de classes internes,
 * et du pattern Builder
 */
public interface Report {
    String generate();
    
    /**
     * Niveaux de détail pour les rapports
     */
    enum DetailLevel {
        SUMMARY,
        STANDARD,
        COMPLETE
    }
    
    /**
     * Implémentation concrète du rapport standard
     */
    class StandardReport implements Report {
        private String title;
        private Date reportDate;
        private Inventory<?> inventory;
        private String creator;
        private DetailLevel detailLevel;
        
        // Constructeur privé - utilisé seulement par le Builder
        private StandardReport() {
            this.reportDate = new Date();
            this.detailLevel = DetailLevel.STANDARD;
        }
        
        @Override
        public String generate() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            StringBuilder sb = new StringBuilder();
            
            // En-tête
            sb.append("=== ").append(title).append(" ===\n");
            sb.append("Date: ").append(dateFormat.format(reportDate)).append("\n");
            sb.append("Créé par: ").append(creator).append("\n");
            sb.append("Niveau de détail: ").append(detailLevel).append("\n\n");
            
            // Résumé de l'inventaire
            sb.append("Inventaire: ").append(inventory.getName()).append("\n");
            sb.append("Nombre de produits: ").append(inventory.getProductCount()).append("\n");
            sb.append("Valeur totale: ").append(utils.InventoryUtils.formatCurrency(inventory.getTotalValue())).append("\n\n");
            
            // Liste des produits selon le niveau de détail
            if (detailLevel != DetailLevel.SUMMARY) {
                sb.append("Liste des produits:\n");
                
                for (Product product : inventory.getProducts()) {
                    sb.append(" - ").append(product.getId()).append(": ").append(product.getName());
                    
                    if (detailLevel == DetailLevel.COMPLETE) {
                        sb.append(", Prix: ").append(utils.InventoryUtils.formatCurrency(product.getPrice()));
                        sb.append(", Stock: ").append(product.getStock());
                        sb.append(", Catégorie: ").append(product.getCategory());
                    }
                    
                    sb.append("\n");
                }
                
                // Statistiques supplémentaires pour le niveau complet
                if (detailLevel == DetailLevel.COMPLETE) {
                    sb.append("\nStatistiques:\n");
                    
                    // Produit le plus cher
                    Product mostExpensive = inventory.getProducts().stream()
                            .max((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                            .orElse(null);
                    
                    if (mostExpensive != null) {
                        sb.append(" - Produit le plus cher: ").append(mostExpensive.getName())
                          .append(" (").append(utils.InventoryUtils.formatCurrency(mostExpensive.getPrice())).append(")\n");
                    }
                    
                    // Produit avec le plus de stock
                    Product mostInStock = inventory.getProducts().stream()
                            .max((p1, p2) -> Integer.compare(p1.getStock(), p2.getStock()))
                            .orElse(null);
                    
                    if (mostInStock != null) {
                        sb.append(" - Produit avec le plus de stock: ").append(mostInStock.getName())
                          .append(" (").append(mostInStock.getStock()).append(" unités)\n");
                    }
                }
            }
            
            return sb.toString();
        }
        
        /**
         * Classe Builder pour construire des rapports
         * Démontre le pattern Builder
         */
        public static class Builder {
            private StandardReport report;
            
            public Builder() {
                report = new StandardReport();
            }
            
            public Builder withTitle(String title) {
                report.title = title;
                return this;
            }
            
            public Builder withDate(Date date) {
                report.reportDate = date;
                return this;
            }
            
            public Builder withInventory(Inventory<?> inventory) {
                report.inventory = inventory;
                return this;
            }
            
            public Builder withCreator(String creator) {
                report.creator = creator;
                return this;
            }
            
            public Builder withDetailLevel(DetailLevel level) {
                report.detailLevel = level;
                return this;
            }
            
            public Report build() {
                if (report.title == null || report.title.isEmpty()) {
                    report.title = "Rapport d'inventaire";
                }
                
                if (report.creator == null || report.creator.isEmpty()) {
                    report.creator = "Système";
                }
                
                if (report.inventory == null) {
                    throw new IllegalStateException("L'inventaire ne peut pas être null");
                }
                
                return report;
            }
        }
    }
    
    /**
     * Méthode statique pour créer un rapport personnalisé avec une fonction
     */
    static Report createCustomReport(Function<Inventory<?>, String> generator, Inventory<?> inventory) {
        return () -> generator.apply(inventory);
    }
    
    /**
     * Méthode par défaut qui génère un rapport versionné
     */
    default String generateVersioned(String version) {
        return "Version " + version + "\n" + generate();
    }
    
    /**
     * Classe Builder par défaut pour le rapport standard
     */
    static Builder builder() {
        return new StandardReport.Builder();
    }
}
