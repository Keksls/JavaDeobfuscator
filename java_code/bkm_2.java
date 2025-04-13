/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkM
 */
public class bkm_2
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "desc";
    public static final String d = "iconUrl";
    public static final String[] e = new String[]{"name", "desc", "iconUrl"};
    private final fho f;

    public bkm_2(fho fho2) {
        this.f = fho2;
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a("battleground.gameplay.name." + this.f.a(), new Object[0]);
        }
        if (string.equals(b)) {
            return bae.h().a("battleground.gameplay.description." + this.f.a(), new Object[0]);
        }
        if (string.equals(d)) {
            return azs_0.a().o(String.valueOf(this.f.a()));
        }
        return null;
    }

    public fho a() {
        return this.f;
    }
}

