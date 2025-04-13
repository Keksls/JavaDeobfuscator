/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bwK
 */
public class bwk_2
implements ajh_1,
Comparable<bwk_2> {
    public static final String a = "quantity";
    public static final String b = "isEnutrofPurseLoot";
    public static final String[] d = new String[]{"quantity", "isEnutrofPurseLoot"};
    private final short e;
    private final bjw_1 f;
    private final short g;
    private final exw_1 h;
    private final boolean i;

    public bwk_2(int n, short s2) {
        this.e = s2;
        this.f = (bjw_1)eyo_1.g().d(n);
        this.g = this.f.G();
        this.h = this.f.M();
        this.i = false;
    }

    @Override
    public String[] d() {
        return d;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e;
        }
        if (string.equals(b)) {
            return this.i;
        }
        return this.f.b(string);
    }

    public bjw_1 a() {
        return this.f;
    }

    public int a(@NotNull bwk_2 bwk_22) {
        if (bwk_22 == null) {
            return -1;
        }
        int n = exw_1.n().compare(this.h, bwk_22.h);
        if (n != 0) {
            return n;
        }
        return Integer.signum(bwk_22.g - this.g);
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bwk_2)object);
    }
}

