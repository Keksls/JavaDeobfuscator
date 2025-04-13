/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public enum aUz implements ajh_1
{
    a("small.f", 12),
    b("little.f", 14),
    d("medium.f", 16),
    e("high.f", 18);

    public static final String f = "index";
    public static final String g = "name";
    public static final String h = "list";
    public static final String[] i;
    private final String j;
    private final int k;

    private aUz(String string2, int n2) {
        this.j = string2;
        this.k = n2;
    }

    @Override
    public String[] d() {
        return i;
    }

    @Override
    public Object b(String string) {
        if (string.equals(f)) {
            return this.ordinal();
        }
        if (string.equals(g)) {
            return this.b();
        }
        if (string.equals(h)) {
            ArrayList<String> arrayList = new ArrayList<String>();
            for (aUz aUz2 : aUz.values()) {
                arrayList.add(aUz2.b());
            }
            return arrayList;
        }
        return null;
    }

    public int a() {
        return this.k;
    }

    public String b() {
        return bae.h().a(this.j, new Object[0]);
    }

    public static aUz a(String string) {
        for (aUz aUz2 : aUz.values()) {
            if (!aUz2.b().equals(string)) continue;
            return aUz2;
        }
        return null;
    }

    static {
        i = new String[]{f, g, h};
    }
}

