/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
import java.util.ArrayList;
import javax.inject.Inject;

/*
 * Renamed from bxn
 */
public class bxn_2
implements ajh_1,
csc_1 {
    public static final String a = "iconUrl";
    public static final String b = "description";
    public static final String d = "isAvailable";
    public static final String e = "isUnknown";
    public static final String f = "dimension";
    public static final String g = "stack";
    private final ArrayList<efh_0> h = new ArrayList();
    private final boolean i;
    private int j = 0;
    private final fjf_2 k = new fjf_2(32, 32);

    @Inject
    public bxn_2() {
        this(null, false);
    }

    public bxn_2(boolean bl) {
        this(null, bl);
    }

    public bxn_2(efh_0 efh_02) {
        this(efh_02, false);
    }

    public bxn_2(efh_0 efh_02, boolean bl) {
        this.h.clear();
        if (efh_02 != null) {
            this.h.add(efh_02);
        }
        this.i = bl;
    }

    public efh_0 a() {
        if (this.h.isEmpty()) {
            return null;
        }
        return this.h.get(0);
    }

    public void a(efh_0 efh_02) {
        this.h.clear();
        if (efh_02 != null) {
            this.h.add(efh_02);
        }
        fis_1.a().a((ajf_1)this, a, b);
    }

    public void b() {
        ++this.j;
    }

    public void a(int n, int n2) {
        this.k.setSize(n, n2);
        fis_1.a().a((ajf_1)this, f);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            efh_0 efh_02 = this.a();
            if (efh_02 != null) {
                return azs_0.a().a("timePointBonusIconsPath", "defaultIconPath", eox_2.a.a(efh_02.i()));
            }
        } else {
            if (string.equals(b)) {
                if (this.i) {
                    return bae.h().a("fight.timePointBar.unknownBonus", new Object[0]);
                }
                if (this.h.isEmpty()) {
                    return bae.h().a("fight.timePointBar.noBonus", new Object[0]);
                }
                StringBuilder stringBuilder = new StringBuilder();
                ArrayList<String> arrayList = eDi.a(new eDr(this.h, 0, 1, true, eDk.b, 0));
                boolean bl = true;
                for (String string2 : arrayList) {
                    if (!bl) {
                        stringBuilder.append("\n");
                    } else {
                        bl = false;
                    }
                    stringBuilder.append(string2);
                }
                return stringBuilder.toString();
            }
            if (string.equals(e)) {
                return this.i;
            }
            if (string.equals(d)) {
                return this.j != 0;
            }
            if (string.equals(g)) {
                return this.j;
            }
            if (string.equals(f)) {
                return this.k;
            }
        }
        return null;
    }
}

