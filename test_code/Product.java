import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import utils.InventoryUtils;

/**
 * Classe abstraite représentant un produit générique dans l'inventaire.
 * Cette classe démontre l'héritage, l'abstraction, et les méthodes virtuelles.
 */
public abstract class Product implements Comparable<Product> {
    // Attributs
    private String id;
    private String name;
    private double price;
    private int stock;
    private Date createdDate;
    private List<Product> relatedProducts;
    
    // Constructeur
    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.createdDate = new Date();
        this.relatedProducts = new ArrayList<>();
    }
    
    // Méthodes abstraites qui doivent être implémentées par les sous-classes
    public abstract String getCategory();
    public abstract double calculateShippingCost();
    
    // Méthodes concrètes
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Le prix ne peut pas être négatif");
        }
        this.price = price;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void updateStock(int quantity) {
        int newStock = this.stock + quantity;
        if (newStock < 0) {
            throw new IllegalArgumentException("Stock insuffisant");
        }
        this.stock = newStock;
    }
    
    public Date getCreatedDate() {
        return createdDate;
    }
    
    public void addRelatedProduct(Product product) {
        if (!relatedProducts.contains(product)) {
            relatedProducts.add(product);
        }
    }
    
    public List<Product> getRelatedProducts() {
        return new ArrayList<>(relatedProducts);
    }
    
    // Méthode pour calculer la valeur totale du stock de ce produit
    public double getTotalValue() {
        return price * stock;
    }
    
    // Implémentation de l'interface Comparable
    @Override
    public int compareTo(Product other) {
        return this.id.compareTo(other.id);
    }
    
    // Surcharge des méthodes de base
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return Objects.equals(id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return String.format("Produit[id=%s, nom=%s, prix=%s, stock=%d, catégorie=%s]",
            id, name, InventoryUtils.formatCurrency(price), stock, getCategory());
    }
}

/**
 * Classe concrète représentant un produit physique
 */
class PhysicalProduct extends Product {
    private double weight; // en kg
    private double length; // en cm
    private double width;  // en cm
    private double height; // en cm
    private String location; // emplacement dans l'entrepôt
    
    public PhysicalProduct(String id, String name, double price, int stock) {
        super(id, name, price, stock);
        this.location = "Non assigné";
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setDimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public double getVolume() {
        return length * width * height;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return location;
    }
    
    @Override
    public String getCategory() {
        return "Physique";
    }
    
    @Override
    public double calculateShippingCost() {
        // Calcul basé sur le poids et le volume
        double baseCost = 5.0; // coût de base
        double weightCost = weight * 2.0; // 2€ par kg
        double volumeCost = getVolume() * 0.001; // 0.001€ par cm³
        
        return baseCost + weightCost + volumeCost;
    }
    
    @Override
    public String toString() {
        return String.format("%s, poids=%.2fkg, dimensions=%.1f×%.1f×%.1fcm, emplacement=%s",
            super.toString(), weight, length, width, height, location);
    }
}

/**
 * Classe concrète représentant un produit numérique
 */
class DigitalProduct extends Product {
    public enum LicenseType { PERPETUAL, SUBSCRIPTION, TIME_LIMITED }
    
    private double downloadSize; // en GB
    private LicenseType licenseType;
    private int validityPeriod; // en jours (pour les licences limitées dans le temps)
    
    public DigitalProduct(String id, String name, double price, int stock) {
        super(id, name, price, stock);
        this.licenseType = LicenseType.PERPETUAL;
        this.validityPeriod = 0; // illimité par défaut
    }
    
    public void setDownloadSize(double downloadSize) {
        this.downloadSize = downloadSize;
    }
    
    public double getDownloadSize() {
        return downloadSize;
    }
    
    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }
    
    public LicenseType getLicenseType() {
        return licenseType;
    }
    
    public void setValidityPeriod(int days) {
        this.validityPeriod = days;
    }
    
    public int getValidityPeriod() {
        return validityPeriod;
    }
    
    @Override
    public String getCategory() {
        return "Numérique";
    }
    
    @Override
    public double calculateShippingCost() {
        // Les produits numériques n'ont pas de frais d'expédition
        return 0.0;
    }
    
    // Méthode spécifique aux produits numériques
    public String generateLicenseKey() {
        return "LICENSE-" + getId() + "-" + System.currentTimeMillis() % 10000;
    }
    
    @Override
    public String toString() {
        return String.format("%s, taille=%.2fGB, licence=%s",
            super.toString(), downloadSize, licenseType);
    }
}
