/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bjD
 */
public class bjd_0
extends bjg_0 {
    private static final Logger a = Logger.getLogger(bjd_0.class);
    private final ArrayList<Rx> b;
    private final int d;
    private final int e;

    public bjd_0(efh_0 efh_02, ArrayList<Rx> arrayList, int n, int n2) {
        super(efh_02);
        this.b = arrayList;
        this.e = n;
        this.d = n2;
    }

    bjd_0(bjd_0 bjd_02) {
        super(bjd_02.c);
        this.b = bjd_02.b;
        this.d = bjd_02.d;
        this.e = bjd_02.e;
    }

    @Override
    public void a(biI biI2) {
        this.a((abz_0)biI2, true);
    }

    public void a(abz_0 abz_02, boolean bl) {
        try {
            if (bl) {
                if (abz_02 instanceof biI) {
                    ((biI)abz_02).bI().aQ();
                }
            } else {
                for (Rx rx : this.b) {
                    this.a(abz_02, rx);
                }
            }
        }
        catch (gm_0 gm_02) {
            a.error((Object)"", (Throwable)gm_02);
        }
    }

    private void a(abz_0 abz_02, Rx rx) {
        String string;
        String string2 = rx.a();
        int n = string2.indexOf(47);
        String string3 = n == -1 ? null : string2.substring(0, n);
        String string4 = biE.a(string3, Integer.parseInt(string = n == -1 ? string2 : string2.substring(n + 1)));
        if (string4 == null) {
            a.error((Object)("dossier inconnu ( +" + string3 + ") pour le chargement de l'anm " + string + " [valeurs autoris\u00e9es: equipment/, npc/, player/]"));
            return;
        }
        Anm anm = abu.c(string4);
        if (!(abz_02 instanceof biI) || ((biI)abz_02).bI().W_()) {
            abz_02.a(anm, rx.b(), null);
            return;
        }
        abz_02.a(anm, rx.b(), cg_0.c);
    }

    public int a() {
        return this.e;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bjd_0 bjd_02 = (bjd_0)object;
        if (this.d != bjd_02.d) {
            return false;
        }
        if (this.e != bjd_02.e) {
            return false;
        }
        return this.b.equals(bjd_02.b);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.b.hashCode();
        n = 31 * n + this.d;
        n = 31 * n + this.e;
        return n;
    }

    public bjd_0 b() {
        return new bjd_0(this);
    }

    public /* synthetic */ bjg_0 c() {
        return this.b();
    }
}

