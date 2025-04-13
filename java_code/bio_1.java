/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bIO
 */
public class bio_1
extends big_1 {
    private static final Logger a = Logger.getLogger(bio_1.class);
    private int g;

    public bio_1(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        this.g = Integer.valueOf(stringArray[0]);
    }

    public int g() {
        return this.g;
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12 == null) {
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
        return eyx_1.H;
    }
}

