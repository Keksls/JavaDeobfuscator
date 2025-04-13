/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.io.IOException;
import org.apache.log4j.Logger;

/*
 * Renamed from agY
 */
public abstract class agy_0<Partition extends agy_0>
extends XW<Partition> {
    private static final Logger p = Logger.getLogger(agy_0.class);
    private static final TLongObjectProcedure<ahm> q = new agz_0();
    private final TLongObjectHashMap<ahm> r = new TLongObjectHashMap();

    public void g() {
        this.j();
    }

    public void h() {
        this.r.forEachEntry(q);
    }

    protected void i() {
        this.r.clear();
    }

    private void j() {
        aet_0 aet_02 = aew_0.a().d((short)this.a(), (short)this.b());
        if (aet_02 == null) {
            return;
        }
        aeu_0[] aeu_0Array = aet_02.i();
        for (int k = 0; k < aeu_0Array.length; ++k) {
            aeu_0 aeu_02 = aeu_0Array[k];
            try {
                ahm ahm2 = ahm.a(aet_02, aeu_02);
                ahm2.b();
                this.a(ahm2);
                continue;
            }
            catch (IOException iOException) {
                p.error((Object)("Impossible de charger le fichier d'animation de l'\u00e9l\u00e9ment dynamic " + aeu_02), (Throwable)iOException);
                continue;
            }
            catch (Exception exception) {
                p.error((Object)("Impossible de charger l'\u00e9l\u00e9ment dynamic " + aeu_02), (Throwable)exception);
            }
        }
    }

    public void a(ahm ahm2) {
        if (this.r.containsKey(ahm2.a())) {
            p.error((Object)("Impossible d'ajouter un \u00e9l\u00e9ments interactif d'ID=" + ahm2.a() + " \u00e0 la partition " + this + " qui le contient d\u00e9j\u00e0."));
            return;
        }
        this.r.put(ahm2.a(), (Object)ahm2);
        abe_0.d().a(ahm2);
    }

    public void a(long l) {
        ahm ahm2 = (ahm)this.r.remove(l);
        if (ahm2 != null) {
            ahm2.c();
            abe_0.d().b(ahm2);
        }
    }

    public boolean a(TObjectProcedure<ahm> tObjectProcedure) {
        return this.r.forEachValue(tObjectProcedure);
    }
}

