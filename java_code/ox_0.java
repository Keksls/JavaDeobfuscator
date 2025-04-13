/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import org.apache.log4j.Logger;

/*
 * Renamed from OX
 */
public class ox_0<C extends oy_0, CF extends pa_0<C>>
implements oz_0 {
    private static final Logger a = Logger.getLogger(ox_0.class);
    private CF b;

    public CF a() {
        return this.b;
    }

    public void a(CF CF) {
        this.b = CF;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(OS oS) {
        TLongObjectIterator<OT> tLongObjectIterator = oS.b();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            OT oT = (OT)tLongObjectIterator.value();
            Object c2 = this.b.a(oT);
            try {
                c2.a();
                int n = oT.c();
                for (int k = 0; k < n; ++k) {
                    ou_0 ou_02 = oT.a(k);
                    pb_0 pb_02 = pc_0.a().a(ou_02.b());
                    if (pb_02 != null) {
                        pb_02.a(ou_02, c2);
                        continue;
                    }
                    a.warn((Object)("Impossible de trouver un ParagraphWriter pour le type " + ou_02.b()));
                }
            }
            catch (Exception exception) {
                a.warn((Object)("Probl\u00e8me \u00e0 l'export de la page : " + oT.a()));
            }
            finally {
                try {
                    c2.b();
                }
                catch (Exception exception) {
                    a.warn((Object)("Probl\u00e8me \u00e0 la fermeture de la page : " + oT.a()));
                }
            }
        }
    }
}

