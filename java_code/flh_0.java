/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.apache.log4j.Logger;

/*
 * Renamed from flH
 */
public abstract class flh_0 {
    protected static final Logger b = Logger.getLogger(flh_0.class);
    protected final String c;
    protected final AlgorithmParameterSpec d;
    protected Cipher e;

    protected flh_0(String string, AlgorithmParameterSpec algorithmParameterSpec) {
        this.c = string;
        this.d = algorithmParameterSpec;
        try {
            this.e = Cipher.getInstance(this.c);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            b.fatal((Object)("Algorithme non support\u00e9 : " + this.c), (Throwable)noSuchAlgorithmException);
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            b.fatal((Object)("Padding non support\u00e9 pour " + this.c), (Throwable)noSuchPaddingException);
        }
    }

    protected EncodedKeySpec d(byte[] byArray) {
        return new X509EncodedKeySpec(byArray);
    }

    public String a() {
        return this.c;
    }

    public abstract byte[] b(byte[] var1);

    public abstract byte[] c(byte[] var1);
}

