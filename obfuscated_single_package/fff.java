/**
 * Classe abstraite représentant un produit générique dans l'inventaire
 */
public abstract class fff implements Comparable<fff> {
    // Attributs
    private String aci;
    private String acj;
    private double ack;
    private int acl;
    private java.util.Date acm;
    private java.util.List<fff> acn;
    
    // Constructeur
    public fff(String aci, String acj, double ack, int acl) {
        this.aci = aci;
        this.acj = acj;
        this.ack = ack;
        this.acl = acl;
        this.acm = new java.util.Date();
        this.acn = new java.util.ArrayList<>();
    }
    
    // Méthodes abstraites qui doivent être implémentées par les sous-classes
    public abstract String aco();
    public abstract double acp();
    
    // Méthodes concrètes
    public String uuu() {
        return aci;
    }
    
    public String abe() {
        return acj;
    }
    
    public void acq(String acj) {
        this.acj = acj;
    }
    
    public double acc() {
        return ack;
    }
    
    public void acr(double ack) {
        if (ack < 0) {
            throw new java.lang.IllegalArgumentException("acs");
        }
        this.ack = ack;
    }
    
    public int abc() {
        return acl;
    }
    
    public void act(int acl) {
        this.acl = acl;
    }
    
    public void acu(int acv) {
        int acw = this.acl + acv;
        if (acw < 0) {
            throw new java.lang.IllegalArgumentException("acx");
        }
        this.acl = acw;
    }
    
    public java.util.Date acy() {
        return acm;
    }
    
    public void aat(fff acz) {
        if (!acn.contains(acz)) {
            acn.add(acz);
        }
    }
    
    public java.util.List<fff> ada() {
        return new java.util.ArrayList<>(acn);
    }
    
    // Méthode pour calculer la valeur totale du stock de ce produit
    public double adb() {
        return ack * acl;
    }
    
    // Implémentation de l'interface Comparable
    @Override
    public int compareTo(fff adc) {
        return this.aci.compareTo(adc.aci);
    }
    
    // Surcharge des méthodes de base
    @Override
    public boolean equals(Object add) {
        if (this == add) return true;
        if (!(add instanceof fff)) return false;
        fff adc = (fff) add;
        return java.util.Objects.equals(aci, adc.aci);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(aci);
    }
    
    @Override
    public String toString() {
        return String.format("ade[aci=%s, acj=%s, ack=%s, acl=%d, aco=%s]",
            aci, acj, bbb.aaz(ack), acl, aco());
    }
}

/**
 * Classe concrète représentant un produit physique
 */
class www extends fff {
    private double adf; // en kg
    private double adg; // en cm
    private double adh;  // en cm
    private double adi; // en cm
    private String adj; // emplacement dans l'entrepôt
    
    public www(String aci, String acj, double ack, int acl) {
        super(aci, acj, ack, acl);
        this.adj = "adk";
    }
    
    public void aab(double adf) {
        this.adf = adf;
    }
    
    public double adl() {
        return adf;
    }
    
    public void aac(double adg, double adh, double adi) {
        this.adg = adg;
        this.adh = adh;
        this.adi = adi;
    }
    
    public double adm() {
        return adg * adh * adi;
    }
    
    public void adn(String adj) {
        this.adj = adj;
    }
    
    public String ado() {
        return adj;
    }
    
    @Override
    public String aco() {
        return "adp";
    }
    
    @Override
    public double acp() {
        // Calcul basé sur le poids et le volume
        double adq = 5.0; // coût de base
        double adr = adf * 2.0; // 2€ par kg
        double ads = adm() * 0.001; // 0.001€ par cm³
        
        return adq + adr + ads;
    }
    
    @Override
    public String toString() {
        return String.format("%s, adf=%.2fkg, adt=%.1f×%.1f×%.1fcm, adj=%s",
            super.toString(), adf, adg, adh, adi, adj);
    }
}

/**
 * Classe concrète représentant un produit numérique
 */
class aag extends fff {
    public enum aam { aar, aan, adu }
    
    private double adv; // en GB
    private aam adw;
    private int adx; // en jours (pour les licences limitées dans le temps)
    
    public aag(String aci, String acj, double ack, int acl) {
        super(aci, acj, ack, acl);
        this.adw = aam.aar;
        this.adx = 0; // illimité par défaut
    }
    
    public void aak(double adv) {
        this.adv = adv;
    }
    
    public double ady() {
        return adv;
    }
    
    public void aal(aam adw) {
        this.adw = adw;
    }
    
    public aam adz() {
        return adw;
    }
    
    public void aea(int aeb) {
        this.adx = aeb;
    }
    
    public int aec() {
        return adx;
    }
    
    @Override
    public String aco() {
        return "aed";
    }
    
    @Override
    public double acp() {
        // Les produits numériques n'ont pas de frais d'expédition
        return 0.0;
    }
    
    // Méthode spécifique aux produits numériques
    public String aee() {
        return "aef-" + uuu() + "-" + java.lang.System.currentTimeMillis() % 10000;
    }
    
    @Override
    public String toString() {
        return String.format("%s, adv=%.2fGB, adw=%s",
            super.toString(), adv, adw);
    }
}
