/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from beT
 */
public final class bet_2
implements agw_0 {
    bFW a;
    static final Logger b = Logger.getLogger(bet_2.class);

    @Override
    public String m_() {
        return bae.h().a("contentLoader.interactiveElement", new Object[0]);
    }

    public void a(YK yK) {
        this.a = new bFW();
        this.a.a(bFX.values());
        this.a.a(bfy_0.values());
        try {
            asw_2.a().a(new aSj(), new beu_2(this));
        }
        catch (Exception exception) {
            b.error((Object)"Erreur lors de la lecture du fichier de vues d'\u00e9l\u00e9ments interactifs", (Throwable)exception);
        }
        bfv_0.b().a(this.a);
        this.a = null;
        yK.b(this);
    }
}

