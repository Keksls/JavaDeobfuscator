/*
 * Decompiled with CFR 0.152.
 */
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;

public interface eop {
    public static final String a = "RSA";
    public static final AlgorithmParameterSpec b = new RSAKeyGenParameterSpec(1024, RSAKeyGenParameterSpec.F4);
}

