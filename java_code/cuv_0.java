/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from cUV
 */
public abstract class cuv_0
implements ahr_1 {
    protected String a;
    private ans_1 c;
    protected final TIntObjectHashMap<TIntObjectHashMap<bou_0>> b = new TIntObjectHashMap();

    @Override
    public boolean a(adt_1 adt_12) {
        adt_12.a();
        return true;
    }

    protected void a(bou_0 bou_02, String string, int n) {
        short s2 = bou_02.b();
        String string2 = this.a(s2);
        if (fpm_0.b().q(string2)) {
            fpm_0.b().o(string2);
        } else {
            fpm_0.b().a(string2, cfi_0.a("stateDetailDialog"), this.a == null ? string : this.a, string, "stateDetailDialog", 1L, (short)10000);
            this.a = string2;
            if (n != -1) {
                TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.b.get(n);
                if (tIntObjectHashMap == null) {
                    tIntObjectHashMap = new TIntObjectHashMap();
                    this.b.put(n, (Object)tIntObjectHashMap);
                }
                if (!tIntObjectHashMap.containsKey((int)s2)) {
                    tIntObjectHashMap.put((int)s2, (Object)bou_02);
                }
            }
            fis_1.a().a("describedState", (Object)bou_02, string2);
            fis_1.a().a("describedStateLevel", (Object)bou_02.c(), string2);
        }
    }

    public void a() {
        this.b.clear();
    }

    protected String a(short s2) {
        return this.c() + s2;
    }

    protected abstract String c();

    public abstract void a(int var1, int var2, short var3);

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new cuw_0(this);
            fpm_0.b().a(this.c);
            fpm_0.b().a("wakfu.stateDetails", cJM.class);
        }
    }

    void b(short s2) {
        TIntObjectIterator tIntObjectIterator = this.b.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((TIntObjectHashMap)tIntObjectIterator.value()).remove((int)s2);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            this.a();
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

