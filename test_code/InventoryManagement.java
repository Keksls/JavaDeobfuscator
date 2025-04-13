import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import utils.InventoryUtils;
import exceptions.InventoryException;
import exceptions.InventoryException.ProductNotFoundException;

/**
 * Classe principale du système de gestion d'inventaire
 * Démontre l'utilisation de classes complexes, d'imports variés,
 * et de méthodes qui interagissent entre elles.
 */
public class InventoryManagement {
    private Inventory<Product> mainInventory;
    private Report.Builder reportBuilder;
    
    public InventoryManagement() {
        this.mainInventory = new Inventory<>("Main Warehouse");
        this.reportBuilder = new Report.Builder();
    }
    
    /**
     * Méthode principale - point d'entrée du programme
     */
    public static void main(String[] args) {
        InventoryManagement manager = new InventoryManagement();
        try {
            manager.initializeInventory();
            manager.processInventory();
            manager.generateReports();
        } catch (InventoryException e) {
            System.err.println("Erreur d'inventaire: " + e.getMessage());
            if (e instanceof ProductNotFoundException) {
                System.err.println("Détails: Produit non trouvé - ID: " + ((ProductNotFoundException) e).getProductId());
            }
        } catch (Exception e) {
            System.err.println("Erreur générale: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Initialise l'inventaire avec des produits de test
     */
    private void initializeInventory() {
        // Créer des produits physiques
        PhysicalProduct laptop = new PhysicalProduct("P001", "Laptop Pro X", 1200.0, 10);
        laptop.setWeight(2.5);
        laptop.setDimensions(35.0, 25.0, 2.0);
        
        PhysicalProduct smartphone = new PhysicalProduct("P002", "Smartphone Ultra", 800.0, 15);
        smartphone.setWeight(0.3);
        smartphone.setDimensions(15.0, 7.0, 0.8);
        
        // Créer des produits numériques
        DigitalProduct software = new DigitalProduct("D001", "Logiciel d'édition", 150.0, 100);
        software.setDownloadSize(2.5);
        software.setLicenseType(DigitalProduct.LicenseType.SUBSCRIPTION);
        
        DigitalProduct ebook = new DigitalProduct("D002", "Guide de programmation", 25.0, 1000);
        ebook.setDownloadSize(0.5);
        ebook.setLicenseType(DigitalProduct.LicenseType.PERPETUAL);
        
        // Ajouter à l'inventaire
        mainInventory.addProduct(laptop);
        mainInventory.addProduct(smartphone);
        mainInventory.addProduct(software);
        mainInventory.addProduct(ebook);
        
        // Définir des relations entre produits (accessoires, etc.)
        laptop.addRelatedProduct(software);
        smartphone.addRelatedProduct(ebook);
    }
    
    /**
     * Traite l'inventaire (simule des opérations d'inventaire)
     */
    private void processInventory() throws InventoryException {
        System.out.println("=== État initial de l'inventaire ===");
        System.out.println(mainInventory);
        
        // Effectuer quelques opérations
        mainInventory.updateStock("P001", -2);  // Vente de 2 laptops
        mainInventory.updateStock("D001", -15); // Vente de 15 licences logicielles
        
        // Utiliser une fonction utilitaire
        double totalValue = InventoryUtils.calculateInventoryValue(mainInventory);
        System.out.println("Valeur totale de l'inventaire: " + InventoryUtils.formatCurrency(totalValue));
        
        // Filtrer avec des lambdas
        List<Product> lowStockProducts = mainInventory.getProducts().stream()
                .filter(p -> p.getStock() < 10)
                .collect(Collectors.toList());
        
        System.out.println("Produits à faible stock: " + 
                lowStockProducts.stream().map(Product::getName).collect(Collectors.joining(", ")));
        
        // Utiliser une méthode complexe
        Map<String, List<Product>> categorizedProducts = mainInventory.categorizeProducts();
        categorizedProducts.forEach((category, products) -> {
            System.out.println("Catégorie: " + category + " - " + products.size() + " produits");
        });
    }
    
    /**
     * Génère différents rapports sur l'inventaire
     */
    private void generateReports() {
        // Utiliser le pattern Builder pour configurer le rapport
        Report inventoryReport = reportBuilder
                .withTitle("Rapport d'inventaire")
                .withDate(new Date())
                .withInventory(mainInventory)
                .withCreator("Système automatique")
                .withDetailLevel(Report.DetailLevel.COMPLETE)
                .build();
        
        System.out.println("\n=== Rapport généré ===");
        System.out.println(inventoryReport.generate());
        
        // Générer un autre type de rapport avec une classe anonyme
        Report customReport = new Report() {
            @Override
            public String generate() {
                StringBuilder sb = new StringBuilder();
                sb.append("=== RAPPORT PERSONNALISÉ ===\n");
                sb.append("Produits les plus chers:\n");
                
                mainInventory.getProducts().stream()
                    .sorted((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()))
                    .limit(3)
                    .forEach(p -> sb.append(" - ").append(p.getName())
                             .append(": ").append(InventoryUtils.formatCurrency(p.getPrice()))
                             .append("\n"));
                
                return sb.toString();
            }
        };
        
        System.out.println(customReport.generate());
    }
    
    /**
     * Classe interne pour démontrer les classes imbriquées
     */
    private class InventoryAnalyzer {
        public void analyzeInventory() {
            System.out.println("Analyse de l'inventaire: " + mainInventory.getName());
            // Accès aux variables de la classe externe
            reportBuilder.withTitle("Analyse détaillée");
        }
    }
}
