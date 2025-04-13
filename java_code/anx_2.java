/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from anx
 */
public class anx_2
extends anq_2<anh_1<Byte>> {
    public static final String c = "playGroundSound";
    private static final akf_1[] d = new akf_1[]{new akf_1("walkType", null, akg_2.d, false), new akf_1("gain", null, akg_2.d, true)};

    public anx_2(abu abu2, LuaState luaState, Logger logger) {
        super(abu2, luaState, logger);
    }

    @Override
    public String a() {
        return c;
    }

    @Override
    public akf_1[] e() {
        return d;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    protected anh_1<Byte> b(int n) {
        byte by = (byte)this.d(0);
        if (n < 2) {
            return new anh_1<Byte>(by);
        }
        int n2 = this.d(1);
        return new anh_1<Byte>(by, n2);
    }

    @Override
    public void a(anh_1<Byte> anh_12, akx_2 akx_22) {
        Object object;
        byte by = alk_1.a.a();
        byte by2 = anh_12.h();
        int n = (int)anh_12.j();
        short s2 = yz_0.b(this.a.G(), this.a.H(), this.a.I());
        DisplayedScreenElement displayedScreenElement = acs_0.b().b(this.a.G(), this.a.H(), s2, acV.c);
        if (displayedScreenElement != null && (object = displayedScreenElement.d().i()) != null) {
            by = ((agD)object).k();
        }
        try {
            object = aki_0.h().a(by, by2);
            if (object == null) {
                this.b.debug((Object)"Impossible de trouver de GroundSoundData ad?quat");
                return;
            }
            this.a((akr_0)object, akx_22.o(), n);
        }
        catch (Exception exception) {
            this.b.debug((Object)("soundExtension or soundPath not initialized " + exception));
        }
    }

    @Override
    protected /* synthetic */ Object c(int n) {
        return this.b(n);
    }
}

