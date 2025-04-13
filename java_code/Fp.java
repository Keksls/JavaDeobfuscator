/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class Fp {
    private final ge_1 a;

    public Fp(ge_1 ge_12) {
        this.a = ge_12;
    }

    public void a(gh_0 gh_02) {
        try {
            String string = this.a.a();
            int n = this.a.d();
            if (string == null || n == 0) {
                gh_02.a((short)0);
                return;
            }
            gh_02.a((short)1);
            gh_02.a(string);
            gh_02.a(n);
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save texture", iOException);
        }
    }
}

