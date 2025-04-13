/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bJi
 */
public class bji_2
implements ahr_1 {
    private static final Logger d = Logger.getLogger(bji_2.class);
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    private static final bji_2 e = new bji_2();
    private static final String f = "APSTarget";
    private static final float[] g = new float[]{1.0f, 1.0f, 1.0f, 0.6f};
    private DisplayedScreenElement h;
    private bjj_2 i;
    private biI j;
    private byte k;

    private bji_2() {
    }

    public void a(byte by) {
        this.k = by;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        try {
            aii_0.a().b(f);
        }
        catch (Exception exception) {
            d.error((Object)"Erreur durant la cr\u00e9ation d'un layer sur le HighLightManager");
        }
        fyt_0.a().a(frb_0.s, true);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (this.i != null) {
            aff_1 aff_12 = this.h == null ? null : new aff_1(this.h.G(), this.h.H(), this.h.I());
            this.i.b(aff_12);
            this.i = null;
        }
        aii_0.a().e(f);
        aii_0.a().c(f);
        fyt_0.a().c();
        this.k = 0;
        this.h = null;
        if (this.j != null) {
            this.j.bM();
            this.j = null;
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        aNF aNF2 = (aNF)ans_0.D().c();
        switch (adt_12.a()) {
            case 19751: {
                dhL dhL2 = (dhL)adt_12;
                abz_0 abz_02 = aNF2.v();
                if (abz_02 instanceof biI) {
                    biI biI2 = (biI)abz_02;
                    biI2.bL();
                    this.j = biI2;
                    DisplayedScreenElement displayedScreenElement = acs_0.b().d(biI2.G(), biI2.H(), biI2.I(), acV.b);
                    if (displayedScreenElement != this.h) {
                        if (displayedScreenElement != null) {
                            aii_0.a().e(f);
                            aii_0.a().a(displayedScreenElement.j(), f);
                            aii_0.a().d(f).a(g);
                        }
                        this.h = displayedScreenElement;
                    }
                } else if (this.j != null) {
                    this.j.bM();
                    this.j = null;
                } else {
                    ArrayList<DisplayedScreenElement> arrayList = ans_0.D().c().a((float)dhL2.r(), (float)dhL2.s(), 0.0f, acj.a);
                    DisplayedScreenElement displayedScreenElement = null;
                    if (arrayList != null) {
                        for (int k = 0; k < arrayList.size(); ++k) {
                            DisplayedScreenElement displayedScreenElement2 = arrayList.get(k);
                            if (!yz_0.j(displayedScreenElement2.G(), displayedScreenElement2.H(), displayedScreenElement2.I())) continue;
                            displayedScreenElement = displayedScreenElement2;
                            break;
                        }
                    }
                    if (displayedScreenElement != this.h) {
                        if (displayedScreenElement != null) {
                            aii_0.a().e(f);
                            aii_0.a().a(displayedScreenElement.j(), f);
                            aii_0.a().d(f).a(g);
                        }
                        this.h = displayedScreenElement;
                    }
                }
                return false;
            }
            case 16119: {
                dhL dhL3 = (dhL)adt_12;
                if (dhL3.o()) {
                    Object object;
                    abz_0 abz_03 = aNF2.v();
                    if ((this.k == 2 || this.k == 0) && abz_03 instanceof biI && this.i != null) {
                        object = (biI)abz_03;
                        this.i.a((biI)object);
                        this.i = null;
                    }
                    if ((this.k == 1 || this.k == 0) && this.i != null) {
                        object = agz.a(ans_0.D().c(), dhL3.r(), dhL3.s(), true);
                        this.i.a((aff_1)object);
                        this.i = null;
                    }
                }
                azu_0.j().b(this);
            }
        }
        return false;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public static bji_2 a() {
        return e;
    }

    public void a(bjj_2 bjj_22) {
        this.i = bjj_22;
    }
}

