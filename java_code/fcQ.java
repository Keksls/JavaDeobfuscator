/*
 * Decompiled with CFR 0.152.
 */
public class fcQ
extends fcb<wp_2> {
    private final Boolean c;
    final /* synthetic */ fcm_0 a;

    fcQ(fcm_0 fcm_02, Boolean bl) {
        this.a = fcm_02;
        this.c = bl;
    }

    protected wp_2 d() {
        return new wp_2();
    }

    @Override
    protected void a(wp_2 wp_22) {
        this.a.m.c().a(wp_22, this.c);
    }

    @Override
    protected void b(wp_2 wp_22) {
        fej_0 fej_02 = this.a.m.c();
        fej_02.a();
        fej_02.a(wp_22);
    }

    @Override
    protected /* synthetic */ gs_0 c() {
        return this.d();
    }
}

