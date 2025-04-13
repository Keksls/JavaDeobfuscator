/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.list.array.TLongArrayList;
import java.util.List;

class bXe
implements aha_0<afe_0, cch_1> {
    final TLongArrayList a;
    private final int b;
    private final int c;

    bXe(int n, int n2, TLongArrayList tLongArrayList) {
        this.b = n;
        this.a = tLongArrayList;
        this.c = n2;
    }

    @Override
    public void a(afe_0 afe_02, cch_1 cch_12, cch_1 cch_13) {
        bmr_1 bmr_12 = azu_0.j().k();
        List list = ccm_1.g().b();
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            cch_1 cch_14 = (cch_1)list.get(k);
            long l = Hw.c(cch_14.a(), cch_14.b());
            if (this.a.contains(l)) continue;
            this.a.add(l);
            int n2 = cch_14.a() * 18;
            int n3 = cch_14.b() * 18;
            FreeParticleSystem freeParticleSystem = aij_0.a().a(this.b, this.c);
            freeParticleSystem.a(n2, (float)n3, (float)yz_0.d(n2, n3, bmr_12.P_().f()));
            aik_0.a().b(freeParticleSystem);
        }
    }
}

