/*
 * Decompiled with CFR 0.152.
 */
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/*
 * Renamed from cCL
 */
public class ccl_0
extends flh_0 {
    public static final ccl_0 a = new ccl_0("RSA", eop.b);
    private KeyFactory f;

    public ccl_0(String string, AlgorithmParameterSpec algorithmParameterSpec) {
        super(string, algorithmParameterSpec);
        try {
            this.f = KeyFactory.getInstance(this.c);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            b.fatal((Object)("Algorithme non support\u00e9 : " + this.c), (Throwable)noSuchAlgorithmException);
        }
    }

    public void a(byte[] byArray) {
        try {
            EncodedKeySpec encodedKeySpec = this.d(byArray);
            PublicKey publicKey = this.f.generatePublic(encodedKeySpec);
            this.e.init(1, publicKey);
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            b.fatal((Object)("Spec de clef publique invalide : " + this.c), (Throwable)invalidKeySpecException);
        }
        catch (InvalidKeyException invalidKeyException) {
            b.fatal((Object)("Clef publique invalide : " + this.c), (Throwable)invalidKeyException);
        }
    }

    @Override
    public byte[] b(byte[] byArray) {
        try {
            return this.e.doFinal(byArray);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            b.error((Object)"taille de bloc invalide", (Throwable)illegalBlockSizeException);
        }
        catch (BadPaddingException badPaddingException) {
            b.error((Object)"padding invalide", (Throwable)badPaddingException);
        }
        return null;
    }

    @Override
    public byte[] c(byte[] byArray) {
        throw new UnsupportedOperationException("le client ne doit pas decrypter de donn\u00e9es de connection");
    }
}

