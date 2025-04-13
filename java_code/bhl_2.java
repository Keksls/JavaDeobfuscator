/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  gnu.trove.set.hash.TLongHashSet
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.set.hash.TIntHashSet;
import gnu.trove.set.hash.TLongHashSet;
import java.util.List;

/*
 * Renamed from bhl
 */
public final class bhl_2
implements emo_1 {
    private final int a;
    private final TIntHashSet b = new TIntHashSet();
    private final TLongHashSet c = new TLongHashSet();

    public bhl_2(int n) {
        this.a = n;
    }

    @Override
    public void a(emm_1 emm_12) {
        this.a();
        List<List<ekh_0>> list = emm_12.a();
        for (List<ekh_0> list2 : list) {
            if (list2.size() < 3) continue;
            this.a(list2);
        }
    }

    private void a(List<ekh_0> list) {
        for (ekh_0 ekh_02 : list) {
            int n = ekh_02.G();
            int n2 = ekh_02.H();
            this.a(n, n2);
        }
    }

    private void a(int n, int n2) {
        this.b(n, n2);
        this.b(n + 1, n2);
        this.b(n, n2 + 1);
        this.b(n + 1, n2 + 1);
        this.b(n - 1, n2);
        this.b(n, n2 - 1);
        this.b(n - 1, n2 - 1);
        this.b(n - 1, n2 + 1);
        this.b(n + 1, n2 - 1);
    }

    private void b(int n, int n2) {
        long l = Hw.c(n, n2);
        if (this.c.contains(l)) {
            return;
        }
        bwh_0 bwh_02 = bwj_1.a().a(this.a);
        if (bwh_02 == null) {
            return;
        }
        short s2 = bwh_02.g().i(n, n2);
        FreeParticleSystem freeParticleSystem = aij_0.a().a(1013002);
        freeParticleSystem.b(n, n2, s2);
        freeParticleSystem.a(this.a);
        this.b.add(freeParticleSystem.ac());
        this.c.add(l);
        aik_0.a().b(freeParticleSystem);
    }

    public void a() {
        for (int n : this.b) {
            aik_0.a().a(n, true);
        }
        this.b.clear();
        this.c.clear();
    }
}

