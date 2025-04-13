/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bPs
 */
public final class bps_0
implements Comparator<bph_0> {
    public int a(bph_0 bph_02, bph_0 bph_03) {
        return bph_02.F() - bph_03.F();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bph_0)object, (bph_0)object2);
    }
}

