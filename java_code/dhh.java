/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class dhh
implements ajh_1 {
    public static final String a = "text";
    public static final String b = "iconUrl";
    public static final String d = "guildIconUrl";
    public static final String e = "overIconsUrl";
    public static final String f = "smileyDescriptorLibrary";
    public static final String g = "isDead";
    public final String[] h = new String[]{"text", "iconUrl", "overIconsUrl"};
    private final List<String> i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final bxj_1 n;
    private final boolean o;

    dhh(String string, String string2, String string3, String string4, List<String> list, bxj_1 bxj_12, boolean bl) {
        this.l = string;
        this.m = string2;
        this.j = string3;
        this.k = string4;
        this.i = list;
        this.n = bxj_12;
        this.o = bl;
    }

    public String a() {
        return this.l;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            if (fis_1.a().c("isAdmin") && this.m != null) {
                if (this.l != null) {
                    return String.format("%s%n%s", this.l, this.m);
                }
                return this.m;
            }
            return this.l;
        }
        if (string.equals(d)) {
            return this.j;
        }
        if (string.equals(b)) {
            return this.k;
        }
        if (string.equals(e)) {
            return this.i;
        }
        if (string.equals(f)) {
            return this.n;
        }
        if (string.equals(g)) {
            return this.o;
        }
        return null;
    }
}

