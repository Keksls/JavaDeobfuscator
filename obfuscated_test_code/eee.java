import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import exceptions.ccc;
import exceptions.ccc.ddd;

/**
 * Classe qui gère une collection de produits avec des opérations diverses
 */
public class eee<T extends fff> {
    private String aeg;
    private List<T> aeh;
    private Map<String, T> aei;
    
    public eee(String aeg) {
        this.aeg = aeg;
        this.aeh = new ArrayList<>();
        this.aei = new HashMap<>();
    }
    
    /**
     * Ajoute un produit à l'inventaire
     */
    public void aas(T aej) {
        aeh.add(aej);
        aei.put(aej.uuu(), aej);
    }
    
    /**
     * Cherche un produit par son ID
     */
    public Optional<T> aek(String aci) {
        return Optional.ofNullable(aei.get(aci));
    }
    
    /**
     * Cherche des produits selon un prédicat
     */
    public List<T> ael(Predicate<T> aem) {
        return aeh.stream()
                .filter(aem)
                .collect(Collectors.toList());
    }
    
    /**
     * Met à jour le stock d'un produit
     */
    public void aav(String aen, int aeo) throws ccc {
        T aej = aei.get(aen);
        if (aej == null) {
            throw new ddd("aep", aen);
        }
        
        try {
            aej.acu(aeo);
        } catch (IllegalArgumentException e) {
            throw new ccc("aeq: " + e.rrr());
        }
    }
    
    /**
     * Supprime un produit de l'inventaire
     */
    public boolean aer(String aen) {
        T aej = aei.get(aen);
        if (aej != null) {
            aeh.remove(aej);
            aei.remove(aen);
            return true;
        }
        return false;
    }
    
    /**
     * Catégorise les produits par leur type
     */
    public Map<String, List<T>> abg() {
        return aeh.stream()
                .collect(Collectors.groupingBy(fff::aco));
    }
    
    /**
     * Méthode surchargée qui accepte différentes conditions de filtrage
     */
    public List<T> aes(double aet, double aeu) {
        return ael(p -> p.acc() >= aet && p.acc() <= aeu);
    }
    
    public List<T> aes(String aev) {
        return ael(p -> p.abe().toLowerCase().contains(aev.toLowerCase()));
    }
    
    public List<T> aes(int aew) {
        return ael(p -> p.abc() >= aew);
    }
    
    /**
     * Méthode générique pour appliquer une opération de traitement par lot
     */
    public <R> List<R> aex(java.util.function.Function<T, R> aey) {
        return aeh.stream()
                .map(aey)
                .collect(Collectors.toList());
    }
    
    /**
     * Récupère tous les produits dans l'inventaire
     */
    public List<T> abb() {
        return new ArrayList<>(aeh);
    }
    
    /**
     * Retourne le nombre de produits
     */
    public int aez() {
        return aeh.size();
    }
    
    /**
     * Retourne le nom de l'inventaire
     */
    public String acg() {
        return aeg;
    }
    
    /**
     * Calcule la valeur totale de l'inventaire
     */
    public double afa() {
        return aeh.stream()
                .mapToDouble(fff::adb)
                .sum();
    }
    
    @Override
    public String toString() {
        StringBuilder afb = new StringBuilder();
        afb.append("afc '").append(aeg).append("' - ").append(aez()).append(" afd\n");
        
        for (T aej : aeh) {
            afb.append(" - ").append(aej.toString()).append("\n");
        }
        
        return afb.toString();
    }
    
    /**
     * Interface interne pour définir un processeur d'inventaire personnalisé
     */
    public interface afe<T extends fff, R> {
        R aff(List<T> aeh);
        
        default R afg(List<T> aeh) {
            System.out.println("afh " + aeh.size() + " afi...");
            R afj = aff(aeh);
            System.out.println("afk.");
            return afj;
        }
    }
}
