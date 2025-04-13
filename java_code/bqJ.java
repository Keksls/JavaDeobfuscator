/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bqJ
implements ahr_1 {
    private static final Logger b = Logger.getLogger(bqJ.class);
    public static final bqJ a = new bqJ();

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
            case 12292: {
                csg csg2 = (csg)adt_12;
                bpc_2 bpc_22 = bmr_12.eE();
                if (bpc_22.ac_() != 17) {
                    b.warn((Object)"Reception d'un message de contenu de r\u00e9ceptacle ne dans un contexte ne correspondant pas");
                    return false;
                }
                ((bpf_2)bpc_22).a(csg2.c());
                b.info((Object)"Contenu du r\u00e9ceptacle re\u00e7u");
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

