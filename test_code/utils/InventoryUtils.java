package utils;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Classe utilitaire fournissant diverses méthodes de traitement
 * pour les opérations d'inventaire. Cette classe démontre l'utilisation
 * de méthodes statiques, d'imports statiques, et de fonctions utilitaires
 * qui peuvent être utilisées par le reste du système.
 */
public class InventoryUtils {
    // Constantes
    private static final NumberFormat CURRENCY_FORMATTER = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    private static final double VAT_RATE = 0.20; // TVA à 20%
    private static final int DEFAULT_LOW_STOCK_THRESHOLD = 5;
    
    /**
     * Empêche l'instanciation de cette classe utilitaire
     */
    private InventoryUtils() {
        throw new AssertionError("Cette classe utilitaire ne doit pas être instanciée");
    }
    
    /**
     * Formate un montant en devise locale
     */
    public static String formatCurrency(double amount) {
        return CURRENCY_FORMATTER.format(amount);
    }
    
    /**
     * Calcule la valeur totale d'un inventaire
     */
    public static <T extends Product> double calculateInventoryValue(Inventory<T> inventory) {
        return inventory.getProducts().stream()
                .mapToDouble(p -> p.getPrice() * p.getStock())
                .sum();
    }
    
    /**
     * Calcule le montant de TVA pour un prix donné
     */
    public static double calculateVAT(double price) {
        return price * VAT_RATE;
    }
    
    /**
     * Calcule le prix TTC à partir du prix HT
     */
    public static double calculatePriceWithVAT(double priceExcludingVAT) {
        return priceExcludingVAT * (1 + VAT_RATE);
    }
    
    /**
     * Identifie les produits à faible stock
     */
    public static <T extends Product> List<T> findLowStockProducts(Collection<T> products) {
        return findLowStockProducts(products, DEFAULT_LOW_STOCK_THRESHOLD);
    }
    
    /**
     * Surcharge permettant de spécifier un seuil personnalisé
     */
    public static <T extends Product> List<T> findLowStockProducts(Collection<T> products, int threshold) {
        return products.stream()
                .filter(p -> p.getStock() <= threshold)
                .collect(Collectors.toList());
    }
    
    /**
     * Calcule le nombre de jours écoulés depuis la création d'un produit
     */
    public static long getDaysSinceCreation(Product product) {
        LocalDateTime creationDateTime = convertToLocalDateTime(product.getCreatedDate());
        LocalDateTime now = LocalDateTime.now();
        
        return ChronoUnit.DAYS.between(creationDateTime, now);
    }
    
    /**
     * Convertit un Date en LocalDateTime
     */
    public static LocalDateTime convertToLocalDateTime(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
    
    /**
     * Calcule les statistiques de base sur un ensemble de produits (min, max, moyenne)
     */
    public static <T extends Product> Map<String, Double> calculatePriceStatistics(Collection<T> products) {
        double min = products.stream()
                .mapToDouble(Product::getPrice)
                .min()
                .orElse(0.0);
                
        double max = products.stream()
                .mapToDouble(Product::getPrice)
                .max()
                .orElse(0.0);
                
        double avg = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
                
        Map<String, Double> stats = Map.of(
            "min", min,
            "max", max,
            "average", avg
        );
        
        return stats;
    }
    
    /**
     * Trie une liste de produits selon un critère spécifié
     */
    public static <T extends Product> List<T> sortProducts(Collection<T> products, SortCriteria criteria) {
        Comparator<T> comparator = null;
        
        switch (criteria) {
            case PRICE_ASC:
                comparator = Comparator.comparing(Product::getPrice);
                break;
            case PRICE_DESC:
                comparator = Comparator.comparing(Product::getPrice).reversed();
                break;
            case STOCK_ASC:
                comparator = Comparator.comparing(Product::getStock);
                break;
            case STOCK_DESC:
                comparator = Comparator.comparing(Product::getStock).reversed();
                break;
            case NAME_ASC:
                comparator = Comparator.comparing(Product::getName);
                break;
            case NAME_DESC:
                comparator = Comparator.comparing(Product::getName).reversed();
                break;
            default:
                comparator = Comparator.comparing(Product::getId);
        }
        
        return products.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
    
    /**
     * Groupe des produits selon une fonction de classification
     */
    public static <T extends Product, K> Map<K, List<T>> groupProductsBy(
            Collection<T> products, Function<T, K> classifier) {
        return products.stream()
                .collect(Collectors.groupingBy(classifier));
    }
    
    /**
     * Enum définissant les critères de tri pour les produits
     */
    public enum SortCriteria {
        PRICE_ASC,
        PRICE_DESC,
        STOCK_ASC,
        STOCK_DESC,
        NAME_ASC,
        NAME_DESC,
        ID
    }
}
