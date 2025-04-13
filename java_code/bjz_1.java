/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.ImmutableMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJz
 */
public class bjz_1
implements ajh_1 {
    private static final String b = "isVisible";
    private static final String d = "items";
    private static final String e = "name";
    private static final String f = "title";
    public static final String[] a = new String[]{"isVisible", "items", "name", "title"};
    private static final int g = 16;
    private boolean h;
    private final List<bja_1> i = new ArrayList<bja_1>();
    private String j = "";
    private bja_1 k;

    public void a() {
        this.h = false;
        this.k = null;
        this.i.clear();
        fis_1.a().a((ajf_1)this, a);
    }

    public void a(bja_1 bja_12) {
        this.a(bja_12, (Predicate<exk_2>)((Predicate)exk_22 -> true));
    }

    public void a(bja_1 bja_12, Predicate<exk_2> predicate) {
        this.k = bja_12;
        this.i.clear();
        bmr_1 bmr_12 = bjb_1.a.g();
        exh_2 exh_22 = bja_12.a();
        this.j = exh_22.name();
        ImmutableMap<Long, exk_2> immutableMap = bmr_12.dC().a();
        for (Map.Entry entry : immutableMap.entrySet()) {
            exk_2 exk_23 = (exk_2)entry.getValue();
            if (!predicate.apply((Object)exk_23) || !this.a(bmr_12, exk_23, exh_22)) continue;
            this.i.add(new bja_1(exh_22, exk_23));
        }
        bmr_12.da().a((TObjectProcedure<exk_2>)((TObjectProcedure)exk_22 -> {
            if (!predicate.apply(exk_22)) {
                return true;
            }
            if (this.a(bmr_12, (exk_2)exk_22, exh_22)) {
                this.i.add(new bja_1(exh_22, (exk_2)exk_22));
            }
            return true;
        }));
        if (this.i.size() < 16) {
            for (int k = this.i.size(); k < 16; ++k) {
                this.i.add(new bja_1(null, null));
            }
        } else {
            int n = 0;
            while ((this.i.size() + n) % 4 != 0) {
                ++n;
            }
            for (int k = 0; k < n; ++k) {
                this.i.add(new bja_1(null, null));
            }
        }
    }

    private Predicate<exk_2> b(String string, int n, int n2) {
        return exk_22 -> {
            if (exk_22 == null) {
                return false;
            }
            if (n >= 0 && exk_22.c() < n) {
                return false;
            }
            if (n2 >= 0 && exk_22.c() > n2) {
                return false;
            }
            return string.isEmpty() || exk_22.N().toLowerCase().contains(string.toLowerCase());
        };
    }

    public void a(String string, int n, int n2) {
        this.a(this.k, this.b(string, n, n2));
    }

    private boolean a(bmr_1 bmr_12, exk_2 exk_22, exh_2 exh_22) {
        eyz_0 eyz_02 = bjb_1.a.h().e();
        return eyf_1.a(bmr_12, eyz_02, exh_22, exk_22, true) == eyr_1.a;
    }

    @Override
    public String[] d() {
        return a;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return this.h;
        }
        if (string.equals(d)) {
            return this.i;
        }
        if (string.equals(e)) {
            return this.j;
        }
        if (string.equals(f)) {
            if (this.k == null) {
                return "";
            }
            return bae.h().a(this.k.a().B, new Object[0]);
        }
        return null;
    }

    public boolean b() {
        return this.h;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public bja_1 c() {
        return this.k;
    }
}

