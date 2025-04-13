/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from aAi
 */
class aai_2 {
    private final THashMap<String, aae_2> a = new THashMap();
    private int b = 0;
    private int c = 0;
    private long d = 0L;
    private float e;

    aai_2() {
    }

    public float a() {
        return this.e;
    }

    private void f() {
        long l = System.currentTimeMillis();
        long l2 = l - this.d;
        if (l2 >= 2000L) {
            this.e = (float)this.c / ((float)l2 / 1000.0f);
            this.c = 0;
            this.d = l;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        aae_2 aae_22 = (aae_2)this.a.get((Object)string);
        if (aae_22 == null) {
            aae_22 = new aae_2(string);
            THashMap<String, aae_2> tHashMap = this.a;
            synchronized (tHashMap) {
                this.a.put((Object)string, (Object)aae_22);
            }
        }
        aae_22.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        THashMap<String, aae_2> tHashMap = this.a;
        synchronized (tHashMap) {
            if (!this.a.isEmpty()) {
                this.a.forEachValue((TObjectProcedure)new aaj_2(this));
            }
        }
        this.b = 0;
    }

    public void c() {
        this.f();
        ++this.c;
        ++this.b;
    }

    public THashMap<String, aae_2> d() {
        return this.a;
    }

    public int e() {
        return this.b;
    }
}

