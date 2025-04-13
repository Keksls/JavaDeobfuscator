/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dcT
 */
public class dct_0
implements ahr_1 {
    private static final dct_0 a = new dct_0();

    public static dct_0 a() {
        return a;
    }

    private dct_0() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        switch (adt_12.a()) {
            case 16119: 
            case 18907: {
                bpc_2 bpc_22 = bmr_12.eE();
                if (bpc_22 == null || bpc_22.ac_() != 16) {
                    azu_0.j().b(this);
                    return false;
                }
                bql_2 bql_22 = (bql_2)bpc_22;
                if (bql_22.a(bmr_12)) {
                    return false;
                }
                if (dct_0.a((dhL)adt_12)) {
                    dfc dfc2 = dct_0.b(adt_12);
                    bql_22.a(new dcu_0(this, dfc2));
                }
                return false;
            }
        }
        return true;
    }

    private static boolean a(dhL dhL2) {
        switch (dhL2.a()) {
            case 16119: {
                return dhL2.o();
            }
            case 18907: {
                return dhL.t();
            }
        }
        return false;
    }

    private static dfc b(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16119: {
                return dct_0.b((dhL)adt_12);
            }
            case 18907: {
                return dct_0.b((dhL)adt_12);
            }
        }
        return null;
    }

    private static dfc b(dhL dhL2) {
        return dhL2.k();
    }

    public void c() {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 != null && bpc_22.ac_() == 16) {
            ((bql_2)bpc_22).a(bmr_12.bv(), null);
            bmr_12.a((ead_0)null);
        }
        azu_0.j().b(this);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

