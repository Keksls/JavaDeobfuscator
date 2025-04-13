/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Fk
 */
public class fk_0
implements Fm {
    private final fx_0 a;

    public fk_0(fx_0 fx_02) {
        this.a = fx_02;
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
            short[] sArray = this.a.j();
            gh_02.a((short)sArray.length);
            for (short s2 : sArray) {
                gh_02.a(s2);
            }
            fg_0.a(gh_02, this.a.k().b());
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save sprite " + this.a.b(), iOException);
        }
    }
}

