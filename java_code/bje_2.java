/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bJe
 */
public class bje_2
extends big_1 {
    private static final Logger a = Logger.getLogger(bje_2.class);

    public bje_2(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.da().i(exk_22.a()) == null) {
            a.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        this.a(exk_22.a());
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public eyx_1 f() {
        return eyx_1.d;
    }
}

