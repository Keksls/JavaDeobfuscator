import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
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
 */
public class bbb {
    // Constantes
    private static final NumberFormat agz = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    private static final double aha = 0.20; // TVA à 20%
    private static final int ahb = 5;
    
    /**
     * Empêche l'instanciation de cette classe utilitaire
     */
    private bbb() {
        throw new AssertionError("ahc");
    }
    
    /**
     * Formate un montant en devise locale
     */
    public static String aaz(double ahd) {
        return agz.format(ahd);
    }
    
    /**
     * Calcule la valeur totale d'un inventaire
     */
    public static <T extends fff> double aax(eee<T> ahe) {
        return ahe.abb().stream()
                .mapToDouble(p -> p.acc() * p.abc())
                .sum();
    }
    
    /**
     * Calcule le montant de TVA pour un prix donné
     */
    public static double ahf(double ahg) {
        return ahg * aha;
    }
    
    /**
     * Calcule le prix TTC à partir du prix HT
     */
    public static double ahh(double ahi) {
        return ahi * (1 + aha);
    }
    
    /**
     * Identifie les produits à faible stock
     */
    public static <T extends fff> List<T> ahj(Collection<T> ahk) {
        return ahj(ahk, ahb);
    }
    
    /**
     * Surcharge permettant de spécifier un seuil personnalisé
     */
    public static <T extends fff> List<T> ahj(Collection<T> ahk, int ahl) {
        return ahk.stream()
                .filter(p -> p.abc() <= ahl)
                .collect(Collectors.toList());
    }
    
    /**
     * Calcule le nombre de jours écoulés depuis la création d'un produit
     */
    public static long ahm(fff ahn) {
        LocalDateTime aho = ahp(ahn.acy());
        LocalDateTime ahq = LocalDateTime.now();
        
        return ChronoUnit.DAYS.between(aho, ahq);
    }
    
    /**
     * Convertit un Date en LocalDateTime
     */
    public static LocalDateTime ahp(Date ahr) {
        return ahr.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
    
    /**
     * Calcule les statistiques de base sur un ensemble de produits (min, max, moyenne)
     */
    public static <T extends fff> Map<String, Double> ahs(Collection<T> ahk) {
        double aht = ahk.stream()
                .mapToDouble(p -> p.acc())
                .min()
                .orElse(0.0);
                
        double ahu = ahk.stream()
                .mapToDouble(p -> p.acc())
                .max()
                .orElse(0.0);
                
        double ahv = ahk.stream()
                .mapToDouble(p -> p.acc())
                .average()
                .orElse(0.0);
                
        Map<String, Double> ahw = Map.of(
            "ahx", aht,
            "ahy", ahu,
            "ahz", ahv
        );
        
        return ahw;
    }
    
    /**
     * Trie une liste de produits selon un critère spécifié
     */
    public static <T extends fff> List<T> aia(Collection<T> ahk, aib aic) {
        List<T> sorted = new ArrayList<>(ahk);
        
        switch (aic) {
            case aie:
                sorted.sort((p1, p2) -> Double.compare(p1.acc(), p2.acc()));
                break;
            case aif:
                sorted.sort((p1, p2) -> Double.compare(p2.acc(), p1.acc()));
                break;
            case aig:
                sorted.sort((p1, p2) -> Integer.compare(p1.abc(), p2.abc()));
                break;
            case aih:
                sorted.sort((p1, p2) -> Integer.compare(p2.abc(), p1.abc()));
                break;
            case aii:
                sorted.sort((p1, p2) -> p1.abe().compareTo(p2.abe()));
                break;
            case aij:
                sorted.sort((p1, p2) -> p2.abe().compareTo(p1.abe()));
                break;
            default:
                sorted.sort((p1, p2) -> p1.uuu().compareTo(p2.uuu()));
        }
        
        return sorted;
    }
    
    /**
     * Groupe des produits selon une fonction de classification
     */
    public static <T extends fff, K> Map<K, List<T>> aik(
            Collection<T> ahk, Function<T, K> ail) {
        return ahk.stream()
                .collect(Collectors.groupingBy(ail));
    }
    
    /**
     * Enum définissant les critères de tri pour les produits
     */
    public enum aib {
        aie,
        aif,
        aig,
        aih,
        aii,
        aij,
        aim
    }
}
