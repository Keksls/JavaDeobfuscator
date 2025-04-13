/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bIn
 */
public class bin_1
extends big_1 {
    private static final Logger a = Logger.getLogger(bin_1.class);
    private long g;
    private short h;

    public bin_1(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        try {
            apb_2 apb_22 = eyS.b(stringArray[0]);
            this.g = apb_22.a(null, null, null, null);
        }
        catch (Exception exception) {
            a.error((Object)("Impossible de parser la position : " + stringArray[0]));
        }
        this.h = Short.parseShort(stringArray[1]);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12 == null) {
            a.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        aff_1 aff_12 = apb_2.a(this.g);
        ble_1.E().B();
        ble_1.E().a(aff_12.d(), aff_12.e(), aff_12.f(), this.h, exk_22, true);
        this.a(exk_22.a());
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public eyx_1 f() {
        return eyx_1.l;
    }
}

