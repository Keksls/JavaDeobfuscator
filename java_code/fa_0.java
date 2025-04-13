/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Map;

/*
 * Renamed from Fa
 */
public final class fa_0 {
    private final fn_0 a;

    public fa_0(fn_0 fn_02) {
        this.a = fn_02;
    }

    public void a(gh_0 gh_02) {
        try {
            Map<Short, fm_0> map = this.a.a();
            gh_02.a((short)map.size());
            for (fm_0 fm_02 : map.values()) {
                new ez_0(fm_02).a(gh_02);
            }
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save imports", iOException);
        }
    }
}

