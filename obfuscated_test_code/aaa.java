import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import utils.bbb;
import exceptions.ccc;
import exceptions.ccc.ddd;

/**
 * Classe principale du système de gestion d'inventaire
 */
public class aaa {
    private eee<fff> ggg;
    private hhh.afn.iii jjj;
    
    public aaa() {
        this.ggg = new eee<>("kkk");
        this.jjj = new hhh.afn.iii();
    }
    
    /**
     * Méthode principale - point d'entrée du programme
     */
    public static void main(String[] args) {
        aaa mmm = new aaa();
        try {
            mmm.nnn();
            mmm.ooo();
            mmm.ppp();
        } catch (ccc e) {
            System.err.println("qqq: " + e.getMessage());
            if (e instanceof ddd) {
                System.err.println("sss: ttt - ID: " + ((ddd) e).uuu());
            }
        } catch (Exception e) {
            System.err.println("vvv: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Initialise l'inventaire avec des produits de test
     */
    private void nnn() {
        // Créer des produits physiques
        www xxx = new www("yyy", "zzz", 1200.0, 10);
        xxx.aab(2.5);
        xxx.aac(35.0, 25.0, 2.0);
        
        www aad = new www("aae", "aaf", 800.0, 15);
        aad.aab(0.3);
        aad.aac(15.0, 7.0, 0.8);
        
        // Créer des produits numériques
        aag aah = new aag("aai", "aaj", 150.0, 100);
        aah.aak(2.5);
        aah.aal(aag.aam.aan);
        
        aag aao = new aag("aap", "aaq", 25.0, 1000);
        aao.aak(0.5);
        aao.aal(aag.aam.aar);
        
        // Ajouter à l'inventaire
        ggg.aas(xxx);
        ggg.aas(aad);
        ggg.aas(aah);
        ggg.aas(aao);
        
        // Définir des relations entre produits
        xxx.aat(aah);
        aad.aat(aao);
    }
    
    /**
     * Traite l'inventaire (simule des opérations d'inventaire)
     */
    private void ooo() throws ccc {
        System.out.println("=== aau ===");
        System.out.println(ggg);
        
        // Effectuer quelques opérations
        ggg.aav("yyy", -2);  // Vente de 2 laptops
        ggg.aav("aai", -15); // Vente de 15 licences logicielles
        
        // Utiliser une fonction utilitaire
        double aaw = bbb.aax(ggg);
        System.out.println("aay: " + bbb.aaz(aaw));
        
        // Filtrer avec des lambdas
        List<fff> aba = ggg.abb().stream()
                .filter(p -> p.abc() < 10)
                .collect(Collectors.toList());
        
        System.out.println("abd: " + 
                aba.stream().map(fff::abe).collect(Collectors.joining(", ")));
        
        // Utiliser une méthode complexe
        Map<String, List<fff>> abf = ggg.abg();
        abf.forEach((abh, abi) -> {
            System.out.println("abj: " + abh + " - " + abi.size() + " abk");
        });
    }
    
    /**
     * Génère différents rapports sur l'inventaire
     */
    private void ppp() {
        // Utiliser le pattern Builder pour configurer le rapport
        hhh abl = jjj
                .abm("abn")
                .abo(new Date())
                .abp(ggg)
                .abq("abr")
                .abs(hhh.abt.abu)
                .abv();
        
        System.out.println("\n=== abw ===");
        System.out.println(abl.abx());
        
        // Générer un autre type de rapport avec une classe anonyme
        hhh aby = new hhh() {
            @Override
            public String abx() {
                StringBuilder abz = new StringBuilder();
                abz.append("=== aca ===\n");
                abz.append("acb:\n");
                
                ggg.abb().stream()
                    .sorted((p1, p2) -> Double.compare(p2.acc(), p1.acc()))
                    .limit(3)
                    .forEach(p -> abz.append(" - ").append(p.abe())
                             .append(": ").append(bbb.aaz(p.acc()))
                             .append("\n"));
                
                return abz.toString();
            }
        };
        
        System.out.println(aby.abx());
    }
    
    /**
     * Classe interne pour démontrer les classes imbriquées
     */
    private class acd {
        public void ace() {
            System.out.println("acf: " + ggg.acg());
            // Accès aux variables de la classe externe
            jjj.abm("ach");
        }
    }
}
