/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from aPQ
 */
public abstract class apq_0
implements fyh_0 {
    protected final abv_0 a;
    protected final abv_0 b;
    protected final abv_0 c;
    protected final aph_0 d;
    protected final Map<abv_0, azj_2> e = new HashMap<abv_0, azj_2>();
    final aff_1 f = new aff_1();

    public apq_0(String string, azj_2 azj_22, String string2, azj_2 azj_23, String string3, azj_2 azj_24, String string4, azj_2 azj_25, String string5, azj_2 azj_26, String string6, azj_2 azj_27) {
        abv_0 abv_02;
        abv_0 abv_03;
        abv_0 abv_04;
        if (string != null && azj_22 != null) {
            this.a = new abv_0(string, azj_22);
            this.a.a(1);
            if (azj_22 instanceof fyr_0) {
                this.e.put(this.a, azj_22);
            }
        } else {
            this.a = null;
        }
        if (string4 != null && azj_25 != null) {
            this.c = new abv_0(string4, azj_25);
            this.c.a(2);
            if (azj_25 instanceof fyr_0) {
                this.e.put(this.c, azj_25);
            }
        } else {
            this.c = null;
        }
        if (string5 != null && azj_26 != null) {
            this.b = new abv_0(string5, azj_26);
            this.b.a(3);
            if (azj_26 instanceof fyr_0) {
                this.e.put(this.b, azj_26);
            }
        } else {
            this.b = null;
        }
        if (string2 != null && azj_23 != null) {
            abv_04 = new abv_0(string2, azj_23);
            abv_04.a(4);
            if (azj_23 instanceof fyr_0) {
                this.e.put(abv_04, azj_23);
            }
        } else {
            abv_04 = null;
        }
        if (string3 != null && azj_24 != null) {
            abv_03 = new abv_0(string3, azj_24);
            abv_03.a(4);
            if (azj_23 instanceof fyr_0) {
                this.e.put(abv_03, azj_24);
            }
        } else {
            abv_03 = null;
        }
        if (string6 != null && azj_27 != null) {
            abv_02 = new abv_0(string6, azj_27);
            abv_02.a(5);
            if (azj_27 instanceof fyr_0) {
                this.e.put(abv_02, azj_27);
            }
        } else {
            abv_02 = null;
        }
        this.d = new aph_0(abv_04, abv_03, abv_02);
        if (!this.e.isEmpty()) {
            fpm_0.b().g().a(this);
        }
    }

    public apq_0(String string, float[] fArray, String string2, float[] fArray2, String string3, float[] fArray3, String string4, float[] fArray4, String string5, float[] fArray5, String string6, float[] fArray6) {
        this(string, fArray != null ? new azf_2(fArray) : null, string2, fArray2 != null ? new azf_2(fArray2) : null, string3, fArray3 != null ? new azf_2(fArray3) : null, string4, fArray4 != null ? new azf_2(fArray4) : null, string5, fArray5 != null ? new azf_2(fArray5) : null, string6, fArray6 != null ? new azf_2(fArray6) : null);
    }

    protected void b(blx_1 blx_12) {
        bvx_2 bvx_22 = blx_12.bz();
        if (bvx_22 == null) {
            return;
        }
        tg_0 tg_02 = bvx_22.g();
        boolean bl = this.a(bvx_22);
        this.c();
        int n = tg_02.z();
        int n2 = tg_02.A();
        int n3 = tg_02.B();
        int n4 = n + n3;
        int n5 = n2 + tg_02.C();
        for (int k = n; k < n4; ++k) {
            block6: for (int i2 = n2; i2 < n5; ++i2) {
                short s2;
                if (bl && !tg_02.b(k, i2) || !tg_02.c(k, i2) || (s2 = tg_02.i(k, i2)) == Short.MIN_VALUE) continue;
                this.f.c(k, i2, s2);
                switch (this.a(this.f, blx_12)) {
                    case a: {
                        if (this.a == null) continue block6;
                        this.a.a(k, i2, s2);
                        continue block6;
                    }
                    case d: {
                        if (this.c == null) continue block6;
                        this.c.a(k, i2, s2);
                        continue block6;
                    }
                    case c: {
                        if (this.b == null) continue block6;
                        this.b.a(k, i2, s2);
                    }
                }
            }
        }
    }

    private boolean a(bvx_2 bvx_22) {
        eke_0 eke_02 = bvx_22.ad();
        if (eke_02 == null) {
            return false;
        }
        return eke_02.au() && eke_02.ab();
    }

    public void a(List<efi_0> list, blx_1 blx_12, aff_1 aff_12) {
        this.d.a(list, blx_12, aff_12);
    }

    public void a(aff_1 aff_12) {
        this.d.a(aff_12);
    }

    protected void a(String string, aim aim2) {
        this.d.a(string, aim2);
    }

    public void c() {
        this.d();
        if (this.a != null) {
            this.a.a();
        }
        if (this.c != null) {
            this.c.a();
        }
        if (this.b != null) {
            this.b.a();
        }
    }

    public void d() {
        this.d.a();
    }

    public boolean b(aff_1 aff_12) {
        return this.a != null && this.a.a(aff_12);
    }

    protected abstract aps_0 a(aff_1 var1, blx_1 var2);

    @Override
    public void e() {
        for (Map.Entry<abv_0, azj_2> entry : this.e.entrySet()) {
            entry.getKey().a(entry.getValue());
        }
    }
}

