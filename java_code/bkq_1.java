/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkQ
 */
public class bkq_1
implements ajh_1 {
    public static final String a = "icon";
    public static final String b = "tooltip";
    public static final String[] d = new String[]{"icon", "tooltip"};
    private final bkr_1 e;
    private boolean f;

    public bkq_1(bkr_1 bkr_12) {
        this.e = bkr_12;
    }

    @Override
    public String[] d() {
        return d;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return azs_0.a().b(this.e.b(), 2);
        }
        if (b.equals(string)) {
            return bae.h().a("booster.pack.privilege.tooltip." + this.e.a(), new Object[0]);
        }
        return null;
    }

    public boolean a() {
        return this.f;
    }

    public void a(boolean bl) {
        this.f = bl;
    }
}

