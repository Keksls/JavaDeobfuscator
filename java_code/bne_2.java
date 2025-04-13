/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.display.ShowHideNameOverheadsCommand;

/*
 * Renamed from bnE
 */
final class bne_2
extends eqk_2 {
    private final sf_2 b;
    final /* synthetic */ bnh_1 a;

    bne_2(bnh_1 bnh_12, sf_2 sf_22) {
        this.a = bnh_12;
        this.b = sf_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("Les informations de compte de sont pas s\u00e9rialis\u00e9s par le client");
    }

    @Override
    public void b() {
        Object object;
        this.a.au.a(enu_0.a(this.b.c));
        bmr_1 bmr_12 = azu_0.j().k();
        if (this.a == bmr_12 && (object = azu_0.j().n()) != null) {
            ((emy)object).b(this.b.c);
        }
        this.a.au.f().clear();
        if (this.b.d != null) {
            for (int k = 0; k < this.b.d.length; ++k) {
                this.a.au.b(enw_0.a(this.b.d[k]));
            }
        }
        this.a.av = this.b.e;
        this.a.au.k().a(new ems_0(emt_0.i, this.b.f));
        object = this.a.fE();
        object.a(fhD.a(this.b.g));
        object.d(this.b.h);
        this.a.au.b(this.b.i);
        this.a.au.a(xz_0.a(this.b.j));
        if (ShowHideNameOverheadsCommand.b()) {
            dbm_0.a().b(this.a);
        }
    }
}

