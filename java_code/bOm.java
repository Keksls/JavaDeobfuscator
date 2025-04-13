/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bOm
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "item";
    public static final String d = "description";
    public static final String e = "level";
    public static final String f = "isComplete";
    private final bOk g;
    private final bjw_1 h;

    public bOm(bOk bOk2) {
        this.g = bOk2;
        this.h = (bjw_1)eyo_1.g().d(this.g.c());
    }

    public bOk a() {
        return this.g;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a(15, (long)this.g.c(), new Object[0]);
        }
        if (string.equals(b)) {
            return this.h;
        }
        if (string.equals(d)) {
            return bae.h().a(143, (long)this.g.a(), new Object[0]);
        }
        if (string.equals(e)) {
            return bae.h().a("levelShort.custom", this.g.b());
        }
        if (string.equals(f)) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (evl_2.a(bmr_12.R(), this.g.c()) > 0) {
                return true;
            }
            ewx_2 ewx_22 = (ewx_2)bmr_12.a(ewl_1.a);
            return ewx_22.a(this.g.c()) != null;
        }
        return null;
    }
}

