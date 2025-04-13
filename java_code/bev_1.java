/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from beV
 */
public final class bev_1
implements agw_0 {
    private static final Logger a = Logger.getLogger(bev_1.class);
    private static final bev_1 b = new bev_1();
    private boolean c = false;

    public static bev_1 a() {
        return b;
    }

    private bev_1() {
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.interactiveElementTemplates", new Object[0]);
    }

    public void a(YK yK) {
        try {
            asw_2.a().a(new aSk(), new bew_1(this));
        }
        catch (Exception exception) {
            a.error((Object)"Erreur lors de la lecture du fichier de vues d'\u00e9l\u00e9ments interactifs", (Throwable)exception);
        }
        yK.b(this);
    }

    byte[] a(aSk aSk2) {
        ArrayList<aff_1> arrayList = new ArrayList<aff_1>();
        for (asl_0 asl_02 : aSk2.s()) {
            arrayList.add(new aff_1(asl_02.a(), asl_02.b(), asl_02.c()));
        }
        qq_0 qq_02 = new qq_0(aSk2.e(), aSk2.f(), aSk2.g(), aSk2.h(), aSk2.i(), aSk2.j(), aSk2.k(), aSk2.l(), aSk2.m(), aSk2.n(), aSk2.o(), arrayList, aSk2.p(), aSk2.t(), aSk2.r(), aSk2.q());
        return qq_02.d();
    }
}

