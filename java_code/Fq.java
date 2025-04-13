/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class Fq {
    public static final Fz[] a = new Fz[0];
    private final fy_0 b;

    public Fq(fy_0 fy_02) {
        this.b = fy_02;
    }

    public void a(gh_0 gh_02) {
        this.b(gh_02);
        this.c(gh_02);
        this.d(gh_02);
        this.e(gh_02);
    }

    private void b(gh_0 gh_02) {
        float[] fArray = this.b.a();
        gh_02.a(fArray.length);
        for (float f2 : fArray) {
            gh_02.a(f2);
        }
    }

    private void c(gh_0 gh_02) {
        float[] fArray = this.b.b();
        gh_02.a(fArray.length);
        for (float f2 : fArray) {
            gh_02.a(f2);
        }
    }

    private void d(gh_0 gh_02) {
        float[] fArray = this.b.c();
        gh_02.a(fArray.length);
        for (float f2 : fArray) {
            gh_02.a(f2);
        }
    }

    private void e(gh_0 gh_02) {
        Fz[] fzArray = this.b.d();
        gh_02.a(fzArray.length);
        for (Fz fz : fzArray) {
            Optional<DR> optional = DR.a(fz.b());
            if (optional.isEmpty()) continue;
            DQ<? extends DP> dQ = optional.get().b();
            DP dP = dQ.a(fz);
            dP.a(gh_02);
        }
    }
}

