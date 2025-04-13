/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZX
 */
class czx_0
implements ans_1 {
    final /* synthetic */ cZW a;

    czx_0(cZW cZW2) {
        this.a = cZW2;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("interactiveDialogDialog")) {
            if (this.a.e != null) {
                cmv cmv2 = new cmv();
                cmv2.b(this.a.e.c());
                azu_0.j().K().c(cmv2);
            }
            azu_0.j().b(cZW.d());
        }
    }
}

