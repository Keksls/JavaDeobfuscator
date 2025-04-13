/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bKF
extends bKH {
    private final faI a;
    @Nullable
    private final faI b;
    private final int d;

    public bKF(faI faI2, int n, Runnable runnable) {
        super(runnable);
        this.a = faI2;
        this.b = faI.P.get((Object)this.a);
        this.d = n;
    }

    @Override
    public bKG aV_() {
        return bKG.k;
    }

    @Override
    public void a(faC faC2) {
        fax_0 fax_02 = (fax_0)faC2;
        this.b(faC2);
        if (this.a()) {
            boolean bl = this.b != null && bky_0.a().b().m();
            fax_02.d().put(bl ? this.b : this.a, this.d);
        }
    }

    @Override
    public void b(faC faC2) {
        fax_0 fax_02 = (fax_0)faC2;
        fax_02.d().remove((Object)this.a);
        if (this.b != null) {
            fax_02.d().remove((Object)this.b);
        }
    }

    @Override
    public boolean a() {
        return this.d != -1;
    }

    @Override
    public String b() {
        return "\u2265 " + this.d + " " + bKA.a(this.a);
    }

    @Override
    public int aW_() {
        return this.a.a();
    }
}

