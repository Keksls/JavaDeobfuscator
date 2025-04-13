/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmy
 */
final class bmy_2
extends eqk_2 {
    private final pl_1 b;
    final /* synthetic */ bmr_1 a;

    bmy_2(bmr_1 bmr_12, pl_1 pl_12) {
        this.a = bmr_12;
        this.b = pl_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmr_1.ea().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void b() {
        if (this.b.c == null) {
            return;
        }
        bol_0 bol_02 = new bol_0(bmr_1.b(this.a));
        this.a.a(bol_02);
        if (!ers_2.b(bol_02, this.b.c.a)) {
            bmr_1.eb().error((Object)"Error when unserializing symbiot part");
            return;
        }
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null || bmr_12.a_() == bmr_1.c(this.a)) {
            bOQ.a().b();
            bOQ.a().c();
        }
        for (byte by = 0; by < bol_02.b(); by = (byte)(by + 1)) {
            Object object = this.a.di.a().a((int)by);
            if (object == null || ((eqy_1)object).e() != null && !((eqy_1)object).e().isEmpty()) continue;
            String string = bae.h().a(7, (long)((eqy_1)object).f(), new Object[0]);
            ((eqy_1)object).a(string);
            clq_0 clq_02 = new clq_0();
            clq_02.a(bmr_1.d(this.a));
            clq_02.a(by);
            clq_02.a(string);
            clq_02.a(false);
            azu_0.j().K().c(clq_02);
        }
        fis_1.a().a((ajf_1)bOQ.a(), bOQ.g);
        dbJ.a().d();
        for (Object object : bmr_1.e(this.a)) {
            object.e(this.a);
        }
    }
}

