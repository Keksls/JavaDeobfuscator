/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aUZ
 */
public class auz_0
extends aVg
implements ajh_1 {
    public static final String r = "name";
    public static final String s = "characterName";
    public static final String t = "displayedName";
    public static final String u = "online";
    public static final String[] v = new String[]{"name", "characterName", "displayedName", "online"};
    public static final String w = "#";

    public auz_0(String string, String string2, boolean bl, long l) {
        super(string, string2, bl, l);
    }

    public auz_0(long l, String string, String string2) {
        super(l, string, string2);
    }

    @Override
    public Object b(String string) {
        if (string.equals(r)) {
            String string2 = this.g();
            String[] stringArray = string2.split(w);
            ani_2 ani_22 = new ani_2();
            if (stringArray.length > 1) {
                ani_22.a(azf_2.e).a().a((CharSequence)stringArray[0]).b().j().a(azf_2.q).a((CharSequence)w).a((CharSequence)stringArray[1]).j();
                return ani_22;
            }
            return ani_22.a(azf_2.e).a().a((CharSequence)string2).b().j();
        }
        if (string.equals(s)) {
            return this.j();
        }
        if (string.equals(t)) {
            String string3 = this.j();
            if (string3 != null && !string3.isEmpty()) {
                return string3 + "\n(" + this.g() + ")";
            }
            return this.g();
        }
        if (string.equals(u)) {
            return this.h();
        }
        return null;
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        ajg_1.a().a((ajf_1)this, u, t);
    }

    @Override
    public String[] d() {
        return v;
    }
}

