/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkZ
 */
public class bkz_1
implements ajh_1 {
    public static final String a = "id";
    public static final String b = "name";
    public static final String d = "iconUrl";
    public static final String e = "iconSelectUrl";
    public static final String f = "description";
    private final eqb_1 g;
    private final epn_2 h;

    public bkz_1(eqb_1 eqb_12) {
        this.g = eqb_12;
        this.h = epn_2.b;
    }

    public bkz_1(eqb_1 eqb_12, epn_2 epn_22) {
        this.g = eqb_12;
        this.h = epn_22;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.g.a();
        }
        if (string.equals(b)) {
            return bae.h().a("breed.role.name." + this.g.a(), new Object[0]);
        }
        if (string.equals(d)) {
            return azs_0.a().p(String.valueOf(this.g.a()));
        }
        if (string.equals(e)) {
            return azs_0.a().o();
        }
        if (string.equals(f)) {
            if (this.h == epn_2.b) {
                return "";
            }
            return bae.h().a("breed.role.desc." + this.h.s() + "." + this.g.a(), new Object[0]);
        }
        return false;
    }

    public int a() {
        return this.g.a();
    }

    public eqb_1 b() {
        return this.g;
    }
}

