/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from agR
 */
public interface agr_0 {
    default public void a(ags_0 ags_02, ajb_1 ajb_12, ajb_1 ajb_13) {
        if (ajb_13 != null && ajb_12 != null) {
            this.b(ags_02, ajb_12);
            this.a(ags_02, ajb_13);
        } else if (ajb_13 == null) {
            this.b(ags_02, ajb_12);
        } else {
            this.a(ags_02, ajb_13);
        }
    }

    public void a(ags_0 var1, ajb_1 var2);

    public void b(ags_0 var1, ajb_1 var2);
}

