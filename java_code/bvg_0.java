/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bVG
 */
public class bvg_0
extends bva_0 {
    public bvg_0(asp_1 asp_12) {
        super(asp_12);
    }

    @Override
    public void b() {
        throw new UnsupportedOperationException("Pas de vid\u00e9o sur un \u00e9l\u00e9ment de texte");
    }

    @Override
    public fso a(fso fso2, bVw bVw2) {
        fso fso3 = super.a(fso2, bVw2);
        ate_1 ate_12 = (ate_1)this.a;
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setEnableAWTFont(true);
        fuk_02.setElementMap(fso2.getElementMap());
        fuk_02.c(anj_2.a(ate_12.f()).toString());
        fuk_02.setExpandable(false);
        fuk_02.onChildrenAdded();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fid_12.setAlign(frk_0.i);
        fuk_02.setLayoutData(fid_12);
        fso3.add(fuk_02);
        fso3.onChildrenAdded();
        if (ate_12.h()) {
            bVw2.a(ate_12.i(), fso3, fso2);
        }
        return fso3;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    public Object b(String string) {
        return null;
    }
}

