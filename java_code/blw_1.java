/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blW
 */
public class blw_1
implements ajh_1 {
    public static final String a = "breedInfo";
    public static final String b = "enabled";
    private final epn_2 d;
    private boolean e;
    private int f;

    public blw_1(epn_2 epn_22) {
        this.d = epn_22;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public boolean a() {
        return this.e;
    }

    public void a(int n) {
        this.f = n;
    }

    public int b() {
        return this.f;
    }

    @Override
    public String[] d() {
        return b_;
    }

    public epn_2 c() {
        return this.d;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return bkt_1.a().a(this.d.s());
        }
        if (string.equals(b)) {
            return this.e;
        }
        return null;
    }
}

