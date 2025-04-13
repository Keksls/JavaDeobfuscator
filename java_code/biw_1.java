/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bIW
 */
public class biw_1
extends big_1 {
    private static final Logger g = Logger.getLogger(biw_1.class);
    long h;
    protected int a;

    biw_1(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        int n = stringArray.length;
        this.a = n > 0 ? Integer.parseInt(stringArray[0]) : 0;
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.f(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12 == null) {
            g.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        if (bvz_2.a.a()) {
            return false;
        }
        this.c(exk_22);
        return true;
    }

    private void c(exk_2 exk_22) {
        fyt_0.a().a(frb_0.p, true);
        bix_0 bix_02 = new bix_0(this, exk_22);
        dei.a().a(bix_02);
        fta_0.getInstance().addEventListener(frd_0.B, bix_02, true);
    }

    void d(exk_2 exk_22) {
        this.a(exk_22.a());
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putLong(this.h);
        return true;
    }

    @Override
    public int b() {
        return super.b() + 8;
    }

    @Override
    public void c() {
    }

    @Override
    public eyx_1 f() {
        return eyx_1.I;
    }
}

