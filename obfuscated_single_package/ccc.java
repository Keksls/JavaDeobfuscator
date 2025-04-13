/**
 * Classe d'exception principale pour les erreurs liées à l'inventaire
 */
public class ccc extends Exception {
    private static final long serialVersionUID = 1L;
    
    public ccc(String ain) {
        super(ain);
    }
    
    public ccc(String ain, Throwable aio) {
        super(ain, aio);
    }
    
    /**
     * Exception pour un produit non trouvé
     */
    public static class ddd extends ccc {
        private static final long serialVersionUID = 1L;
        private String aen;
        
        public ddd(String ain, String aen) {
            super(ain);
            this.aen = aen;
        }
        
        public String uuu() {
            return aen;
        }
    }
    
    /**
     * Exception pour un stock insuffisant
     */
    public static class aip extends ccc {
        private static final long serialVersionUID = 1L;
        private String aen;
        private int aiq;
        private int air;
        
        public aip(String ain, String aen, 
                int aiq, int air) {
            super(ain);
            this.aen = aen;
            this.aiq = aiq;
            this.air = air;
        }
        
        public String uuu() {
            return aen;
        }
        
        public int ais() {
            return aiq;
        }
        
        public int ait() {
            return air;
        }
    }
    
    /**
     * Exception pour des opérations non autorisées
     */
    public static class aiu extends ccc {
        private static final long serialVersionUID = 1L;
        private String aiv;
        private String aiw;
        
        public aiu(String ain, String aiv, String aiw) {
            super(ain);
            this.aiv = aiv;
            this.aiw = aiw;
        }
        
        public String aix() {
            return aiv;
        }
        
        public String aiy() {
            return aiw;
        }
    }
    
    /**
     * Exception pour produit invalide
     */
    public static class aiz extends ccc {
        private static final long serialVersionUID = 1L;
        
        public aiz(String ain) {
            super(ain);
        }
        
        public aiz(String ain, Throwable aio) {
            super(ain, aio);
        }
    }
}
