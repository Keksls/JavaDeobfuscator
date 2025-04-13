/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bNk
 */
public class bnk_0
implements tv_0<exx_2, wf_2> {
    protected static final Logger a = Logger.getLogger(bnk_0.class);
    public static final bnk_0 b = new bnk_0();

    @Override
    public bni_0 a(wf_2 wf_22) {
        bni_0 bni_02 = new bni_0();
        if (bni_02.b(wf_22)) {
            return bni_02;
        }
        a.error((Object)("Erreur \u00e0 la d\u00e9s\u00e9rialisation d'un rawItem d'inventaire de protecteur (itemRefId=" + wf_22.a.b + ")"));
        return null;
    }
}

