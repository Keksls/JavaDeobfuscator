/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class ZS {
    private final ArrayList<aaf> a = new ArrayList();
    final aas_0 b;
    private boolean c = false;

    ZS(aas_0 aas_02) {
        this.b = aas_02;
    }

    public final void a() {
        this.b.a(this.a);
    }

    public final boolean b() {
        return this.a.size() > 0;
    }

    public final void c() {
        this.a.clear();
    }

    public final void d() {
        if (this.b() == this.c) {
            return;
        }
        if (this.c) {
            this.b.b();
        } else {
            this.b.c();
        }
        this.c = !this.c;
    }

    public final void a(aaf aaf2) {
        this.a.add(aaf2);
    }
}

