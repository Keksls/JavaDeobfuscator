/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bPV
implements ajh_1,
exs_1 {
    private final int f;
    private final exk_2 g;
    private final int h;
    private boolean i;
    private boolean j;
    public static final String a = "reward";
    public static final String b = "quantity";
    public static final String d = "selected";
    public static final String e = "canBeSelected";

    public bPV(int n, exk_2 exk_22, int n2) {
        this.f = n;
        this.g = exk_22;
        this.h = n2;
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d, e};
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "reward": {
                return this.g;
            }
            case "quantity": {
                return this.h;
            }
            case "selected": {
                return this.i;
            }
            case "canBeSelected": {
                return this.j;
            }
        }
        return null;
    }

    public int a() {
        return this.f;
    }

    public boolean b() {
        return this.i;
    }

    public void c() {
        this.i = !this.i;
        fis_1.a().a((ajf_1)this, d, e);
    }

    public void a(boolean bl) {
        if (bl == this.b()) {
            return;
        }
        this.i = bl;
        fis_1.a().a((ajf_1)this, d, e);
    }

    public boolean e() {
        return this.j;
    }

    public void b(boolean bl) {
        if (bl == this.j) {
            return;
        }
        this.j = bl;
        fis_1.a().a((ajf_1)this, e);
    }

    @Override
    public exk_2 h() {
        return this.g;
    }
}

