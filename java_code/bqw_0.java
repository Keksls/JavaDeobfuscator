/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bQW
 */
public abstract class bqw_0
extends fju {
    private static final Logger b = Logger.getLogger(bqw_0.class);

    @Override
    protected void a(fjp_0 fjp_02) {
        switch (fjp_02) {
            case d: {
                bQG.a();
                bQG.a(107, new Object[0]);
                break;
            }
            case j: {
                aUh.a("error.heroCantAccessToThisWorld", new Object[0]);
                break;
            }
            default: {
                b.error((Object)("Erreur " + fjp_02 + " non g\u00e9r\u00e9e sur un transporteur " + this.a()));
            }
        }
    }

    public abstract String a(bFN var1);

    @Nullable
    public abstract String b(bFN var1);

    public abstract boolean a(bmr_1 var1, bFN var2);
}

