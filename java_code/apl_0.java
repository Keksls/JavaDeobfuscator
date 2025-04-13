/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;
import java.util.List;

/*
 * Renamed from aPL
 */
class apl_0
extends apk_0<eHV, fil_0> {
    final /* synthetic */ aph_0 c;

    apl_0(aph_0 aph_02) {
        this.c = aph_02;
        super(aph_02);
    }

    @Override
    protected boolean b() {
        return true;
    }

    @Override
    protected boolean a() {
        return false;
    }

    protected eHV b(efh_0 efh_02, So so, Su su, Su su2, aff_1 aff_12, List<efi_0> list) {
        eHV eHV2 = (eHV)super.a(efh_02, so, su, su2, aff_12, list);
        eHV2.j(null);
        return eHV2;
    }

    @Override
    protected boolean a(eHV eHV2) {
        return eHV2.aI();
    }

    @Override
    protected boolean b(eHV eHV2) {
        return eHV2.aJ();
    }

    @Override
    public void a(blx_1 blx_12, aff_1 aff_12, efh_0 efh_02, short s2, List<efi_0> list) {
        LinkedList<efi_0> linkedList = new LinkedList<efi_0>(list);
        linkedList.remove(linkedList.size() - 1);
        this.a(blx_12, aff_12, efh_02, s2, list, linkedList);
    }

    @Override
    protected /* synthetic */ sd_0 a(efh_0 efh_02, So so, Su su, Su su2, aff_1 aff_12, List list) {
        return this.b(efh_02, so, su, su2, aff_12, list);
    }
}

