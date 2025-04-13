/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGL
 */
@fpw_0
public class cgl_0 {
    public static final String PACKAGE = "wakfu.emotesInventory";

    public static void onClick(fcb_2 fcb_22) {
        if (fcb_22.f() != frd_0.j || fcb_22.x() != 1) {
            return;
        }
        bhx bhx2 = (bhx)fcb_22.j();
        if (!bhx2.n()) {
            return;
        }
        if (fcb_22.r()) {
            dhy dhy2 = new dhy();
            dhy2.b(fcb_22.j());
            dhy2.c(-1);
            dhy2.d(-1);
            dhy2.a(true);
            dhy2.a_(19194);
            add_2.b().a(dhy2);
        } else {
            dfx dfx2 = new dfx();
            dfx2.a(bhx2);
            add_2.b().a(dfx2);
        }
    }

    public static void overSmiley(fcb_2 fcb_22) {
        fis_1.a().a("overSmiley", fcb_22.j());
    }
}

