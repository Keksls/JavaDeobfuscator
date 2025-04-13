/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkE
 */
public class bke_2
implements ajh_1 {
    public static final String a = "templateLayoutId";
    public static final String b = "imageUrl";
    public static final String d = "text1";
    public static final String e = "text2";
    public static final String[] f = new String[]{"templateLayoutId", "imageUrl", "text1", "text2"};
    private final int g;
    private final short h;
    private final int i;
    private final short j;
    private final String k;
    private final String l;

    public bke_2(int n, short s2, int n2, short s3) {
        this.g = n;
        this.h = s2;
        this.i = n2;
        this.j = s3;
        String string = bae.h().a(67, (long)n, new Object[0]);
        String[] stringArray = string.split("\\#{2,}");
        this.k = stringArray[0];
        this.l = stringArray.length > 1 ? stringArray[1] : "";
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.j;
        }
        if (string.equals(b)) {
            return azs_0.a().v(this.i);
        }
        if (string.equals(d)) {
            return this.k;
        }
        if (string.equals(e)) {
            return this.l;
        }
        return null;
    }
}

