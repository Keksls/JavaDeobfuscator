/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class daV
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "containers";
    private final cDO e;
    private final acy_2<daU> f = new acy_2();
    final /* synthetic */ dan_0 d;

    daV(dan_0 dan_02, cDO cDO2) {
        this.d = dan_02;
        this.e = cDO2;
        this.b();
    }

    public void a() {
        if (this.f != null) {
            int n = this.f.d();
            for (int k = 0; k < n; ++k) {
                this.f.h(k).a();
            }
        }
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e.b();
        }
        if (string.equals(b)) {
            return this.f;
        }
        return null;
    }

    public void b() {
        Object object;
        acy_2<daU> acy_22 = new acy_2<daU>();
        int n = this.f.d();
        for (int k = 0; k < n; ++k) {
            acy_22.a(this.f.e(k), this.f.h(k));
        }
        ArrayList<cDY> arrayList = this.e.c();
        int n2 = arrayList.size();
        for (n = 0; n < n2; ++n) {
            object = arrayList.get(n);
            int n3 = ((cdr_0)object).c();
            if (this.f.d(n3)) {
                acy_22.f(n3);
                continue;
            }
            this.f.a(n3, new daU((cDY)object));
        }
        n2 = acy_22.d();
        for (n = 0; n < n2; ++n) {
            object = this.f.f(acy_22.e(n));
            ((daU)object).a();
        }
        fis_1.a().a((ajf_1)this, b);
    }
}

