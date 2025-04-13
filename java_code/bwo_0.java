/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.HashSet;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bwo
 */
public final class bwo_0
extends emj_1 {
    private final Collection<blx_1> G = new HashSet<blx_1>();

    @Override
    @Nullable
    public ti_0 g(int n, int n2) {
        byte by = this.e(n, n2);
        if (by < 0) {
            return null;
        }
        ti_0 ti_02 = this.a(by);
        if (this.G.contains(ti_02)) {
            return null;
        }
        return ti_02;
    }

    public void a(blx_1 blx_12) {
        if (blx_12 == null) {
            return;
        }
        this.G.add(blx_12);
    }

    public void b(blx_1 blx_12) {
        if (blx_12 == null) {
            return;
        }
        this.G.remove(blx_12);
    }
}

