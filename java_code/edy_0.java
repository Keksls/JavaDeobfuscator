/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eDY
 */
public final class edy_0
extends eDq<Sm<efh_0>> {
    public edy_0(Sm<efh_0> sm, int n, short s2) {
        super(sm, n, s2);
    }

    public edy_0(Sm<efh_0> sm, int n, short s2, boolean bl, ArrayList<String> arrayList, ArrayList<String> arrayList2, eDk eDk2, int n2) {
        super(sm, n, s2, bl, arrayList, arrayList2, eDk2, n2);
    }

    @Override
    public boolean a(efh_0 efh_02) {
        return (efh_02.Z() || eDi.ar.e()) && efh_02.O() <= this.c && efh_02.P() >= this.c;
    }
}

