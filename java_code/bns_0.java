/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNs
 */
public class bns_0
implements ajh_1 {
    public static final String a = "typeName";
    public static final String b = "victories";
    public static final String d = "defeats";
    public static final String e = "matchDesc";
    public static final String f = "fullMatchDesc";
    private final fgX g;
    private fgZ h;

    public bns_0(fgX fgX2, fgZ fgZ2) {
        this.g = fgX2;
        this.h = fgZ2;
    }

    public void a(fgZ fgZ2) {
        this.h = fgZ2;
        fis_1.a().a((ajf_1)this, b, d, e, f);
    }

    public void a() {
        fis_1.a().a((ajf_1)this, b, d, e, f);
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.e();
        }
        if (b.equals(string)) {
            return this.c();
        }
        if (d.equals(string)) {
            return this.b();
        }
        if (f.equals(string)) {
            return this.a(true);
        }
        if (e.equals(string)) {
            return this.a(false);
        }
        return null;
    }

    private int b() {
        return this.h.b(this.g);
    }

    private int c() {
        return this.h.c(this.g);
    }

    private String e() {
        return bae.h().a("matchType." + this.g.ordinal(), new Object[0]);
    }

    private String a(boolean bl) {
        ani_2 ani_22 = new ani_2();
        if (bl) {
            ani_22.a((CharSequence)this.e()).a((CharSequence)bae.h().a("colon", new Object[0]));
        }
        ani_22.i().a(azf_2.j).a((CharSequence)bae.h().a(b, this.c())).j();
        ani_22.a((CharSequence)" / ");
        ani_22.a(azf_2.h).a((CharSequence)bae.h().a(d, this.b()));
        return ani_22.r();
    }
}

