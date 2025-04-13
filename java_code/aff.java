/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.jetbrains.annotations.NotNull;

public class aff {
    public static final int a = 0;
    private final TIntObjectHashMap<afd> c = new TIntObjectHashMap();
    boolean b;

    public TIntObjectHashMap<afd> a() {
        return this.c;
    }

    public void a(TIntObjectHashMap<afd> tIntObjectHashMap) {
        this.c.ensureCapacity(this.c.size() + tIntObjectHashMap.size());
        this.c.putAll(tIntObjectHashMap);
    }

    public void a(@NotNull arf_1 arf_12, boolean bl) {
        this.c(arf_12, bl);
    }

    public void b(@NotNull arf_1 arf_12, boolean bl) {
        byte by = arf_12.a();
        this.a(arf_12, bl);
    }

    public void a(@NotNull gk_0 gk_02) {
        this.b(gk_02);
    }

    private void c(arf_1 arf_12, boolean bl) {
        int n;
        if (bl) {
            this.c.clear();
        }
        if ((n = arf_12.b() & 0xFFFF) == 0) {
            return;
        }
        for (int k = 0; k < n; ++k) {
            afd afd2 = new afd();
            afd2.a(arf_12);
            this.c.put(afd2.b, (Object)afd2);
        }
    }

    private void b(gk_0 gk_02) {
        int n = this.c.size();
        if (n > Short.MAX_VALUE) {
            throw new IllegalArgumentException("Nombre de landmark > 32767");
        }
        gk_02.a((short)(n & 0xFFFF));
        TIntObjectIterator tIntObjectIterator = this.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((afd)tIntObjectIterator.value()).a(gk_02);
        }
    }

    public void b() {
        this.c.clear();
    }
}

