/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ble
 */
public class ble_0
implements ajh_1 {
    public static final String a = "sheetName";
    public static final String b = "sheetNameWithLevel";
    public static final String d = "index";
    public static final String e = "level";
    public static final String f = "shortLevel";
    public static final String g = "isActive";
    public static final String h = "hasInvalidSheet";
    public static final String i = "iconUrl";
    public static final String j = "isRealLevel";
    public static final String k = "canBeDeleted";
    public static final String l = "deleteButtonPopup";
    public static final String m = "isPermanent";
    public static final String[] n = new String[]{"sheetName", "sheetNameWithLevel", "level", "shortLevel", "isActive", "hasInvalidSheet", "iconUrl", "isRealLevel", "index", "canBeDeleted", "deleteButtonPopup", "isPermanent"};
    public static final Comparator<ble_0> o = Comparator.comparing(ble_0::e);
    public static final Comparator<ble_0> p = Comparator.comparingInt(ble_02 -> ble_02.j() == -1 ? Integer.MAX_VALUE : ble_02.j());
    private final ezj_1 q;
    private final int r;
    private final bmr_1 s;

    public ble_0(int n, ezj_1 ezj_12, bmr_1 bmr_12) {
        this.r = n;
        this.q = ezj_12;
        this.s = bmr_12;
    }

    @Override
    public String[] d() {
        return n;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "sheetNameWithLevel": {
                return bae.h().a("aptitude.sheet.name", this.q.b(), this.h());
            }
            case "sheetName": {
                return this.q.b();
            }
            case "index": {
                return this.q.e();
            }
            case "level": {
                return this.h();
            }
            case "shortLevel": {
                if (this.q.c() > 0) {
                    return this.q.c();
                }
                return bae.h().a("real", new Object[0]);
            }
            case "isActive": {
                return cZI.a().J() == this.r;
            }
            case "hasInvalidSheet": {
                return this.g();
            }
            case "iconUrl": {
                return azs_0.a().n(String.valueOf(this.q.d()));
            }
            case "isRealLevel": {
                return this.q.c() == -1;
            }
            case "canBeDeleted": {
                return cZI.a().g(this.r);
            }
            case "deleteButtonPopup": {
                return this.i();
            }
            case "isPermanent": {
                return this.f();
            }
        }
        return null;
    }

    public long a() {
        return this.s.a_();
    }

    private boolean g() {
        eyz_0 eyz_02;
        int n = this.q.e();
        if (!ezp_1.b(this.s, n, eyz_02 = this.s.d((int)((byte)n))).isEmpty()) {
            return true;
        }
        fiO fiO2 = this.s.dw().b(n);
        if (!ezp_1.a((epq_2)this.s, fiO2).isEmpty()) {
            return true;
        }
        Object t = this.s.dA().a(n);
        return !ezp_1.a((epq_2)this.s, t).isEmpty();
    }

    private String h() {
        int n = this.q.c();
        blb_0 blb_02 = blc_0.a.a((short)n);
        String string = blb_02.b();
        if (n > 0) {
            return bae.h().a("levelShort.custom", string);
        }
        return string;
    }

    private String i() {
        if (this.q.f()) {
            return bae.h().a("build.cant.delete.permanent", new Object[0]);
        }
        if (ezp_1.a(this.s)) {
            return bae.h().a("build.cant.delete.occupation", new Object[0]);
        }
        fjv_0 fjv_02 = ((fjw_0)fjw_0.e()).c(this.s.T_());
        if (fjv_02 == null || fjv_02.c() || fjv_02.a()) {
            return bae.h().a("build.cant.delete.fight", new Object[0]);
        }
        bvx_2 bvx_22 = this.s.bz();
        if (bvx_22 != null && bvx_22.e() != elp_0.b && bvx_22.e() != elp_0.e) {
            return bae.h().a("build.cant.delete.fight", new Object[0]);
        }
        return bae.h().a("build.delete", new Object[0]);
    }

    public ezj_1 b() {
        return this.q;
    }

    public int c() {
        return this.r;
    }

    public String e() {
        return this.q.b();
    }

    private int j() {
        return this.q.c();
    }

    public boolean f() {
        return this.q.f();
    }

    public String toString() {
        return this.q.toString();
    }
}

