/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bny
 */
final class bny_1
extends eqk_2 {
    private final rm_2 b;
    final /* synthetic */ bnh_1 a;

    bny_1(bnh_1 bnh_12, rm_2 rm_22) {
        this.a = bnh_12;
        this.b = rm_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bnh_1.fv().error((Object)"[NATION] Pas de s\u00e9rialization de la nation ID dans le client pour l'instant", (Throwable)new UnsupportedOperationException());
    }

    @Override
    public void b() {
        ebe_0 ebe_02;
        Object object;
        if (this.a.bo()) {
            bmp_1.a().a((blx_1)this.a, this.b.c);
            fis_1.a().a((ajf_1)this.a, "characterListNationIconUrl", "characterListNation");
            fis_1.a().a((ajf_1)cwu_0.h().j(), "characterListNationIconUrl", "characterListNation");
        }
        if (this.a.fE().n() != this.b.c) {
            object = fbc_0.a.a(this.b.c);
            if (object != null) {
                ((faX)object).c(this.a);
            } else {
                bnh_1.fw().error((Object)("[NATION] On essaye d'ajouter le joueur " + this.a.a_() + " \u00e0 une nation inconnue du manager, nationId : " + this.b.c));
            }
        }
        if (this.a.bo() && this.a.cD && !euv_2.a.b(this.a.U_(), this.a.a_()) && ((Optional)(object = bhh_1.a(end_0.b))).isPresent() && (ebe_02 = (ebe_0)((Optional)object).get()).a() == this.a.a_() && ebe_02.b() != this.a.bM()) {
            ebe_02.a(this.b.c);
        }
    }
}

