/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.regex.Pattern;

/*
 * Renamed from aHk
 */
class ahk_1
extends ahc_2 {
    private final String a;
    private final String b;
    private static final abj_2<String, Pattern> c = new abj_2(0x100000);
    private static final abj_2<Long, Boolean> d = new abj_2(0x100000);

    public ahk_1(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    boolean a(HashMap<String, Object> hashMap) {
        String string = (String)hashMap.get(this.a);
        if (string != null) {
            long l;
            long l2 = (long)string.hashCode() & 0xFFFFFFFFL;
            long l3 = l2 << 32 | (l = (long)this.b.hashCode() & 0xFFFFFFFFL);
            Boolean bl = d.a(l3);
            if (bl != null) {
                return bl;
            }
            Pattern pattern = c.a(this.b);
            if (pattern == null) {
                pattern = Pattern.compile(this.b);
                c.a(this.b, pattern);
            }
            bl = pattern.matcher(string).matches();
            d.a(l3, bl);
        }
        return false;
    }
}

