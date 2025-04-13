import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;

/**
 * Interface pour les rapports d'inventaire
 */
public interface hhh {
    String abx();
    
    /**
     * Niveaux de détail pour les rapports
     */
    enum abt {
        afl,
        afm,
        abu
    }
    
    /**
     * Implémentation concrète du rapport standard
     */
    public static class afn implements hhh {
        private String afo;
        private Date afp;
        private eee<?> afq;
        private String afr;
        private abt afs;
        
        // Constructeur privé - utilisé seulement par le Builder
        private afn() {
            this.afp = new Date();
            this.afs = abt.afm;
        }
        
        @Override
        public String abx() {
            SimpleDateFormat aft = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            StringBuilder afb = new StringBuilder();
            
            // En-tête
            afb.append("=== ").append(afo).append(" ===\n");
            afb.append("afu: ").append(aft.format(afp)).append("\n");
            afb.append("afv: ").append(afr).append("\n");
            afb.append("afw: ").append(afs).append("\n\n");
            
            // Résumé de l'inventaire
            afb.append("afc: ").append(afq.acg()).append("\n");
            afb.append("afx: ").append(afq.aez()).append("\n");
            afb.append("afy: ").append(bbb.aaz(afq.afa())).append("\n\n");
            
            // Liste des produits selon le niveau de détail
            if (afs != abt.afl) {
                afb.append("afz:\n");
                
                for (fff aga : afq.abb()) {
                    afb.append(" - ").append(aga.uuu()).append(": ").append(aga.abe());
                    
                    if (afs == abt.abu) {
                        afb.append(", agb: ").append(bbb.aaz(aga.acc()));
                        afb.append(", agc: ").append(aga.abc());
                        afb.append(", agd: ").append(aga.aco());
                    }
                    
                    afb.append("\n");
                }
                
                // Statistiques supplémentaires pour le niveau complet
                if (afs == abt.abu) {
                    afb.append("\nage:\n");
                    
                    // Produit le plus cher
                    fff agf = afq.abb().stream()
                            .max((p1, p2) -> Double.compare(p1.acc(), p2.acc()))
                            .orElse(null);
                    
                    if (agf != null) {
                        afb.append(" - agg: ").append(agf.abe())
                          .append(" (").append(bbb.aaz(agf.acc())).append(")\n");
                    }
                    
                    // Produit avec le plus de stock
                    fff agh = afq.abb().stream()
                            .max((p1, p2) -> Integer.compare(p1.abc(), p2.abc()))
                            .orElse(null);
                    
                    if (agh != null) {
                        afb.append(" - agi: ").append(agh.abe())
                          .append(" (").append(agh.abc()).append(" agj)\n");
                    }
                }
            }
            
            return afb.toString();
        }
        
        /**
         * Classe Builder pour construire des rapports
         */
        public static class iii {
            private afn agk;
            
            public iii() {
                agk = new afn();
            }
            
            public iii abm(String afo) {
                agk.afo = afo;
                return this;
            }
            
            public iii abo(Date agl) {
                agk.afp = agl;
                return this;
            }
            
            public iii abp(eee<?> agm) {
                agk.afq = agm;
                return this;
            }
            
            public iii abq(String agn) {
                agk.afr = agn;
                return this;
            }
            
            public iii abs(abt ago) {
                agk.afs = ago;
                return this;
            }
            
            public hhh abv() {
                if (agk.afo == null || agk.afo.isEmpty()) {
                    agk.afo = "agp";
                }
                
                if (agk.afr == null || agk.afr.isEmpty()) {
                    agk.afr = "agq";
                }
                
                if (agk.afq == null) {
                    throw new IllegalStateException("agr");
                }
                
                return agk;
            }
        }
    }
    
    /**
     * Méthode statique pour créer un rapport personnalisé avec une fonction
     */
    static hhh ags(Function<eee<?>, String> agt, eee<?> agu) {
        return () -> agt.apply(agu);
    }
    
    /**
     * Méthode par défaut qui génère un rapport versionné
     */
    default String agv(String agw) {
        return "agx " + agw + "\n" + abx();
    }
    
    /**
     * Classe Builder par défaut pour le rapport standard
     */
    static afn.iii agy() {
        return new afn.iii();
    }
}
