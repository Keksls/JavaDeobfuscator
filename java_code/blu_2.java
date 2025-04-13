/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.text.DateFormat;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from blu
 */
public class blu_2
implements ajh_1 {
    protected final blt_2 F;
    public static final String G = "isModel";
    public static final String H = "isCurrent";
    public static final String I = "type";
    public static final String J = "title";
    public static final String K = "description";
    public static final String L = "longDescription";
    public static final String M = "expiry";
    public static final String N = "duration";
    public static final String O = "iconUrl";
    public static final String P = "requirements";
    public static final String Q = "meetsRequirements";
    public static final String R = "state";
    public static final String S = "rewards";
    public static final String T = "firstRankReward";
    public static final String U = "secondRankReward";
    public static final String V = "thirdRankReward";
    public static final String W = "minUsers";
    public static final String X = "maxUsers";
    public static final String Y = "isSelectedByProtector";
    public static final String Z = "hasRewards";
    public static final String[] aa = new String[]{"isModel", "isCurrent", "type", "title", "description", "expiry", "duration", "iconUrl", "requirements", "meetsRequirements", "state", "rewards", "hasRewards"};
    private boolean a = false;
    protected static final Logger ab = Logger.getLogger(blu_2.class);

    public blu_2(blt_2 blt_22) {
        this.F = blt_22;
    }

    public blt_2 w() {
        return this.F;
    }

    @Override
    public String[] d() {
        return aa;
    }

    @Override
    public Object b(String string) {
        if (string.equals(G)) {
            return true;
        }
        if (string.equals(H)) {
            return this.a;
        }
        if (string.equals(I)) {
            return this.F.h();
        }
        if (string.equals(J)) {
            String string2 = this.F.c();
            if (string2 != null && string2.length() == 0) {
                return null;
            }
            return string2;
        }
        if (string.equals(K)) {
            return this.x();
        }
        if (string.equals(L)) {
            String string3 = this.F.e();
            if (string3 == null || string3.length() == 0) {
                return null;
            }
            return "\"" + string3 + "\"";
        }
        if (string.equals(P)) {
            String string4 = this.F.f();
            if (string4 != null && string4.length() == 0) {
                return null;
            }
            ani_2 ani_22 = new ani_2();
            if (!this.C()) {
                ani_22.i().a(azf_2.h.w());
            }
            ani_22.a((CharSequence)string4);
            return ani_22.r();
        }
        if (string.equals(Q)) {
            return this.C();
        }
        if (string.equals(M)) {
            return this.z();
        }
        if (string.equals(N)) {
            if (this.F.j() > 0) {
                return String.format("%d:00:00", this.F.j());
            }
        } else {
            if (string.equals(O)) {
                return this.y();
            }
            if (string.equals(R)) {
                return this.F.m();
            }
            if (string.equals(Z)) {
                return this.F.k().size() != 0;
            }
            if (string.equals(S)) {
                ArrayList<blg_2> arrayList = this.F.k();
                ArrayList<blf_2> arrayList2 = new ArrayList<blf_2>();
                int n = arrayList.size();
                for (int k = 0; k < n; ++k) {
                    arrayList2.add(new blf_2(arrayList.get(k)));
                }
                return arrayList2;
            }
            if (string.equals(T)) {
                ArrayList<blg_2> arrayList = this.F.k();
                if (arrayList == null || arrayList.size() < 1) {
                    return null;
                }
                return new blf_2(arrayList.get(0));
            }
            if (string.equals(U)) {
                ArrayList<blg_2> arrayList = this.F.k();
                if (arrayList == null || arrayList.size() < 2) {
                    return null;
                }
                return new blf_2(arrayList.get(1));
            }
            if (string.equals(V)) {
                ArrayList<blg_2> arrayList = this.F.k();
                if (arrayList == null || arrayList.size() < 3) {
                    return null;
                }
                return new blf_2(arrayList.get(2));
            }
            if (string.equals(W)) {
                return this.F.o();
            }
            if (string.equals(X)) {
                return this.F.p();
            }
            if (string.equals(Y)) {
                return bwy_2.h().j().s().contains(this.F.g());
            }
        }
        return null;
    }

    protected Object x() {
        String string = this.F.d();
        if (string != null && string.length() == 0) {
            return null;
        }
        return string;
    }

    public void e(boolean bl) {
        if (this.a != bl) {
            this.a = bl;
            fis_1.a().a((ajf_1)this, H);
        }
    }

    public String y() {
        try {
            return String.format(azs_0.a().a("challengeCategoryIconsPath"), this.F.h().a());
        }
        catch (gm_0 gm_02) {
            ab.error((Object)"PropertyException during getIconUrl", (Throwable)gm_02);
            return null;
        }
    }

    public String z() {
        if (this.F.n() != null) {
            DateFormat dateFormat = DateFormat.getDateTimeInstance(1, 2, bae.h().f().b());
            return String.format("%s %s", bae.h().a("expire.in", new Object[0]), dateFormat.format(this.F.n()));
        }
        return null;
    }

    public blr_2 A() {
        return this.F.h();
    }

    public blh_2 B() {
        return this.F.i();
    }

    public boolean C() {
        apc_2 apc_22 = this.F.s();
        return apc_22 == null || apc_22.b(azu_0.j().k(), azu_0.j().k(), null, null);
    }
}

