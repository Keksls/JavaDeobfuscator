/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzd
 */
public class bzd_2
implements ajh_1 {
    public static final String a = "name";
    private static final String d = "guildBlazon";
    private static final String e = "isOpen";
    private static final String f = "isGuildOnly";
    public static final String[] b = new String[]{"name", "guildBlazon", "isOpen", "isGuildOnly"};
    private bxo_1 g;
    private esm_2 h;

    public bzd_2(esm_2 esm_22) {
        this.h = esm_22;
        this.g = new bxo_1(new eqd_2(this.h.c()));
    }

    @Override
    public String[] d() {
        return b;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (d.equals(string)) {
            return bxp_1.a().a(this.g);
        }
        if (a.equals(string)) {
            return this.a();
        }
        if (e.equals(string)) {
            return this.f();
        }
        if (f.equals(string)) {
            return this.g();
        }
        return null;
    }

    public String a() {
        return this.h.b();
    }

    public long b() {
        return this.h.a();
    }

    public long c() {
        return this.h.g();
    }

    public long e() {
        return this.h.c();
    }

    public boolean f() {
        return this.h.d();
    }

    public boolean g() {
        return this.h.f();
    }
}

