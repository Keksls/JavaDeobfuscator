/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bQb
 */
public class bqb_0
implements ahr_1 {
    private static final Logger b = Logger.getLogger(bqb_0.class);
    public static final bqb_0 a = new bqb_0();

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        b.trace((Object)"Frame de Browsing ajout\u00e9e");
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        b.trace((Object)"Frame de Browsing retir\u00e9e");
    }

    @Override
    public boolean a(adt_1 adt_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        switch (adt_12.a()) {
            case 13199: {
                cyg_2 cyg_22 = (cyg_2)adt_12;
                bpc_2 bpc_22 = bmr_12.eE();
                if (bpc_22.ac_() != 21) {
                    b.warn((Object)"[STORAGE_BOX] Reception d'un message de contenu dans un contexte ne correspondant pas");
                    return false;
                }
                fiv_0 fiv_02 = ((bpj_2)bpc_22).a(cyg_22.b());
                ddi_0.d().a(fiv_02);
                b.info((Object)"[STORAGE_BOX]  Contenu re\u00e7u");
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }
}

