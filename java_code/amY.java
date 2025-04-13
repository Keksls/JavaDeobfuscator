/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

public class amY
extends amV {
    private static final Logger a = Logger.getLogger(amY.class);
    private static final int b = 1;
    private final TLongObjectHashMap<anf_0> c = new TLongObjectHashMap();

    public void a(String string) {
        arf_1 arf_12 = arf_1.a(gg_0.b(string));
        int n = arf_12.c();
        int n2 = arf_12.c();
        for (int k = 0; k < n2; ++k) {
            long l = arf_12.j();
            anf_0 anf_02 = new anf_0(arf_12);
            this.c.put(l, (Object)anf_02);
        }
        arf_12.close();
    }

    public void b(String string) {
        gk_0 gk_02 = new gk_0(gi_0.o(string));
        gk_02.a(1);
        gk_02.a(this.c.size());
        TLongObjectIterator tLongObjectIterator = this.c.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            gk_02.c(tLongObjectIterator.key());
            ((anf_0)tLongObjectIterator.value()).a(gk_02);
        }
        gk_02.d();
    }

    public void a(long l, anf_0 anf_02) {
        this.c.put(l, (Object)anf_02);
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4) {
        boolean bl;
        anf_0 anf_02 = (anf_0)this.c.get((long)n);
        if (anf_02 == null) {
            return false;
        }
        boolean bl2 = bl = anf_02.f() || anf_02.c();
        if (anf_02.g() != 0) {
            ado_1.a().a(() -> this.a(n2, n3, n4, anf_02), anf_02.g(), 1);
            return bl;
        }
        this.a(n2, n3, n4, anf_02);
        return bl;
    }

    private void a(int n, int n2, int n3, anf_0 anf_02) {
        long l;
        if (!this.a()) {
            return;
        }
        long[] lArray = anf_02.a();
        byte[] byArray = anf_02.b();
        int n4 = Hw.a(lArray.length);
        long l2 = System.currentTimeMillis();
        if (!this.a(l2, l = lArray[n4])) {
            return;
        }
        float f2 = (float)byArray[n4] / 100.0f;
        float f3 = Hw.a(anf_02.i()[n4], anf_02.h()[n4]);
        long l3 = n3 != -1 ? l2 + (long)n3 : -1L;
        long l4 = anf_02.e() != 0 ? l3 - (long)anf_02.e() : -1L;
        IsoParticleSystem isoParticleSystem = aik_0.a().a(n);
        try {
            if (l != 0L) {
                amk_1 amk_12 = isoParticleSystem != null ? aki_0.h().a(l, f2, f3, anf_02.c() ? 0 : 1, l3, l4, n2, isoParticleSystem, anf_02.d(), false) : aki_0.h().a(l, f2, f3, anf_02.c() ? 0 : 1, l3, l4, n2);
                if (amk_12 != null) {
                    this.a(n, amk_12.b(), l2, l);
                }
            } else {
                a.warn((Object)"Null sound id");
            }
        }
        catch (Exception exception) {
            a.error((Object)("soundExtension or soundPath not initialized " + exception));
        }
    }
}

