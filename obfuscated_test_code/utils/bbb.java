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

// Import des classes externes nécessaires
import utils.eee;
import utils.fff;

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
                .mapToDouble(T::acc)
                .min()
                .orElse(0.0);
                
        double ahu = ahk.stream()
                .mapToDouble(T::acc)
                .max()
                .orElse(0.0);
                
        double ahv = ahk.stream()
                .mapToDouble(T::acc)
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
        Comparator<T> aid = null;
        
        switch (aic) {
            case aie:
                aid = Comparator.comparing(T::acc);
                break;
            case aif:
                aid = Comparator.comparing(T::acc).reversed();
                break;
            case aig:
                aid = Comparator.comparing(T::abc);
                break;
            case aih:
                aid = Comparator.comparing(T::abc).reversed();
                break;
            case aii:
                aid = Comparator.comparing(T::abe);
                break;
            case aij:
                aid = Comparator.comparing(T::abe).reversed();
                break;
            default:
                aid = Comparator.comparing(T::uuu);
        }
        
        return ahk.stream()
                .sorted(aid)
                .collect(Collectors.toList());
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
