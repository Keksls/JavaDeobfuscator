/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from fyr
 */
public class fyr_0
implements azj_2 {
    private static final Logger a = LoggerFactory.getLogger(fyr_0.class);
    private final String b;
    private final Float c;

    public fyr_0(fzb fzb2) {
        this(fzb2.a());
    }

    public fyr_0(String string) {
        this.b = string;
        this.c = null;
    }

    public fyr_0(fzb fzb2, float f2) {
        this(fzb2.a(), f2);
    }

    public fyr_0(String string, float f2) {
        this.b = string;
        this.c = Float.valueOf(f2);
    }

    public azj_2 h() {
        azj_2 azj_22;
        azj_2 azj_23 = azj_22 = this.c != null ? fys_0.a.a(this.b, this.c.floatValue()) : fys_0.a.a(this.b);
        if (azj_22 == null) {
            a.error("Unable to retrieve color with following name {} in {}", (Object)this.b, fys_0.class);
        }
        return azj_22;
    }

    @Override
    public int a() {
        return this.h().a();
    }

    @Override
    public int b() {
        return this.h().b();
    }

    @Override
    public int c() {
        return this.h().c();
    }

    @Override
    public int d() {
        return this.h().d();
    }

    @Override
    public int e() {
        return this.h().e();
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    @Nullable
    public String g() {
        return this.b;
    }

    public String toString() {
        return this.w();
    }

    public String A() {
        return this.b;
    }

    public Float B() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fyr_0)) {
            return false;
        }
        fyr_0 fyr_02 = (fyr_0)object;
        if (!fyr_02.a(this)) {
            return false;
        }
        Float f2 = this.c;
        Float f3 = fyr_02.c;
        if (f2 == null ? f3 != null : !((Object)f2).equals(f3)) {
            return false;
        }
        String string = this.b;
        String string2 = fyr_02.b;
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    protected boolean a(Object object) {
        return object instanceof fyr_0;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        Float f2 = this.c;
        n2 = n2 * 59 + (f2 == null ? 43 : ((Object)f2).hashCode());
        String string = this.b;
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }
}

