/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class bPK
extends bPH {
    public static final String e = "deckKey";
    public static final String[] f = new String[]{"deckSelectedActiveSpells", "deckSelectedPassiveSpells", "deckKey"};
    private final int g;
    private final fiO h;
    private final fiz<bpl_0> i;

    public bPK(int n, fiO fiO2, bmr_1 bmr_12) {
        this.g = n;
        this.h = fiO2;
        this.i = bmr_12.eU().i();
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(e)) {
            return fiM.a(this.h);
        }
        return super.b(string);
    }

    @Override
    protected List<Integer> a() {
        return this.h.d();
    }

    @Override
    protected List<Integer> b() {
        return this.h.f();
    }

    @Override
    @Nullable
    protected bpl_0 a(int n) {
        return (bpl_0)this.i.c(n);
    }

    public boolean e() {
        bmr_1 bmr_12 = cZI.D();
        return this.h.a(bmr_12 != null ? bmr_12 : azu_0.j().k());
    }

    public boolean a(bmr_1 bmr_12) {
        return this.h.a(bmr_12);
    }

    public fiO f() {
        return this.h;
    }

    public int g() {
        return this.g;
    }

    @Override
    public String[] d() {
        return f;
    }
}

