/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class abb
extends aas_0 {
    private adm_0 c;

    abb(aba aba2) {
        super(aba2);
    }

    @Override
    public void a(ArrayList<aaf> arrayList) {
        super.a(arrayList);
    }

    @Override
    public final void a() {
        float f2 = this.a[0].a();
        float f3 = this.a[1].a();
        if (f2 == 0.0f || f3 == 0.0f) {
            this.b();
            return;
        }
        if (this.c == null) {
            this.c();
        }
        this.c.a(this.b);
        this.c.a(f3, f2);
    }

    @Override
    public final void b() {
        if (this.c == null) {
            return;
        }
        this.c.i();
        this.c.a();
        aui_1.a().b(this.c);
        this.c = null;
    }

    @Override
    public final void c() {
        this.c = new adm_0();
        this.c.d();
        aui_1.a().a(this.c);
    }
}

