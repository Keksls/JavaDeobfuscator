/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Fi
 */
public class fi_0
implements Fm {
    private final FY a;

    public fi_0(FY fY) {
        this.a = fY;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(gh_0 gh_02) {
        try {
            void var6_10;
            gh_02.a(this.a.a());
            gh_02.a(this.a.e());
            if (this.a.h(64)) {
                gh_02.a(this.a.b());
            }
            gh_02.a(this.a.c());
            gh_02.a(this.a.d());
            short[] sArray = this.a.l();
            gh_02.a((short)sArray.length);
            for (short n : sArray) {
                gh_02.a(n);
            }
            short[] sArray2 = this.a.j();
            gh_02.a((short)sArray2.length);
            short[] sArray3 = sArray2;
            int n = sArray3.length;
            boolean bl = false;
            while (var6_10 < n) {
                short s2 = sArray3[var6_10];
                gh_02.a(s2);
                ++var6_10;
            }
            fg_0.a(gh_02, this.a.k().b());
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save sprite " + this.a.b(), iOException);
        }
    }
}

