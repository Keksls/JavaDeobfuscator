/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bIo
 */
final class bio_0
extends big_1 {
    private static final Logger a = Logger.getLogger(bio_0.class);
    long g;

    bio_0(int n) {
        super(n);
    }

    @Override
    public void a(String ... stringArray) {
    }

    @Override
    public boolean a(exk_2 exk_22) {
        if (bvz_2.a.a()) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        fhy_0 fhy_02 = fhx_0.a(exk_22.a(), bmr_12);
        if (fhy_02.b() == fhz_0.f) {
            a.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        this.a(fhy_02);
        return true;
    }

    private void a(fhy_0 fhy_02) {
        fyt_0.a().a(frb_0.p, true);
        bip_0 bip_02 = new bip_0(this, fhy_02);
        dei.a().a(bip_02);
        fta_0.getInstance().addEventListener(frd_0.B, bip_02, true);
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        super.a(byteBuffer);
        byteBuffer.putLong(this.g);
        return true;
    }

    @Override
    public int b() {
        return 8;
    }

    @Override
    public void c() {
    }

    @Override
    protected boolean d() {
        return true;
    }

    @Override
    public eyx_1 f() {
        return eyx_1.N;
    }

    String a(ezg_0 ezg_02) {
        switch (ezg_02) {
            case a: {
                return "sublimation.confirmation";
            }
            case j: {
                return "sublimation.confirmation.withWarning";
            }
            case f: {
                return "error.sublimation.unshardedItem";
            }
            case d: {
                return "error.sublimation.stackedItem";
            }
            case c: {
                return "error.sublimation.badItem";
            }
            case g: {
                return "error.sublimation.noMatch";
            }
            case i: {
                return "error.sublimation.sublimatedWithSameItem";
            }
            case h: 
            case b: 
            case e: {
                return "error.sublimation.badSublimationItem";
            }
            case k: {
                return "error.sublimation.noMatchRarity";
            }
            case l: {
                return "error.sublimation.itemWithOldRune";
            }
        }
        return "error.sublimation.unknownResult";
    }
}

