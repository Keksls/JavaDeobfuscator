/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import org.apache.log4j.Logger;

/*
 * Renamed from anh
 */
public class anh_0
implements anc_0 {
    private static final Logger a = Logger.getLogger(anh_0.class);
    private byte b;
    private byte c = (byte)100;

    public anh_0() {
    }

    public anh_0(arf_1 arf_12) {
        this.a(arf_12);
    }

    public anh_0(byte by, byte by2) {
        this.b = by;
        this.c = by2;
    }

    @Override
    public void a(aty_1 aty_12) {
        if (!ann_2.a(aty_12)) {
            return;
        }
        if (!aty_12.A().a()) {
            return;
        }
        abu abu2 = (abu)aty_12;
        byte by = anh_0.a(abu2);
        try {
            akr_0 akr_02 = aki_0.h().a(by, this.b);
            if (akr_02 == null) {
                a.debug((Object)"Impossible de trouver de GroundSoundData ad\u00e9quat");
                return;
            }
            if (!abu2.A().a(akr_02.a())) {
                return;
            }
            if (!ann_2.a(akr_02.a())) {
                return;
            }
            float f2 = akr_02.b() * (float)this.c / 100.0f;
            aki_0.h().a(akr_02.a(), f2, akr_02.i(), 1, -1L, -1L, abu2.az(), abu2, akr_02.e());
        }
        catch (Exception exception) {
            a.debug((Object)("soundExtension or soundPath not initialized " + exception));
        }
    }

    private static byte a(abu abu2) {
        short s2 = yz_0.b(abu2.G(), abu2.H(), abu2.I());
        DisplayedScreenElement displayedScreenElement = acs_0.b().b(abu2.G(), abu2.H(), s2, acV.c);
        if (displayedScreenElement == null) {
            return alk_1.a.a();
        }
        agD agD2 = displayedScreenElement.d().i();
        if (agD2 != null) {
            return agD2.k();
        }
        return alk_1.a.a();
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public void a(arf_1 arf_12) {
        this.b = arf_12.a();
        this.c = arf_12.a();
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a(this.b);
        gk_02.a(this.c);
    }

    public void a(byte by) {
        this.b = by;
    }

    public void b(byte by) {
        this.c = by;
    }
}

