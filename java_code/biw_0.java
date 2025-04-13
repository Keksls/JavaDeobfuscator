/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bIw
 */
public class biw_0
extends big_1 {
    private static final Logger a = Logger.getLogger(biw_0.class);

    public biw_0(int n) {
        super(n);
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
    public boolean a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        return false;
    }

    @Override
    public void a(String[] stringArray) {
    }

    @Override
    public void c() {
    }

    @Override
    public eyx_1 f() {
        return eyx_1.O;
    }
}

