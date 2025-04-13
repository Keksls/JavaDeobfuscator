/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 */
import com.google.common.base.Strings;

public class bHg
extends bgz_0
implements eAM {
    public static final String w = "bag";
    public static final String x = String.format("%s.%s", "collapsedView", "bag");
    private final bHe z;
    protected final exc_1 y = (by, by2) -> {
        ajb_1 ajb_12 = this.k();
        if (ajb_12 == null) {
            return;
        }
        ajb_12.b(this.a(by), this.v);
        this.c(ajb_12);
        ajb_12.a(this.a(by2), this.v);
    };
    private String A;

    public bHg(bHe bHe2) {
        this.z = bHe2;
        this.z.a(this.y);
        this.i();
        this.l();
    }

    @Override
    public Object b(String string) {
        if (string.equals("bagName")) {
            return this.u();
        }
        if (string.equals("bagIconUrl")) {
            Object r2 = eyo_1.g().d(this.z.d());
            if (r2 != null) {
                return azs_0.a().d(((ezr_0)r2).C());
            }
        } else {
            if (string.equals("bagId")) {
                return this.z.f();
            }
            if (string.equals("bagInventory")) {
                Object[] objectArray = new Object[this.z.g().k()];
                exk_2[] exk_2Array = (exk_2[])this.z.g().a(new exk_2[this.z.g().k()]);
                bhz_1 bhz_12 = new bhz_1();
                if (!Strings.isNullOrEmpty((String)this.A)) {
                    bhz_12.a(true);
                }
                for (int k = 0; k < exk_2Array.length; ++k) {
                    if (exk_2Array[k] == null) {
                        objectArray[k] = bhz_12;
                        continue;
                    }
                    exk_2 exk_22 = exk_2Array[k];
                    boolean bl = !Strings.isNullOrEmpty((String)this.A) && !Cz.o(exk_22.N()).contains(this.A);
                    exk_22.b(bl);
                    objectArray[k] = exk_22;
                }
                return objectArray;
            }
            if (string.equals("bagNameSize")) {
                return this.u() + " (" + this.z.i() + "/" + this.z.h() + ")";
            }
            if (string.equals("bagSizeMaxSize")) {
                return this.z.i() + "/" + this.z.h();
            }
            if (string.equals("bagSize")) {
                return this.z.i();
            }
            if (string.equals("bagPosition")) {
                return this.z.e();
            }
            if (string.equals("canBeSorted")) {
                return true;
            }
            if ("collapsible".equals(string)) {
                return true;
            }
            if ("collapsingIgnoreSize".equals(string)) {
                return true;
            }
        }
        return super.b(string);
    }

    private String u() {
        Object r2 = eyo_1.g().d(this.z.d());
        if (r2 != null) {
            return ((ezr_0)r2).e();
        }
        return null;
    }

    public bHe o() {
        return this.z;
    }

    public void a(String string) {
        this.A = Strings.isNullOrEmpty((String)string) ? null : Cz.o(string);
        fis_1.a().a((ajf_1)this, "bagInventory");
    }

    protected boolean a(bmr_1 bmr_12) {
        bHi bHi2 = bmr_12.da();
        return bHi2.d(this.z.f()) != null;
    }

    @Override
    protected ags_0 b() {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return null;
        }
        return this.a(bmr_12) ? ags_0.c : ags_0.d;
    }

    @Override
    protected bmr_1 f() {
        bmr_1 bmr_12 = ans_0.F().k();
        if (bmr_12 == null) {
            return null;
        }
        return (bmr_1)euu_2.b(bmr_12.U_(), this.z.f());
    }

    protected String a(long l) {
        return String.format("%s.%s", x, l);
    }

    @Override
    protected String e() {
        return this.a(this.z.e());
    }

    @Override
    public eAN p() {
        return eAN.b;
    }

    @Override
    public Object q() {
        return this.z.f();
    }

    @Override
    public String r() {
        return ((ezr_0)eyo_1.g().d(this.z.d())).e();
    }
}

