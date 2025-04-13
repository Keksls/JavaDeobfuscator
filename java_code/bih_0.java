/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIh
 */
public class bih_0
extends big_1
implements bjs_2 {
    private static final Logger a = Logger.getLogger(bih_0.class);
    long g;
    private boolean h;

    public bih_0(int n) {
        super(n);
    }

    @Override
    public void a(String ... stringArray) {
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().n().u(), exk_22.a());
        if (bmr_12 == null) {
            a.error((Object)("[ItemAction] Trying to start an account mimi symbic action with an item we don't have " + exk_22));
            return false;
        }
        if (this.h) {
            return false;
        }
        cyt_0 cyt_02 = cyt_0.a();
        if (!fpm_0.b().q("inventoryDialog")) {
            cyt_02.g();
        }
        this.a(exk_22, bmr_12, cyt_02);
        return true;
    }

    private void a(exk_2 exk_22, bmr_1 bmr_12, cyt_0 cyt_02) {
        fyt_0.a().a(frb_0.p, true);
        bii_0 bii_02 = new bii_0(this, exk_22, bmr_12, cyt_02);
        cyt_02.a(true);
        cyt_02.a(() -> this.a(bii_02));
        dei.a().a(bii_02);
        fta_0.getInstance().addEventListener(frd_0.B, bii_02, true);
        this.h = true;
    }

    static ezr_0<?> c(exk_2 exk_22) {
        if (exk_22.l() == 0) {
            return exk_22.T();
        }
        bjw_1 bjw_12 = bhb_0.d().a(exk_22.l());
        if (bjw_12 == null) {
            return exk_22.T();
        }
        return bjw_12;
    }

    void a(fdc_2 fdc_22) {
        this.h = false;
        fyt_0.a().c();
        fta_0.getInstance().removeEventListener(frd_0.B, fdc_22, true);
        dei.a().b(fdc_22);
    }

    @Override
    public boolean b(exk_2 exk_22) {
        return super.b(exk_22);
    }

    @Override
    public eyx_1 f() {
        return eyx_1.Q;
    }

    @Override
    public void c() {
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putLong(this.g);
        return true;
    }

    @Override
    public int b() {
        return super.b() + 8;
    }

    @Override
    public boolean a(@Nullable bmr_1 bmr_12, @Nullable ezr_0<?> ezr_02) {
        if (ezr_02 == null) {
            return true;
        }
        List<ft_1> list = bol_1.a(ezr_02.F().h());
        return bol_1.b(ezr_02.n(), list.toArray(new ft_1[0]));
    }
}

