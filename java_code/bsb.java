/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bsb
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "level";
    public static final String d = "jobLevel";
    public static final String e = "jobName";
    public static final String f = "mpEnabled";
    public static final String g = "ignored";
    public static final String h = "fee";
    public static final String i = "itsMe";
    public static final String j = "inSameGuild";
    public static final String[] k = new String[]{"name", "level", "jobLevel", "jobName", "mpEnabled", "ignored", "fee", "itsMe", "inSameGuild"};
    @NotNull
    private final bsa l;
    private final int m;
    private final boolean n;
    @NotNull
    private eco_0 o;
    @NotNull
    private final ece_0 p;

    public bsb(@NotNull bsa bsa2, int n, boolean bl, @NotNull eco_0 eco_02) {
        this.l = bsa2;
        this.m = n;
        this.n = bl;
        this.o = eco_02;
        this.p = new ebu_0();
        this.p.a(this.l.e());
    }

    @Override
    public String[] d() {
        return k;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (Strings.isNullOrEmpty((String)string)) {
            return null;
        }
        switch (string) {
            case "name": {
                return this.l.a(((bvx_0)ans_0.D().h()).m());
            }
            case "level": 
            case "jobLevel": {
                return this.l.d();
            }
            case "jobName": {
                return this.j();
            }
            case "mpEnabled": {
                return this.a();
            }
            case "ignored": {
                return this.n;
            }
            case "fee": {
                return this.i();
            }
            case "itsMe": {
                return this.l.g();
            }
            case "inSameGuild": {
                return this.l.f();
            }
        }
        return null;
    }

    public boolean a() {
        return !this.n && !this.l.g();
    }

    private int i() {
        return this.l.g() ? 0 : this.p.a(this.o, this.l.f());
    }

    private String j() {
        if (ecn_0.a.a(this.m) == null) {
            return bae.h().a("unknown", new Object[0]);
        }
        return bae.h().a(43, (long)this.m, new Object[0]);
    }

    public void a(@NotNull eco_0 eco_02) {
        this.o = eco_02;
        fis_1.a().a((ajf_1)this, h);
    }

    public String b() {
        return this.l.a();
    }

    @NotNull
    public bsa c() {
        return this.l;
    }

    public int e() {
        return this.m;
    }

    public boolean f() {
        return this.n;
    }

    @NotNull
    public eco_0 g() {
        return this.o;
    }

    @NotNull
    public ece_0 h() {
        return this.p;
    }
}

