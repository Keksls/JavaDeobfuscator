/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

public final class fhq {
    private final long a;
    private final TLongObjectHashMap<fhp> b = new TLongObjectHashMap();

    public fhq(long l) {
        this.a = l;
    }

    private fhp a(long l) {
        fhp fhp2 = (fhp)this.b.get(l);
        if (fhp2 == null) {
            fhp2 = new fhp();
            this.b.put(l, (Object)fhp2);
        }
        return fhp2;
    }

    public void a(long l, int n) {
        fhp fhp2 = this.a(l);
        fhp2.a(n);
    }

    public void b(long l, int n) {
        fhp fhp2 = this.a(l);
        fhp2.b(n);
    }

    public void c(long l, int n) {
        fhp fhp2 = this.a(l);
        fhp2.c(n);
    }

    public void a(long l, fgY fgY2) {
        fhp fhp2 = this.a(l);
        fhp2.a(fgY2);
    }

    public void d(long l, int n) {
        fhp fhp2 = this.a(l);
        fhp2.d(n);
    }

    public void b(long l, fgY fgY2) {
        fhp fhp2 = this.a(l);
        fhp2.b(fgY2);
    }

    public void e(long l, int n) {
        fhp fhp2 = this.a(l);
        fhp2.e(n);
    }

    public long a() {
        return this.a;
    }

    public TLongObjectHashMap<fhp> b() {
        return this.b;
    }

    public String toString() {
        return "PvpFightReport{m_fightId=" + this.a + ", m_playersReportsInfos=" + this.b + "}";
    }
}

