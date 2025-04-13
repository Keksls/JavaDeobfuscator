/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;

/*
 * Renamed from eFY
 */
public abstract class efy_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Modifie la valeur de la caract\u00e9ristique dans 1-n \u00e9l\u00e9ments tir\u00e9s au hasard \u00e0 la cr\u00e9ation de l'item", new eFu("Valeur", eFx.b), new eFu("Nombre d'\u00e9l\u00e9ments", eFx.c)));
    private final ArrayList<eGH> w = new ArrayList();

    @Override
    public aqr_2 c_() {
        return v;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        efi_0 efi_02 = (efi_0)this.k();
        if (!(efi_02 instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)efi_02;
        if (!exk_22.ak()) {
            return;
        }
        HashSet<efa_0> hashSet = exk_22.b(this.bt_());
        if (hashSet == null) {
            return;
        }
        for (efa_0 efa_02 : hashSet) {
            eGH eGH2 = new eGH(this.a(efa_02));
            eGH2.b(this.m);
            eGH2.b(this.f);
            eGH2.a(this.e);
            eGH2.j(true);
            eGH2.a((efh_0)this.c);
            eGH2.b(sd_02, bl);
            eGH2.P = true;
            this.w.add(eGH2);
        }
    }

    protected abstract eps_0 a(efa_0 var1);

    @Override
    public void al() {
        for (eGH eGH2 : this.w) {
            eGH2.al();
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void z() {
        super.z();
        this.w.clear();
    }
}

