/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class bYI
implements bjj_2 {
    final /* synthetic */ akr_2[] a;
    final /* synthetic */ akx_2 b;
    final /* synthetic */ int c;
    final /* synthetic */ bYH d;

    bYI(bYH bYH2, akr_2[] akr_2Array, akx_2 akx_22, int n) {
        this.d = bYH2;
        this.a = akr_2Array;
        this.b = akx_22;
        this.c = n;
    }

    @Override
    public void a(@NotNull aff_1 aff_12) {
        this.b(aff_12);
    }

    @Override
    public void a(@NotNull biI biI2) {
        this.a[0] = new akr_2(biI2.a());
        this.b.b(this.c);
    }

    @Override
    public void b(@Nullable aff_1 aff_12) {
        this.b.c(this.c);
    }
}

