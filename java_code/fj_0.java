/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Fj
 */
public class fj_0
implements Fm {
    private final fz_0 a;

    public fj_0(fz_0 fz_02) {
        this.a = fz_02;
    }

    @Override
    public final void a(gh_0 gh_02) {
        try {
            gh_02.a(this.a.a());
            gh_02.a(this.a.e());
            if (this.a.h(64)) {
                gh_02.a(this.a.b());
            }
            gh_02.a(this.a.c());
            gh_02.a(this.a.d());
            gh_02.a(this.a.u());
            fg_0.a(gh_02, this.a.k().b());
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save sprite " + this.a.b(), iOException);
        }
    }
}

