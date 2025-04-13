/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from RW
 */
public final class rw_0
implements rv_0 {
    private static final Logger a = Logger.getLogger(rw_0.class);

    @Override
    public void a(rs_0 rs_02) {
        a.info((Object)("Nouvelle valeur de la charac " + rs_02.p() + " : " + rs_02.a()));
    }
}

