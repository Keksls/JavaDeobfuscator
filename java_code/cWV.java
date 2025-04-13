/*
 * Decompiled with CFR 0.152.
 */
class cWV
implements fzu {
    private boolean b = true;
    final /* synthetic */ fvk_0 a;

    cWV(fvk_0 fvk_02) {
        this.a = fvk_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (this.b) {
            this.b = false;
            return true;
        }
        fyy_0 fyy_02 = ((fyb_0)fzs2.e()).getElementMap();
        if (fyy_02 != null && "characterSheetDialog".equals(fyy_02.c())) {
            boolean bl = fis_1.a().c("displayAllCharacteristics");
            if (bl) {
                this.a.setY(this.a.getY() - 400);
            } else {
                this.a.setY(this.a.getY() + 400);
            }
        }
        return true;
    }
}

