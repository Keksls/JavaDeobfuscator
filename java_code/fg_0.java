/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from Fg
 */
public final class fg_0 {
    private fg_0() {
    }

    public static void a(gh_0 gh_02, List<Integer> list) {
        int n = 0;
        int n2 = list.size();
        for (Integer n3 : list) {
            if (n3 <= n) continue;
            n = n3;
        }
        if (n < 255) {
            gh_02.a((byte)1);
            gh_02.a(n2);
            for (Integer n3 : list) {
                gh_02.a(n3.byteValue());
            }
            return;
        }
        if (n < 65535) {
            gh_02.a((byte)2);
            gh_02.a(n2);
            for (Integer n3 : list) {
                gh_02.a(n3.shortValue());
            }
            return;
        }
        if (n >= Integer.MAX_VALUE) {
            throw new IllegalStateException("trop de donn\u00e9e");
        }
        gh_02.a((byte)4);
        gh_02.a(n2);
        for (Integer n3 : list) {
            gh_02.a(n3);
        }
    }
}

