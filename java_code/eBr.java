/*
 * Decompiled with CFR 0.152.
 */
public class eBr {
    protected final long a;

    public eBr(long l) {
        this.a = l;
    }

    public eBt a(eBt eBt2) {
        short s2 = eBt2.a();
        if (eBo.a.b(this.a, s2)) {
            throw new eBn("Le joueur poss\u00e8de d\u00e9j\u00e0 un compagnon de ce type " + s2);
        }
        Object b2 = epv_1.a().b(s2);
        if (b2 == null) {
            throw new eBn("On ne peut pas ajouter de compagnon de breed inconnue " + s2);
        }
        eBo.a.a(this.a, eBt2);
        return eBt2;
    }

    public boolean a(long l) {
        return eBo.a.b(this.a, l);
    }

    public void a() {
        eBo.a.d(this.a);
    }

    public String toString() {
        return "CompanionManagerController{m_clientId=" + this.a + "}";
    }
}

