/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bJa
 */
public class bja_2
extends big_1 {
    private static final Logger a = Logger.getLogger(bja_2.class);
    private int g;
    private int h;

    public bja_2(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        if (stringArray.length != 2) {
            a.error((Object)"[LD] Mauvais nombre de param\u00e8tres sur une action d'item");
            return;
        }
    }

    @Override
    public boolean a(exk_2 exk_22) {
        if (!this.g()) {
            return false;
        }
        fyt_0.a().a(frb_0.l, true);
        bjb_2 bjb_22 = new bjb_2(this);
        dei.a().a(bjb_22);
        fta_0.getInstance().addEventListener(frd_0.B, bjb_22, true);
        if (exk_22 != null) {
            if (azu_0.j().c(dcv.i)) {
                azu_0.j().b(dcv.i);
            } else {
                dcv.i.a(exk_22);
                dcv.i.d();
                azu_0.j().a(dcv.i);
            }
        }
        return true;
    }

    private boolean g() {
        bvc_2 bvc_22 = bvz_2.a.b();
        return bvc_22 == null;
    }

    public void a(exk_2 exk_22, int n, int n2) {
        dcv.i.i();
        this.g = n;
        this.h = n2;
        this.a(exk_22.a());
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putInt(this.g);
        byteBuffer.putInt(this.h);
        return true;
    }

    @Override
    public int b() {
        return super.b() + 4 + 4;
    }

    @Override
    public void c() {
        this.g = 0;
        this.h = 0;
    }

    @Override
    public eyx_1 f() {
        return eyx_1.y;
    }
}

