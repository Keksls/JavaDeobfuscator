/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from Ug
 */
public abstract class ug_0<Item extends ts_0>
implements Uo {
    protected static final Logger a = Logger.getLogger(ug_0.class);

    @Override
    public final void a(Uk uk) {
        switch (uk.b()) {
            case a: 
            case b: {
                um_0 um_02 = (um_0)uk;
                this.a(um_02.c());
                return;
            }
            case c: 
            case d: {
                um_0 um_03 = (um_0)uk;
                this.b(um_03.c());
                return;
            }
            case e: {
                um_0 um_04 = (um_0)uk;
                this.a(um_04.c(), um_04.e());
                return;
            }
        }
        throw new UnsupportedOperationException("Event " + uk.b() + " non pris en compte par ce visiteur");
    }

    protected void a(Item Item) {
    }

    protected void b(Item Item) {
    }

    protected void a(Item Item, short s2) {
    }
}

