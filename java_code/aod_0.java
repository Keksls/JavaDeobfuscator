/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aOD
 */
public class aod_0
extends aff {
    public static final int c = 0;
    public static final int d = 255;
    private static final Logger e = Logger.getLogger(aod_0.class);
    private final TLongObjectHashMap<afc> f = new TLongObjectHashMap();

    public byte c() {
        return 0;
    }

    public TLongObjectHashMap<afc> d() {
        return this.f;
    }

    public afc a(long l) {
        return (afc)this.f.get(l);
    }

    @Override
    public void a(@NotNull arf_1 arf_12, boolean bl) {
        super.a(arf_12, bl);
        this.c(arf_12, bl);
        this.e();
    }

    private void c(arf_1 arf_12, boolean bl) {
        int n;
        if (bl) {
            this.f.clear();
        }
        if ((n = arf_12.b()) == 0) {
            return;
        }
        for (int k = 0; k < n; ++k) {
            afc afc2 = new afc();
            afc2.a(arf_12);
            this.f.put(afc2.a, (Object)afc2);
        }
    }

    private void e() {
        TIntObjectHashMap<afd> tIntObjectHashMap = this.a();
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            afd afd2 = (afd)tIntObjectIterator.value();
            if (afd2.n == null) continue;
            int n = afd2.n.size();
            for (int k = 0; k < n; ++k) {
                afe afe2 = afd2.n.get(k);
                try {
                    afe2.d = eyS.c(afe2.c);
                    continue;
                }
                catch (Exception exception) {
                    e.warn((Object)("Impossible de compiler le crit\u00e8re " + afe2.c + " sur la description de landMark d'id " + afe2.a));
                }
            }
        }
    }

    public void a(ArrayList<afc> arrayList) {
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            afc afc2 = arrayList.get(k);
            this.f.put(afc2.a, (Object)afc2);
        }
    }

    @Override
    public void a(@NotNull gk_0 gk_02) {
        super.a(gk_02);
        this.b(gk_02);
    }

    private void b(gk_0 gk_02) {
        int n = this.f.size();
        if (n > Short.MAX_VALUE) {
            throw new IllegalArgumentException("Nombre d'elements interactifs superieur \u00e0 32767");
        }
        gk_02.a((short)n);
        TLongObjectIterator tLongObjectIterator = this.f.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((afc)tLongObjectIterator.value()).a(gk_02);
        }
    }

    @Override
    public void b() {
        super.b();
        this.f.clear();
    }
}

