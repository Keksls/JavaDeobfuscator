/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aOR
 */
class aor_0
implements Comparator<blx_1> {
    aor_0() {
    }

    public int a(blx_1 blx_12, blx_1 blx_13) {
        return blx_13.dp().compareTo(blx_12.dp());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((blx_1)object, (blx_1)object2);
    }
}

