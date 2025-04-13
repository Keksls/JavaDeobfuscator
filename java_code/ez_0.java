/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from EZ
 */
public final class ez_0 {
    private final fm_0 a;

    public ez_0(fm_0 fm_02) {
        this.a = fm_02;
    }

    public void a(gh_0 gh_02) {
        try {
            gh_02.a(this.a.a());
            gh_02.a(this.a.b());
            gh_02.a(0);
        }
        catch (IOException iOException) {
            throw new IllegalStateException("unable to save import " + this.a.a(), iOException);
        }
    }
}

