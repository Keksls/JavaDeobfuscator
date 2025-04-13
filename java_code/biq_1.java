/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bIQ
 */
public class biq_1
extends big_1 {
    private static final Logger a = Logger.getLogger(biq_1.class);
    private int g;
    long h;

    public biq_1(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        this.g = Integer.valueOf(stringArray[0]);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.da().i(exk_22.a()) == null) {
            a.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        bir_1 bir_12 = new bir_1(this, exk_22);
        if (!bht.i.a(this.g, (bhv)bir_12)) {
            a.error((Object)("[ItemAction] Impossible d'utiliser l'Emote " + this.g));
            return false;
        }
        return true;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putLong(this.h);
        return false;
    }

    @Override
    public int b() {
        return super.b() + 8;
    }

    @Override
    public void c() {
        this.h = -1L;
    }

    @Override
    public eyx_1 f() {
        return eyx_1.n;
    }
}

