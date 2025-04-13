/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eBC {
    public static final eBC a = new eBC();
    private short b = (short)-1;
    private final List<eBD> c = new ArrayList<eBD>();

    private eBC() {
    }

    public void a(short s2) {
        this.b = s2;
        this.c();
    }

    public boolean b(short s2) {
        return this.b == s2;
    }

    public short a() {
        return this.b;
    }

    public boolean b() {
        return this.b > 0;
    }

    public void a(eBD eBD2) {
        if (!this.c.contains(eBD2)) {
            this.c.add(eBD2);
        }
    }

    public void b(eBD eBD2) {
        this.c.remove(eBD2);
    }

    private void c() {
        if (this.c.isEmpty()) {
            return;
        }
        ArrayList<eBD> arrayList = new ArrayList<eBD>(this.c);
        for (eBD eBD2 : arrayList) {
            eBD2.a();
        }
    }

    public String toString() {
        return "FreeCompanionManager{m_freeCompanionBreedId=" + this.b + "}";
    }
}

