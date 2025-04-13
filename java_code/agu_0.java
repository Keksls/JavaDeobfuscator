/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agU
 */
public interface agu_0
extends agr_0 {
    public boolean c(ags_0 var1, ajb_1 var2);

    @Override
    default public void a(ags_0 ags_02, ajb_1 ajb_12) {
        if (!this.c(ags_02, ajb_12)) {
            return;
        }
        this.d(ags_02, ajb_12);
    }

    @Override
    default public void b(ags_0 ags_02, ajb_1 ajb_12) {
        if (!this.c(ags_02, ajb_12)) {
            return;
        }
        this.e(ags_02, ajb_12);
    }

    public void d(ags_0 var1, ajb_1 var2);

    public void e(ags_0 var1, ajb_1 var2);
}

