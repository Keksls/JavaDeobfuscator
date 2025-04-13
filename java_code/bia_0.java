/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIa
 */
public class bia_0
implements ajh_1 {
    private static final String a = "shardSlotList";
    private static final String b = "shardsEffects";
    private static final String d = "hasShardEffects";
    private static final String e = "hasShardsSlots";
    private static final String f = "hasSublimation";
    private static final String g = "sublimationName";
    private static final String h = "hasSpecialSublimation";
    private static final String i = "specialSublimationName";
    private static final String j = "formattedSpecialSublimationName";
    private static final String k = "isEditable";
    private static final String l = "remainingCharges";
    private static final String m = "<UNKNOWN>";
    private static final String[] n = new String[]{"shardSlotList", "shardsEffects", "hasShardsSlots", "isEditable", "remainingCharges"};
    private final eZw o;
    private final List<bib_0> p = new ArrayList<bib_0>();

    public bia_0(ezr_0<bhg_0> ezr_02) {
        this.o = ezr_02.ac() ? new eZw() : eZw.a;
    }

    public bia_0(exk_2 exk_22) {
        this.o = exk_22.y() ? exk_22.C() : eZw.a;
        for (Map.Entry<Byte, eze_0> entry : this.o.c().entrySet()) {
            byte by = entry.getKey();
            eze_0 eze_02 = entry.getValue();
            this.p.add(new bib_0(by, eze_02, exk_22));
        }
    }

    @Override
    public String[] d() {
        return n;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.p;
        }
        if (string.equals(b)) {
            return this.a();
        }
        if (string.equals(d)) {
            return this.b();
        }
        if (string.equals(e)) {
            return this.o.i();
        }
        if (string.equals(k)) {
            return this.o.a();
        }
        if (string.equals(f)) {
            return this.o.m();
        }
        if (string.equals(g)) {
            Object r2 = eyo_1.g().d(this.o.l());
            if (r2 == null) {
                return m;
            }
            return ((ezr_0)r2).e();
        }
        if (string.equals(h)) {
            return this.o.o();
        }
        if (string.equals(i)) {
            Object r3 = eyo_1.g().d(this.o.n());
            if (r3 == null) {
                return m;
            }
            return ((ezr_0)r3).e();
        }
        if (string.equals(j)) {
            String string2 = bia_0.a(this.o.n());
            return string2 != null ? string2 : m;
        }
        if (string.equals(l)) {
            if (this.o == null) {
                return 0;
            }
            byte by = this.o.d();
            if (by < 0) {
                return 0;
            }
            return by;
        }
        return null;
    }

    @Nullable
    public static String a(int n) {
        if (n == 0) {
            return null;
        }
        Object r2 = eyo_1.g().d(n);
        if (r2 == null) {
            return null;
        }
        ezf_0 ezf_02 = ((ezr_0)r2).aa();
        if (ezf_02 == null) {
            return null;
        }
        exw_1 exw_12 = ezf_02.b() == ezh_0.b ? exw_1.f : exw_1.h;
        return new ani_2().i().a(bhc_0.b(exw_12)).a((CharSequence)((ezr_0)r2).e()).j().r();
    }

    private ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n = this.p.size();
        for (int k = 0; k < n; ++k) {
            arrayList.addAll(this.p.get(k).f());
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(0, bae.h().a("effectOnEquip", new Object[0]));
        }
        return arrayList;
    }

    private boolean b() {
        int n = this.p.size();
        for (int k = 0; k < n; ++k) {
            if (this.p.get(k).f().isEmpty()) continue;
            return true;
        }
        return false;
    }

    public bib_0 a(byte by) {
        return this.p.get(by);
    }

    public String toString() {
        return "ShardsDisplayer{m_shards=" + this.o + ", m_shardsSlotDisplayers=" + this.p + "}";
    }
}

