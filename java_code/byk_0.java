/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bYK
 */
class byk_0
implements bjj_2 {
    final /* synthetic */ akr_2[] a;
    final /* synthetic */ akx_2 b;
    final /* synthetic */ int c;
    final /* synthetic */ byj_0 d;

    byk_0(byj_0 byj_02, akr_2[] akr_2Array, akx_2 akx_22, int n) {
        this.d = byj_02;
        this.a = akr_2Array;
        this.b = akx_22;
        this.c = n;
    }

    @Override
    public void a(@NotNull aff_1 aff_12) {
        this.c(aff_12);
    }

    private void c(aff_1 aff_12) {
        this.a[0] = new akr_2(aff_12.d());
        this.a[1] = new akr_2(aff_12.e());
        this.a[2] = new akr_2(aff_12.f());
        this.a[3] = new akr_2(0);
        this.b.b(this.c);
    }

    @Override
    public void a(@NotNull biI biI2) {
        this.b(null);
    }

    @Override
    public void b(@Nullable aff_1 aff_12) {
        if (aff_12 != null) {
            this.c(aff_12);
        } else {
            this.b.c(this.c);
        }
    }
}

