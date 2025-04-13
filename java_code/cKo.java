/*
 * Decompiled with CFR 0.152.
 */
class cKo
implements fzu {
    final /* synthetic */ fso a;

    cKo(fso fso2) {
        this.a = fso2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (((fyb_0)fzs2.e()).hasInParentHierarchy(this.a)) {
            return false;
        }
        this.a.setVisible(false);
        cKl.l = null;
        fis_1.a().a("selectedBuilding", (Object)null);
        fta_0.getInstance().removeEventListener(frd_0.C, this, true);
        return false;
    }
}

