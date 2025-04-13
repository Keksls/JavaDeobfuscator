package exceptions;

/**
 * Classe d'exception principale pour les erreurs liées à l'inventaire.
 * Démontrer l'utilisation d'exceptions personnalisées et de classes internes.
 */
public class InventoryException extends Exception {
    private static final long serialVersionUID = 1L;
    
    public InventoryException(String message) {
        super(message);
    }
    
    public InventoryException(String message, Throwable cause) {
        super(message, cause);
    }
    
    /**
     * Exception pour un produit non trouvé
     */
    public static class ProductNotFoundException extends InventoryException {
        private static final long serialVersionUID = 1L;
        private String productId;
        
        public ProductNotFoundException(String message, String productId) {
            super(message);
            this.productId = productId;
        }
        
        public String getProductId() {
            return productId;
        }
    }
    
    /**
     * Exception pour un stock insuffisant
     */
    public static class InsufficientStockException extends InventoryException {
        private static final long serialVersionUID = 1L;
        private String productId;
        private int requestedQuantity;
        private int availableQuantity;
        
        public InsufficientStockException(String message, String productId, 
                int requestedQuantity, int availableQuantity) {
            super(message);
            this.productId = productId;
            this.requestedQuantity = requestedQuantity;
            this.availableQuantity = availableQuantity;
        }
        
        public String getProductId() {
            return productId;
        }
        
        public int getRequestedQuantity() {
            return requestedQuantity;
        }
        
        public int getAvailableQuantity() {
            return availableQuantity;
        }
    }
    
    /**
     * Exception pour des opérations non autorisées
     */
    public static class UnauthorizedOperationException extends InventoryException {
        private static final long serialVersionUID = 1L;
        private String operation;
        private String username;
        
        public UnauthorizedOperationException(String message, String operation, String username) {
            super(message);
            this.operation = operation;
            this.username = username;
        }
        
        public String getOperation() {
            return operation;
        }
        
        public String getUsername() {
            return username;
        }
    }
    
    /**
     * Exception pour produit invalide
     */
    public static class InvalidProductException extends InventoryException {
        private static final long serialVersionUID = 1L;
        
        public InvalidProductException(String message) {
            super(message);
        }
        
        public InvalidProductException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
