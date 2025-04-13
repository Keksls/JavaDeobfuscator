import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import exceptions.InventoryException;
import exceptions.InventoryException.ProductNotFoundException;

/**
 * Classe qui gère une collection de produits avec des opérations diverses.
 * Démontre l'utilisation de génériques et de collections avancées.
 */
public class Inventory<T extends Product> {
    private String name;
    private List<T> products;
    private Map<String, T> productIndex;
    
    public Inventory(String name) {
        this.name = name;
        this.products = new ArrayList<>();
        this.productIndex = new HashMap<>();
    }
    
    /**
     * Ajoute un produit à l'inventaire
     */
    public void addProduct(T product) {
        products.add(product);
        productIndex.put(product.getId(), product);
    }
    
    /**
     * Cherche un produit par son ID
     */
    public Optional<T> findProductById(String id) {
        return Optional.ofNullable(productIndex.get(id));
    }
    
    /**
     * Cherche des produits selon un prédicat
     */
    public List<T> findProducts(Predicate<T> condition) {
        return products.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }
    
    /**
     * Met à jour le stock d'un produit
     */
    public void updateStock(String productId, int quantity) throws InventoryException {
        T product = productIndex.get(productId);
        if (product == null) {
            throw new ProductNotFoundException("Produit non trouvé", productId);
        }
        
        try {
            product.updateStock(quantity);
        } catch (IllegalArgumentException e) {
            throw new InventoryException("Erreur de mise à jour du stock: " + e.getMessage());
        }
    }
    
    /**
     * Supprime un produit de l'inventaire
     */
    public boolean removeProduct(String productId) {
        T product = productIndex.get(productId);
        if (product != null) {
            products.remove(product);
            productIndex.remove(productId);
            return true;
        }
        return false;
    }
    
    /**
     * Catégorise les produits par leur type
     */
    public Map<String, List<T>> categorizeProducts() {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }
    
    /**
     * Méthode surchargée qui accepte différentes conditions de filtrage
     */
    public List<T> filterProducts(double minPrice, double maxPrice) {
        return findProducts(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice);
    }
    
    public List<T> filterProducts(String nameSubstring) {
        return findProducts(p -> p.getName().toLowerCase().contains(nameSubstring.toLowerCase()));
    }
    
    public List<T> filterProducts(int minStock) {
        return findProducts(p -> p.getStock() >= minStock);
    }
    
    /**
     * Méthode générique pour appliquer une opération de traitement par lot
     */
    public <R> List<R> processProducts(java.util.function.Function<T, R> processor) {
        return products.stream()
                .map(processor)
                .collect(Collectors.toList());
    }
    
    /**
     * Récupère tous les produits dans l'inventaire
     */
    public List<T> getProducts() {
        return new ArrayList<>(products);
    }
    
    /**
     * Retourne le nombre de produits
     */
    public int getProductCount() {
        return products.size();
    }
    
    /**
     * Retourne le nom de l'inventaire
     */
    public String getName() {
        return name;
    }
    
    /**
     * Calcule la valeur totale de l'inventaire
     */
    public double getTotalValue() {
        return products.stream()
                .mapToDouble(Product::getTotalValue)
                .sum();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inventaire '").append(name).append("' - ").append(getProductCount()).append(" produits\n");
        
        for (T product : products) {
            sb.append(" - ").append(product.toString()).append("\n");
        }
        
        return sb.toString();
    }
    
    /**
     * Interface interne pour définir un processeur d'inventaire personnalisé
     */
    public interface InventoryProcessor<T extends Product, R> {
        R process(List<T> products);
        
        default R processWithLogging(List<T> products) {
            System.out.println("Traitement de " + products.size() + " produits...");
            R result = process(products);
            System.out.println("Traitement terminé.");
            return result;
        }
    }
}
